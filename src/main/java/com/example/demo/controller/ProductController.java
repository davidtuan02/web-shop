package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Product;
import com.example.demo.models.ResponseObject;
import com.example.demo.repositories.ProductRepository;

@RestController
@RequestMapping(path = "/fashionshop/v1/product")
public class ProductController {

	@Autowired //nhung'/inject JpaRepositoy vao ProductController de sd cac ham cua JpaRepo
	private ProductRepository productRepository;	
	
	//sort
	  private static class MyComparator implements Comparator<String> {
		    @Override
		    public int compare(String o1, String o2) {
		      if (Character.isDigit(o1.charAt(0))) {
		        if (Character.isDigit(o2.charAt(0))) {
		          //replace here with "return o1.compareTo(o2)" for original
		          int i1 = getFirstDigits(o1);
		          int i2 = getFirstDigits(o2);
		          if (i1 == i2) return o1.compareTo(o2);
		          return i1 - i2;
		        } else {
		          return 1;
		        }
		      }
		      if (Character.isDigit(o2.charAt(0))) return -1;
		      return o1.compareTo(o2);
		    }
		  }
	  private static int getFirstDigits(String from) {
		    int i = 0;
		    for (i = 0 ; i < from.length() ; i++) {
		      if (!Character.isDigit(from.charAt(i))) {
		        return Integer.parseInt(from.substring(0, i));
		      }
		    }
		    if (i > 0) return Integer.parseInt(from.substring(0, i));
		    throw new IllegalArgumentException("No digits to parse, should not happen");
		  }
		
	
	@GetMapping("/getDetail/{id}")
	ResponseEntity<ResponseObject> getDetailProduct(@PathVariable Long id) {
		Optional<Product> foundProduct = productRepository.findById(id);
		if(foundProduct.isPresent()) {
			return ResponseEntity.status(HttpStatus.OK).body(
					new ResponseObject("Success", "Xem chi tiết thành công", foundProduct)
					);
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
					new ResponseObject("Fail", "Không tìm thấy sản phẩm có id: " + id, "")
					);
		}
	}
	
	
	@GetMapping("/getAllNotDeleted")
	ResponseEntity<ResponseObject> getAllNotDeletedProducts() {
		List<Product> listProduct = productRepository.findByIsDeleted(false);
		if(listProduct.size() > 0) {
			return ResponseEntity.status(HttpStatus.OK).body(
					new ResponseObject("Success", "Xem thành công: ", listProduct)
					); 	
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
					new ResponseObject("Fail", "Không có sản phẩm", "")
					); 	
		}
	}
	

	
	@GetMapping("/getAll")
	ResponseEntity<ResponseObject> getAllProducts() {
		List<Product> listProduct = productRepository.findAll();
		if(listProduct.size() > 0) {
			return ResponseEntity.status(HttpStatus.OK).body(
					new ResponseObject("Success", "Xem thành công", listProduct)
					);
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
					new ResponseObject("Fail", "Chưa có sản phẩm nào", "")
					);
		}
		
	}
	
	
	@DeleteMapping("/delete/{id}")
	ResponseEntity<ResponseObject> deleteProduct(@PathVariable Long id) {
		boolean check = productRepository.existsById(id);
		if(check) {
			productRepository.deleteById(id);
			return ResponseEntity.status(HttpStatus.OK).body(
					new ResponseObject("Success", "Xoá sản phẩm thành công", "")
					);
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
					new ResponseObject("Fail", "Không tìm thấy sản phẩm có id: " + id, "")
					);
		}
	}
	
	
	@PostMapping("/add")
	ResponseEntity<ResponseObject> addProduct( @RequestBody Product newProduct ) {
//		List<Product> checkProductName = productRepository.findByProductName(newProduct.getProductName().trim())
//		List<Product> checkSize = productRepository.findBySize(newProduct.getSize().trim());
//		List<Product> checkPrice = productRepository.findByPrice(newProduct.getPrice());
//		List<Product> checkDesc = productRepository.findByDesc(newProduct.getDesc().trim());
		List<Product> checkProductCode = productRepository.findByProductCode(newProduct.getProductCode().trim());
		if(checkProductCode.size() > 0) {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(
					new ResponseObject("Fail", "Trùng sản phẩm", "")
					); 		
		}
		else {
			return ResponseEntity.status(HttpStatus.OK).body(
					new ResponseObject("Success", "Thêm sản phẩm thành công", productRepository.save(newProduct))
					); 		
		}
	}
	
	@PutMapping("/update/{id}")
	ResponseEntity<ResponseObject> updateProduct(@PathVariable Long id, @RequestBody Product updateProduct ) {
		Product foundProduct = productRepository.findById(id).map((product) -> {
			product.setProductName(updateProduct.getProductName());
			product.setSize(updateProduct.getSize());
			product.setPrice(updateProduct.getPrice());	
			product.setProductCode(updateProduct.getProductCode());
			product.setDesc(updateProduct.getDesc());
//			product.setIsDeleted(updateProduct.getIsDeleted());
			return productRepository.save(product);
		}).orElseGet(() -> {
			updateProduct.setId(id);
			return productRepository.save(updateProduct);
		});
		
		
		return ResponseEntity.status(HttpStatus.OK).body(
				new ResponseObject("Success", "Cập nhật sản phẩm thành công: " + id, foundProduct)
				); 			
	}
	
