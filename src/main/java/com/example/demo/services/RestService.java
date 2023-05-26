package com.example.demo.services;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.models.Product;


@Service
public class RestService {

	//khoi tao restTemplate
	private final RestTemplate restTemplate;
	
	//build restTemplate
	public RestService(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}
	
//	//get chuoi JSON
//	public String getPostPlainJSON() {
//		String url = "localhost:8081/fashionshop/v1/getDetailProduct";
//		return this.restTemplate.getForObject(url, String.class);
//	}
	
	//get model 
	public Product[] getProductAsObject() {
		String url = "localhost:8081/fashionshop/v1/getAllProducts";
				return this.restTemplate.getForObject(url, Product[].class);
	}
	
	//get model with param
	public Product getProductWithUrlParam() {
		String url = "localhost:8081/fashionshop/v1/getDetailProduct/{id}";
		return this.restTemplate.getForObject(url, Product.class, 1);
	}
	
	//response handing
	public Product getProductWithResponseHandling() {
		String url = "localhost:8081/fashionshop/v1/getDetailProduct/{id}";
		ResponseEntity<Product> response = this.restTemplate.getForEntity(url, Product.class, 1);
		if(response.getStatusCode() == HttpStatus.OK) {
			return response.getBody();
		}
		else return null;
	}
	
	public Product getProductWithCustomHeaders() {
	    String url = "localhost:8081/fashionshop/v1/getDetailProduct/{id}";

	    // create headers
	    HttpHeaders headers = new HttpHeaders();
	    // set `accept` header
	    headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
	    // set custom header
	    headers.set("x-request-source", "desktop");

	    // build the request
	    HttpEntity request = new HttpEntity(headers);

	    // use `exchange` method for HTTP call
	    ResponseEntity<Product> response = this.restTemplate.exchange(url, HttpMethod.GET, request, Product.class, 1);
	    if(response.getStatusCode() == HttpStatus.OK) {
	        return response.getBody();
	    } else {
	        return null;
	    }
	}
	
	//-------------------------POST-------------------------------

	
	public Product createProduct() {
		String url = "localhost:8081/fashionshop/v1/addProduct";
		//create header
		HttpHeaders headers = new HttpHeaders();
		//set content-type header
		headers.setContentType(MediaType.APPLICATION_JSON);
		//set accept header
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		
		Map<String, Object> map = new HashMap<>();
		map.put("productName", "Ao so mi nam");
		map.put("size", "L");
		map.put("color", "Den");
		map.put("price", "700.000");
		map.put("desc", "");
		map.put("isDeleted", "false");
		
		//build the request
		HttpEntity<Map<String, Object>> entity = new HttpEntity<>(map, headers);
		
		//send post-request
		ResponseEntity<Product> response = this.restTemplate.postForEntity(url, entity, Product.class);
		
		//check
		if(response.getStatusCode() == HttpStatus.CREATED) {
			return response.getBody();
		}
		else return null;
		
	}
	
	//---------------------PUT-------------------
	
	public Product updatePostWithResponse() {
	    String url = "localhost:8081/fashionshop/v1/updateProduct/{id}";

	    // create headers
	    HttpHeaders headers = new HttpHeaders();
	    // set `content-type` header
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    // set `accept` header
	    headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

	    // create a post object
	    Product product = new Product("Chan vay", "TML20", "M", 500000.0, "", 1 , "https://sixdo.vn/images/products/2023/large/HHN_2469.jpg");

	    // build the request
	    HttpEntity<Product> entity = new HttpEntity<>(product, headers);

	    // send PUT request to update post with `id` 10
	    ResponseEntity<Product> response = this.restTemplate.exchange(url, HttpMethod.PUT, entity, Product.class, 10);

	    // check response status code
	    if (response.getStatusCode() == HttpStatus.OK) {
	        return response.getBody();
	    } else {
	        return null;
	    }
	}
	
	//------------------DELETE
	
	public void deleteProduct() {
		String url = "localhost:8081/fashionshop/v1/deleteProduct/{id}";
		//send Delete request
		this.restTemplate.delete(url);
	}
	
	
	//HEAD request
//	public HttpHeaders retrieveHeaders() {
//		String url = "localhost:8081/fashionshop/v1";
//
//	    // send HEAD request
//	    return this.restTemplate.headForHeaders(url);
//	}
	
	
	//get all supported operations
//	public Set<HttpMethod> allowedOperations() {
//	    String url = "https://jsonplaceholder.typicode.com/posts";
//
//	    // send HEAD request
//	    return this.restTemplate.optionsForAllow(url);
//	}
	
	
	
	//error handling
//	public String unknownRequest() {
//	    try {
//	        String url = "https://jsonplaceholder.typicode.com/404";
//	        return this.restTemplate.getForObject(url, String.class);
//	    } catch (HttpStatusCodeException ex) {
//	        // raw http status code e.g `404`
//	        System.out.println(ex.getRawStatusCode());
//	        // http status code e.g. `404 NOT_FOUND`
//	        System.out.println(ex.getStatusCode().toString());
//	        // get response body
//	        System.out.println(ex.getResponseBodyAsString());
//	        // get http headers
//	        HttpHeaders headers= ex.getResponseHeaders();
//	        System.out.println(headers.get("Content-Type"));
//	        System.out.println(headers.get("Server"));
//	    }
//
//	    return null;
//	}
	
//	public void setTimeOut(RestTemplateBuilder restTemplateBuilder) {
//	    // set connection and read timeouts
//	    this.restTemplate = restTemplateBuilder
//	            .setConnectTimeout(Duration.ofSeconds(500))
//	            .setReadTimeout(Duration.ofSeconds(500))
//	            .build();
//	}
	
	
	
}
