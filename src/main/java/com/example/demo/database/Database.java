package com.example.demo.database;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.models.Account;
import com.example.demo.models.Product;
import com.example.demo.repositories.AccountRepository;
import com.example.demo.repositories.CustomerRepository;
import com.example.demo.repositories.ProductRepository;


@Configuration
public class Database {

    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository, CustomerRepository customerRepository, AccountRepository accountRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {    
//             Product p1 = new Product("Áo thun trơn ICY Summer MS 57E3866", "Nam1S", "S", 699000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/24/de6fd6ca02f3f9f57103c80145a0910f.JPG"); productRepository.save(p1);
//             Product p2 = new Product("Áo thun trơn ICY Summer MS 57E3866", "Nam1M", "M", 699000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/24/de6fd6ca02f3f9f57103c80145a0910f.JPG"); productRepository.save(p2);
//             Product p3 = new Product("Áo thun trơn ICY Summer MS 57E3866", "Nam1L", "L", 699000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/24/de6fd6ca02f3f9f57103c80145a0910f.JPG"); productRepository.save(p3);
//             Product p4 = new Product("Áo thun trơn ICY Summer MS 57E3866", "Nam1XL", "XL", 699000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/24/de6fd6ca02f3f9f57103c80145a0910f.JPG"); productRepository.save(p4);
//             Product p5 = new Product("Áo thun trơn phối túi MS 57E3868", "Nam2S", "S", 699000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/05/09/dea4275eb86fbd32c1a090330865342f.JPG"); productRepository.save(p5);
//             Product p6 = new Product("Áo thun trơn phối túi MS 57E3868", "Nam2M", "M", 699000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/05/09/dea4275eb86fbd32c1a090330865342f.JPG"); productRepository.save(p6);
//             Product p7 = new Product("Áo thun trơn phối túi MS 57E3868", "Nam2L", "L", 699000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/05/09/dea4275eb86fbd32c1a090330865342f.JPG"); productRepository.save(p7);
//             Product p8 = new Product("Áo thun trơn phối túi MS 57E3868", "Nam2XL", "XL", 699000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/05/09/dea4275eb86fbd32c1a090330865342f.JPG"); productRepository.save(p8);
//             Product p9 = new Product("Áo sơ mi cổ ve", "Nam3S", "S", 999000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/17/17aff187715c19747fdd88176883ad72.jpg"); productRepository.save(p9);
//             Product p10 = new Product("Áo sơ mi cổ ve", "Nam3M", "M", 999000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/17/17aff187715c19747fdd88176883ad72.jpg"); productRepository.save(p10);
//             Product p11 = new Product("Áo sơ mi cổ ve", "Nam3L", "L", 999000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/17/17aff187715c19747fdd88176883ad72.jpg"); productRepository.save(p11);
//             Product p12 = new Product("Áo sơ mi cổ ve", "Nam3XL", "XL", 999000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/17/17aff187715c19747fdd88176883ad72.jpg"); productRepository.save(p12);
//             Product p13 = new Product("Quần short regular fit cạp chun", "Nam4S", "S", 790000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/24/31885c31154db33156694f6c9d22f199.JPG"); productRepository.save(p13);
//             Product p14 = new Product("Quần short regular fit cạp chun", "Nam4M", "M", 790000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/24/31885c31154db33156694f6c9d22f199.JPG"); productRepository.save(p14);
//             Product p15 = new Product("Quần short regular fit cạp chun", "Nam4L", "L", 790000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/24/31885c31154db33156694f6c9d22f199.JPG"); productRepository.save(p15);
//             Product p16 = new Product("Quần short regular fit cạp chun", "Nam4XL", "XL", 790000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/24/31885c31154db33156694f6c9d22f199.JPG"); productRepository.save(p16);
//             Product p17 = new Product("Áo thun slimfit", "Nam5S", "S", 699000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/17/52d567f38b05a47f411278b7e0ed303c.jpg"); productRepository.save(p17);
//             Product p18 = new Product("Áo thun slimfit", "Nam5M", "M", 699000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/17/52d567f38b05a47f411278b7e0ed303c.jpg"); productRepository.save(p18);
//             Product p19 = new Product("Áo thun slimfit", "Nam5L", "L", 699000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/17/52d567f38b05a47f411278b7e0ed303c.jpg"); productRepository.save(p19);
//             Product p20 = new Product("Áo thun slimfit", "Nam5XL", "XL", 699000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/17/52d567f38b05a47f411278b7e0ed303c.jpg"); productRepository.save(p20);
//             Product p21 = new Product("Quần short color cạp chun", "Nam6S", "S", 850000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/17/698460c87e5768410cc11c2256cc1dd8.jpg"); productRepository.save(p21);
//             Product p22 = new Product("Quần short color cạp chun", "Nam6M", "M", 850000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/17/698460c87e5768410cc11c2256cc1dd8.jpg"); productRepository.save(p22);
//             Product p23 = new Product("Quần short color cạp chun", "Nam6L", "L", 850000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/17/698460c87e5768410cc11c2256cc1dd8.jpg"); productRepository.save(p23);
//             Product p24 = new Product("Quần short color cạp chun", "Nam6XL", "XL", 850000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/17/698460c87e5768410cc11c2256cc1dd8.jpg"); productRepository.save(p24);
//             Product p25 = new Product("Áo sơ mi trắng basic", "Nam7S", "S", 1290000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/17/fc916dfa163c9bc6221763b36a60c4ce.jpg"); productRepository.save(p25);
//             Product p26 = new Product("Áo sơ mi trắng basic", "Nam7M", "M", 1290000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/17/fc916dfa163c9bc6221763b36a60c4ce.jpg"); productRepository.save(p26);
//             Product p27 = new Product("Áo sơ mi trắng basic", "Nam7L", "L", 1290000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/17/fc916dfa163c9bc6221763b36a60c4ce.jpg"); productRepository.save(p27);
//             Product p28 = new Product("Áo sơ mi trắng basic", "Nam7XL", "XL", 1290000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/17/fc916dfa163c9bc6221763b36a60c4ce.jpg"); productRepository.save(p28);
//             Product p29 = new Product("Áo sơ mi thêu logo Metagent", "Nam8S", "S", 1390000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/24/6c330a36e5dfa35b4c7d9d6e9da9e805.JPG"); productRepository.save(p29);
//             Product p30 = new Product("Áo sơ mi thêu logo Metagent", "Nam8M", "M", 1390000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/24/6c330a36e5dfa35b4c7d9d6e9da9e805.JPG"); productRepository.save(p30);
//             Product p31 = new Product("Áo sơ mi thêu logo Metagent", "Nam8L", "L", 1390000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/24/6c330a36e5dfa35b4c7d9d6e9da9e805.JPG"); productRepository.save(p31);
//             Product p32 = new Product("Áo sơ mi thêu logo Metagent", "Nam8XL", "XL", 1390000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/24/6c330a36e5dfa35b4c7d9d6e9da9e805.JPG"); productRepository.save(p32);
//             Product p33 = new Product("Quần short denim", "Nam9S", "S", 990000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/24/496b7c4a72b6784d1ff375887cdefd11.JPG"); productRepository.save(p33);
//             Product p34 = new Product("Quần short denim", "Nam9M", "M", 990000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/24/496b7c4a72b6784d1ff375887cdefd11.JPG"); productRepository.save(p34);
//             Product p35 = new Product("Quần short denim", "Nam9L", "L", 990000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/24/496b7c4a72b6784d1ff375887cdefd11.JPG"); productRepository.save(p35);
//             Product p36 = new Product("Quần short denim", "Nam9XL", "XL", 990000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/24/496b7c4a72b6784d1ff375887cdefd11.JPG"); productRepository.save(p36);
//             Product p37 = new Product("Áo sơ mi họa tiết kẻ", "Nam10S", "S", 1350000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/01/05/62e29b299ef73a574dec507c729ffb00.JPG"); productRepository.save(p37);
//             Product p38 = new Product("Áo sơ mi họa tiết kẻ", "Nam10M", "M", 1350000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/01/05/62e29b299ef73a574dec507c729ffb00.JPG"); productRepository.save(p38);
//             Product p39 = new Product("Áo sơ mi họa tiết kẻ", "Nam10L", "L", 1350000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/01/05/62e29b299ef73a574dec507c729ffb00.JPG"); productRepository.save(p39);
//             Product p40 = new Product("Áo sơ mi họa tiết kẻ", "Nam10XL", "XL", 1350000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/01/05/62e29b299ef73a574dec507c729ffb00.JPG"); productRepository.save(p40);

             
//             Product p41 = new Product("Áo sơ mi lụa dáng suông", "Nu1S", "S", 1150000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/12/22/f5c1b1790cd2d5b441e76f092e5bf31a.jpg"); productRepository.save(p41);
//             Product p42 = new Product("Áo sơ mi lụa dáng suông", "Nu1M", "M", 1150000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/12/22/f5c1b1790cd2d5b441e76f092e5bf31a.jpg"); productRepository.save(p42);
//             Product p43 = new Product("Áo sơ mi lụa dáng suông", "Nu1L", "L", 1150000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/12/22/f5c1b1790cd2d5b441e76f092e5bf31a.jpg"); productRepository.save(p43);
//             Product p44 = new Product("Áo sơ mi lụa dáng suông", "Nu1XL", "XL", 1150000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/12/22/f5c1b1790cd2d5b441e76f092e5bf31a.jpg"); productRepository.save(p44);
//             Product p45 = new Product("Áo sơ mi Tencel dây rút eo", "Nu2S", "S", 990000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/08/01/d825cab89dae2a88dc8b681e4b3b5ec2.jpg"); productRepository.save(p45);
//             Product p46 = new Product("Áo sơ mi Tencel dây rút eo", "Nu2M", "M", 990000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/08/01/d825cab89dae2a88dc8b681e4b3b5ec2.jpg"); productRepository.save(p46);
//             Product p47 = new Product("Áo sơ mi Tencel dây rút eo", "Nu2L", "L", 990000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/08/01/d825cab89dae2a88dc8b681e4b3b5ec2.jpg"); productRepository.save(p47);
//             Product p48 = new Product("Áo sơ mi Tencel dây rút eo", "Nu2XL", "XL", 990000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/08/01/d825cab89dae2a88dc8b681e4b3b5ec2.jpg"); productRepository.save(p48);
//             Product p49 = new Product("Quần jeans lửng gấu gấp", "Nu3S", "S", 990000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/12/13/a17e235ce01112282760d06b6d52ffae.jpg"); productRepository.save(p49);
//             Product p50 = new Product("Quần jeans lửng gấu gấp", "Nu3M", "M", 990000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/12/13/a17e235ce01112282760d06b6d52ffae.jpg"); productRepository.save(p50);
//             Product p51 = new Product("Quần jeans lửng gấu gấp", "Nu3L", "L", 990000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/12/13/a17e235ce01112282760d06b6d52ffae.jpg"); productRepository.save(p51);
//             Product p52 = new Product("Quần jeans lửng gấu gấp", "Nu3XL", "XL", 990000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/12/13/a17e235ce01112282760d06b6d52ffae.jpg"); productRepository.save(p52);
//             Product p53 = new Product("Quần mini jeans ống gập", "Nu4S", "S", 1050000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/04/18/fa48f17ba60e43c74c91dbfe7c085a1e.JPG"); productRepository.save(p53);
//             Product p54 = new Product("Quần mini jeans ống gập", "Nu4M", "M", 1050000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/04/18/fa48f17ba60e43c74c91dbfe7c085a1e.JPG"); productRepository.save(p54);
//             Product p55 = new Product("Quần mini jeans ống gập", "Nu4L", "L", 1050000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/04/18/fa48f17ba60e43c74c91dbfe7c085a1e.JPG"); productRepository.save(p55);
//             Product p56 = new Product("Quần mini jeans ống gập", "Nu4XL", "XL", 1050000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/04/18/fa48f17ba60e43c74c91dbfe7c085a1e.JPG"); productRepository.save(p56);
//             Product p57 = new Product("Chân váy xoè phối ly", "Nu5S", "S", 1250000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/20/7ed1a31ca3b5722b164bffa0a17b1e79.jpg"); productRepository.save(p57);
//             Product p58 = new Product("Chân váy xoè phối ly", "Nu5M", "M", 1250000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/20/7ed1a31ca3b5722b164bffa0a17b1e79.jpg"); productRepository.save(p58);
//             Product p59 = new Product("Chân váy xoè phối ly", "Nu5L", "L", 1250000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/20/7ed1a31ca3b5722b164bffa0a17b1e79.jpg"); productRepository.save(p59);
//             Product p60 = new Product("Chân váy xoè phối ly", "Nu5XL", "XL", 1250000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/20/7ed1a31ca3b5722b164bffa0a17b1e79.jpg"); productRepository.save(p60);
//             Product p61 = new Product("Lace Skirt - Sét áo tay bồng phối chân váy dài", "Nu6S", "S", 2080000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/20/3503d8568ca65dcf0ea4bcb06bdd2e2c.jpg"); productRepository.save(p61);
//             Product p62 = new Product("Lace Skirt - Sét áo tay bồng phối chân váy dài", "Nu6M", "M", 2080000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/20/3503d8568ca65dcf0ea4bcb06bdd2e2c.jpg"); productRepository.save(p62);
//             Product p63 = new Product("Lace Skirt - Sét áo tay bồng phối chân váy dài", "Nu6L", "L", 2080000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/20/3503d8568ca65dcf0ea4bcb06bdd2e2c.jpg"); productRepository.save(p63);
//             Product p64 = new Product("Lace Skirt - Sét áo tay bồng phối chân váy dài", "Nu6XL", "XL", 2080000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/20/3503d8568ca65dcf0ea4bcb06bdd2e2c.jpg"); productRepository.save(p64);
//             Product p65 = new Product("Chân váy xẻ tà trước thêu chứ", "Nu7S", "S", 890000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/20/9c90169289f75d6b1528503c0f37bac1.JPG"); productRepository.save(p65);
//             Product p66 = new Product("Chân váy xẻ tà trước thêu chứ", "Nu7M", "M", 890000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/20/9c90169289f75d6b1528503c0f37bac1.JPG"); productRepository.save(p66);
//             Product p67 = new Product("Chân váy xẻ tà trước thêu chứ", "Nu7L", "L", 890000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/20/9c90169289f75d6b1528503c0f37bac1.JPG"); productRepository.save(p67);
//             Product p68 = new Product("Chân váy xẻ tà trước thêu chứ", "Nu7XL", "XL", 890000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/20/9c90169289f75d6b1528503c0f37bac1.JPG"); productRepository.save(p68);
//             Product p69 = new Product("Chân váy ren xếp ly", "Nu8S", "S", 850000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/17/13a20903f548616b199c9caa4238e4b3.jpg"); productRepository.save(p69);
//             Product p70 = new Product("Chân váy ren xếp ly", "Nu8M", "M", 850000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/17/13a20903f548616b199c9caa4238e4b3.jpg"); productRepository.save(p70);
//             Product p71 = new Product("Chân váy ren xếp ly", "Nu8L", "L", 850000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/17/13a20903f548616b199c9caa4238e4b3.jpg"); productRepository.save(p71);
//             Product p72 = new Product("Chân váy ren xếp ly", "Nu8XL", "XL", 850000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/17/13a20903f548616b199c9caa4238e4b3.jpg"); productRepository.save(p72);
//             Product p73 = new Product("Caily Dress - Đầm ôm trễ vai", "Nu9S", "S", 2790000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/10/d53854452ceca3da55cb4662dc3b4909.jpg"); productRepository.save(p73);
//             Product p74 = new Product("Caily Dress - Đầm ôm trễ vai", "Nu9M", "M", 2790000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/10/d53854452ceca3da55cb4662dc3b4909.jpg"); productRepository.save(p74);
//             Product p75 = new Product("Caily Dress - Đầm ôm trễ vai", "Nu9L", "L", 2790000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/10/d53854452ceca3da55cb4662dc3b4909.jpg"); productRepository.save(p75);
//             Product p76 = new Product("Caily Dress - Đầm ôm trễ vai", "Nu9XL", "XL", 2790000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/10/d53854452ceca3da55cb4662dc3b4909.jpg"); productRepository.save(p76);
//             Product p77 = new Product("Đầm Linen dáng Maxi", "Nu10S", "S", 1890000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/03/21/ebc97eb2f4e26cfe17b86790d2a26b1b.jpg"); productRepository.save(p77);
//             Product p78 = new Product("Đầm Linen dáng Maxi", "Nu10M", "M", 1890000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/03/21/ebc97eb2f4e26cfe17b86790d2a26b1b.jpg"); productRepository.save(p78);
//             Product p79 = new Product("Đầm Linen dáng Maxi", "Nu10L", "L", 1890000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/03/21/ebc97eb2f4e26cfe17b86790d2a26b1b.jpg"); productRepository.save(p79);
//             Product p80 = new Product("Đầm Linen dáng Maxi", "Nu10XL", "XL", 1890000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/03/21/ebc97eb2f4e26cfe17b86790d2a26b1b.jpg"); productRepository.save(p80);

             
//             Product p81 = new Product("Áo thun Music Play", "Tre14-5", "4-5", 299000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/26/d43c9599246386c816fbb66bc0ce0f1b.jpg"); productRepository.save(p81);
//             Product p82 = new Product("Áo thun Music Play", "Tre16-7", "6-7", 299000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/26/d43c9599246386c816fbb66bc0ce0f1b.jpg"); productRepository.save(p82);
//             Product p83 = new Product("Áo thun Music Play", "Tre18-9", "8-9", 299000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/26/d43c9599246386c816fbb66bc0ce0f1b.jpg"); productRepository.save(p83);
//             Product p84 = new Product("Áo thun Music Play", "Tre110-11", "10-11", 299000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/26/d43c9599246386c816fbb66bc0ce0f1b.jpg"); productRepository.save(p84);
//             Product p85 = new Product("Set váy hoa nhí", "Tre24-5", "4-5", 1039000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/07/04/9d27ba4afeca4321c440e82bde6c711d.JPG"); productRepository.save(p85);
//             Product p86 = new Product("Set váy hoa nhí", "Tre26-7", "6-7", 1039000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/07/04/9d27ba4afeca4321c440e82bde6c711d.JPG"); productRepository.save(p86);
//             Product p87 = new Product("Set váy hoa nhí", "Tre28-9", "8-9", 1039000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/07/04/9d27ba4afeca4321c440e82bde6c711d.JPG"); productRepository.save(p87);
//             Product p88 = new Product("Set váy hoa nhí", "Tre210-11", "10-11", 1039000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/07/04/9d27ba4afeca4321c440e82bde6c711d.JPG"); productRepository.save(p88);
//             Product p89 = new Product("Đầm Tweed dáng suông", "Tre34-5", "4-5", 329000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/01/07/5f90c5f88b53487ba8aa0bb19c43510b.JPG"); productRepository.save(p89);
//             Product p90 = new Product("Đầm Tweed dáng suông", "Tre36-7", "6-7", 329000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/01/07/5f90c5f88b53487ba8aa0bb19c43510b.JPG"); productRepository.save(p90);
//             Product p91 = new Product("Đầm Tweed dáng suông", "Tre37-8", "8-9", 329000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/01/07/5f90c5f88b53487ba8aa0bb19c43510b.JPG"); productRepository.save(p91);
//             Product p92 = new Product("Đầm Tweed dáng suông", "Tre38-9", "10-11", 329000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/01/07/5f90c5f88b53487ba8aa0bb19c43510b.JPG"); productRepository.save(p92);
//             Product p93 = new Product("Đầm lông bé mèo", "Tre44-5", "4-5", 299000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2021/10/19/0f1b8fe77dc3753feba78ba7aff3ce8f.JPG"); productRepository.save(p93);
//             Product p94 = new Product("Đầm lông bé mèo", "Tre46-7", "6-7", 299000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2021/10/19/0f1b8fe77dc3753feba78ba7aff3ce8f.JPG"); productRepository.save(p94);
//             Product p95 = new Product("Đầm lông bé mèo", "Tre48-9", "8-9", 299000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2021/10/19/0f1b8fe77dc3753feba78ba7aff3ce8f.JPG"); productRepository.save(p95);
//             Product p96 = new Product("Đầm lông bé mèo", "Tre410-11", "10-11", 299000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2021/10/19/0f1b8fe77dc3753feba78ba7aff3ce8f.JPG"); productRepository.save(p96);
//             Product p97 = new Product("Quần lửng bé gái", "Tre54-5", "4-5", 199000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/28/2bc9caf990834768c6a856676244f498.jpg"); productRepository.save(p97);
//             Product p98 = new Product("Quần lửng bé gái", "Tre56-7", "6-7", 199000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/28/2bc9caf990834768c6a856676244f498.jpg"); productRepository.save(p98);
//             Product p99 = new Product("Quần lửng bé gái", "Tre58-9", "8-9", 199000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/28/2bc9caf990834768c6a856676244f498.jpg"); productRepository.save(p99);
//             Product p100 = new Product("Quần lửng bé gái", "Tre510-11", "10-11", 199000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/28/2bc9caf990834768c6a856676244f498.jpg"); productRepository.save(p100);
//             Product p101 = new Product("Áo thun bé trai ngắn tay", "Tre64-5", "4-5", 349000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/05/a3e5256f27af6a6eb6e2b3d4d877402a.jpg"); productRepository.save(p101);
//             Product p102 = new Product("Áo thun bé trai ngắn tay", "Tre66-7", "6-7", 349000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/05/a3e5256f27af6a6eb6e2b3d4d877402a.jpg"); productRepository.save(p102);
//             Product p103 = new Product("Áo thun bé trai ngắn tay", "Tre68-9", "8-9", 349000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/05/a3e5256f27af6a6eb6e2b3d4d877402a.jpg"); productRepository.save(p103);
//             Product p104 = new Product("Áo thun bé trai ngắn tay", "Tre610-11", "10-11", 349000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/05/a3e5256f27af6a6eb6e2b3d4d877402a.jpg"); productRepository.save(p104);
//             Product p105 = new Product("Áo polo bé trai Create", "Tre74-5", "4-5", 449000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/05/2a4a171b45e3236c93514adbffacc3b8.jpg"); productRepository.save(p105);
//             Product p106 = new Product("Áo polo bé trai Create", "Tre76-7", "6-7", 449000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/05/2a4a171b45e3236c93514adbffacc3b8.jpg"); productRepository.save(p106);
//             Product p107 = new Product("Áo polo bé trai Create", "Tre78-9", "8-9", 449000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/05/2a4a171b45e3236c93514adbffacc3b8.jpg"); productRepository.save(p107);
//             Product p108 = new Product("Áo polo bé trai Create", "Tre710-11", "10-11", 449000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/05/2a4a171b45e3236c93514adbffacc3b8.jpg"); productRepository.save(p108);
//             Product p109 = new Product("Quần lửng", "Tre84-5", "4-5", 139000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2020/04/29/1481064141ec89181d9b267426699d15.jpg"); productRepository.save(p109);
//             Product p110 = new Product("Quần lửng", "Tre86-7", "6-7", 139000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2020/04/29/1481064141ec89181d9b267426699d15.jpg"); productRepository.save(p110);
//             Product p111 = new Product("Quần lửng", "Tre88-9", "8-9", 139000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2020/04/29/1481064141ec89181d9b267426699d15.jpg"); productRepository.save(p111);
//             Product p112 = new Product("Quần lửng", "Tre810-11", "10-11", 139000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2020/04/29/1481064141ec89181d9b267426699d15.jpg"); productRepository.save(p112);
//             Product p113 = new Product("Quần Sooc kaki bé trai", "Tre94-5", "4-5", 449000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/05/c51bed4e0f5501e688ba67041f44ff40.jpg"); productRepository.save(p113);
//             Product p114 = new Product("Quần Sooc kaki bé trai", "Tre96-7", "6-7", 449000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/05/c51bed4e0f5501e688ba67041f44ff40.jpg"); productRepository.save(p114);
//             Product p115 = new Product("Quần Sooc kaki bé trai", "Tre98-9", "8-9", 449000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/05/c51bed4e0f5501e688ba67041f44ff40.jpg"); productRepository.save(p115);
//             Product p116 = new Product("Quần Sooc kaki bé trai", "Tre910-11", "10-11", 449000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2023/04/05/c51bed4e0f5501e688ba67041f44ff40.jpg"); productRepository.save(p116);
//             Product p117 = new Product("Quần Sooc rằn ri", "Tre104-5", "4-5", 320000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/04/20/055be6a5aabc77b813299603d6c04d7f.JPG"); productRepository.save(p117);
//             Product p118 = new Product("Quần Sooc rằn ri", "Tre106-7", "6-7", 320000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/04/20/055be6a5aabc77b813299603d6c04d7f.JPG"); productRepository.save(p118);
//             Product p119 = new Product("Quần Sooc rằn ri", "Tre108-9", "8-9", 320000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/04/20/055be6a5aabc77b813299603d6c04d7f.JPG"); productRepository.save(p119);
//             Product p120 = new Product("Quần Sooc rằn ri", "Tre1010-11", "10-11", 320000.0, "", 1, "https://pubcdn.ivymoda.com/files/product/thumab/1400/2022/04/20/055be6a5aabc77b813299603d6c04d7f.JPG"); productRepository.save(p120);

//             
//             Account a1= new Account("admin", "12345678", "admin"); accountRepository.save(a1);
//             Account a2= new Account("tuan", "12345678", "user"); accountRepository.save(a2);
//             Account a3= new Account("anh", "12345678", "user"); accountRepository.save(a3);
//             Account a4= new Account("duyen", "12345678", "user"); accountRepository.save(a4);

//             
            }
        };
    }
}