//	//add trung sp
//	@PutMapping("/add")
//	ResponseEntity<ResponseObject> addTrungProduct( @RequestBody Product newProduct ) {
////		List<Product> checkProductName = productRepository.findByProductName(newProduct.getProductName().trim());
////		List<Product> checkSize = productRepository.findBySize(newProduct.getSize().trim());
////		List<Product> checkPrice = productRepository.findByPrice(newProduct.getPrice());
////		List<Product> checkDesc = productRepository.findByDesc(newProduct.getDesc().trim());
////		List<Product> checkProductCode = productRepository.findByProductCode(newProduct.getProductCode().trim());
//		
//		
//		Optional<Product> oldProduct = productRepository.findByProductCode(newProduct.getProductCode()).map((product) -> {
//			product.setAmount(oldProduct.getAmount() + newProduct.getAmount());
//			return productRepository.save(product);
//		});
//		return ResponseEntity.status(HttpStatus.OK).body(
//				new ResponseObject("Success", "Thêm sản phẩm thành công", oldProduct)
//				); 	
//	}
	
	
	//Khong xoa vinh vien-> put
	@PutMapping("/deleteTemporary/{id}")
	ResponseEntity<ResponseObject> deleteTemporaryProduct(@PathVariable Long id ) {
		Optional<Product> deletedProduct = productRepository.findById(id).map((product) -> {
			product.setIsDeleted(true);
			return productRepository.save(product);
		});
		
		if(deletedProduct.isPresent()) {
			return ResponseEntity.status(HttpStatus.OK).body(
					new ResponseObject("Success", "Xoá sản phẩm thành công", deletedProduct)
					); 	
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
					new ResponseObject("Fail", "Không tìm thấy sản phẩm có id: " + id , "")
					); 	
		}	
	}	
	
	@GetMapping("/getByPriceUp")
	ResponseEntity<ResponseObject> getByPriceUp() {
		List<Product> listProduct = productRepository.findAll();
		List<Double> priceUp= new ArrayList<Double>();
		List<Product> listUp= new ArrayList<Product>();
		for(Product p : listProduct) {
			priceUp.add(p.getPrice());
		}
		Collections.sort(priceUp);
		for(int i=0; i<priceUp.size(); i++) {
			listUp.addAll(productRepository.findByPrice(priceUp.get(i)));
		}
		return ResponseEntity.status(HttpStatus.OK).body(
				new ResponseObject("Success", "Lọc theo giá thành công", listUp)
				); 	
		
	}
	
	
	@GetMapping("/getByPriceDown")
	ResponseEntity<ResponseObject> getByPriceDown() {
		List<Product> listProduct = productRepository.findAll();
		List<Double> priceDown= new ArrayList<Double>();
		List<Product> listDown= new ArrayList<Product>();
		for(Product p : listProduct) {
			priceDown.add(p.getPrice());
		}
		 Collections.sort(priceDown, (o1, o2) -> o2.compareTo(o1));
		for(int i=0; i<priceDown.size(); i++) {
			listDown.addAll(productRepository.findByPrice(priceDown.get(i)));
		}
		return ResponseEntity.status(HttpStatus.OK).body(
				new ResponseObject("Success", "Lọc theo giá thành công", listDown)
				); 	
		
	}
	
	@GetMapping("/getByAtoZ")
	ResponseEntity<ResponseObject> getByAtoZ() {
		List<Product> listProduct = productRepository.findAll();
		List<String> aToZ = new ArrayList<String>();
		List<Product> listAtoZ= new ArrayList<Product>();
		for(Product p: listProduct) {
			aToZ.add(p.getProductName());
		}
		Collections.sort(aToZ, new MyComparator());
		for(int i=0; i<aToZ.size(); i++) {
			listAtoZ.addAll(productRepository.findByProductName(aToZ.get(i)));
		}
	return ResponseEntity.status(HttpStatus.OK).body(
			new ResponseObject("Success", "Lọc từ A đến Z thành công", listAtoZ)
			); 	
}
	
	
	@GetMapping("/getByZtoA")
	ResponseEntity<ResponseObject> getByZtoA() {
		List<Product> listProduct = productRepository.findAll();
		List<String> aToZ = new ArrayList<String>();
		List<String> zToA = new ArrayList<String>();
		List<Product> listZtoA= new ArrayList<Product>();
		for(Product p: listProduct) {
			aToZ.add(p.getProductName());
		}
		Collections.sort(aToZ, new MyComparator());
		for(int i=0; i<aToZ.size(); i++) {
			zToA.add(aToZ.get(aToZ.size()-1-i));
			listZtoA.addAll(productRepository.findByProductName(zToA.get(i)));
		}
	return ResponseEntity.status(HttpStatus.OK).body(
			new ResponseObject("Success", "Lọc từ A đến Z thành công", listZtoA)
			); 	
}
	
	@GetMapping("/getBySize/{size}")
	ResponseEntity<ResponseObject> getBySize(@PathVariable String size) {
		List<Product> list = productRepository.findBySize(size);
		if(list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
					new ResponseObject("Fail", "Không tìm thấy sản phẩm có size: " + size , "")
					);
		}
		else return ResponseEntity.status(HttpStatus.OK).body(
				new ResponseObject("Success", "Lọc theo size thành công", list)
				); 
	}
	
}

