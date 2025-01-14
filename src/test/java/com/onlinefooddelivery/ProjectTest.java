package com.onlinefooddelivery;


import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.onlinefooddelivery.dao.ALoginRepository;
import com.onlinefooddelivery.dao.OrderRepository;
import com.onlinefooddelivery.dao.ProductRepository;
import com.onlinefooddelivery.dao.RegisterRepository;
import com.onlinefooddelivery.model.ALogin;
import com.onlinefooddelivery.model.Register;
@SpringBootTest
public class ProjectTest {
	@Autowired
	ProductRepository productRepository;
	
	@Test
	public void addProduct() {
		com.onlinefooddelivery.model.Product product=new com.onlinefooddelivery.model.Product();
		
		product.setP_name("Idli");
		product.setDescription("Idli or idly (pronunciation (help·info)) (/ɪdliː/) are a type of savoury rice cake.");
		product.setPrice(70);
		product.setAvailable("yes");
		product.setFree_delivery("yes");
		product.setUrl("https://www.bingi.612FA70001E0DBAFDEDB9E8B2D628&selectedIndex=0");
		product.setCategory("indian");
		
		productRepository.save(product);
		assertNotNull(productRepository.findById(18).get());

	}
	@Test
	public void AllProduct() {
		List<com.onlinefooddelivery.model.Product> list=productRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	@Test
	public void Product() {
		com.onlinefooddelivery.model.Product product = productRepository.findById(1).get();
		assertEquals(1,product.getProduct_id());
	}
	

}
