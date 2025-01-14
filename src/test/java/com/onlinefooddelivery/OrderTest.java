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
class OrderTest {
	@Autowired      
	RegisterRepository registerRepository;
	@Autowired
	ProductRepository productRepository;
	@Autowired
	OrderRepository orderRepository;
	@Autowired
	ALoginRepository aloginRepository;
//	
//	@Test
//	public void addRegisters() {
//		Register registers = new Register();
//		registers.setUser_id(9);
//		registers.setF_name("seeta");
//		registers.setL_name("patil");
//		registers.setAddress("mumbai");
//		registers.setEmail_id("sa@gmail.com");
//		registers.setPhone_no(9.657458418);
//		registers.setPassword("6476145");
//		registerRepository.save(registers);
//		assertNotNull(registerRepository.findById(1).get());
//	}
//
//	@Test
//	public void AllRegisters() {
//		List<Register> list = registerRepository.findAll();
//		assertThat(list).size().isGreaterThan(0);
//	}
//
//	@Test
//	public void Register() {
//		Register registers = registerRepository.findById(1).get();
//		assertEquals(1, registers.getUser_id());
//	}
//
//	@Test
//	public void addProduct() {
//		com.onlinefooddelivery.model.Product product=new com.onlinefooddelivery.model.Product();
//		
//		product.setP_name("Idli");
//		product.setDescription("Idli or idly (pronunciation (help·info)) (/ɪdliː/) are a type of savoury rice cake.");
//		product.setPrice(70);
//		product.setAvailable("yes");
//		product.setFree_delivery("yes");
//		product.setUrl("https://www.bingi.612FA70001E0DBAFDEDB9E8B2D628&selectedIndex=0");
//		product.setCategory("indian");
//		
//		productRepository.save(product);
//		assertNotNull(productRepository.findById(18).get());
//
//	}
//	@Test
//	public void AllProduct() {
//		List<com.onlinefooddelivery.model.Product> list=productRepository.findAll();
//		assertThat(list).size().isGreaterThan(0);
//	}
//	@Test
//	public void Product() {
//		com.onlinefooddelivery.model.Product product = productRepository.findById(1).get();
//		assertEquals(1,product.getProduct_id());
//	}
	
	@Test
	public void addOrder() {
		com.onlinefooddelivery.model.Order order=new com.onlinefooddelivery.model.Order();
		order.setOrder_id(31);
		order.setAddress("mumbai");
		order.setQuantity("2");
		order.setTrack_no(298547);
		order.setUpi_id("a@okaxis.com");
		orderRepository.save(order);
		//assertNotNull(productRepository.findById(19).get());

	}
	@Test
	public void AllOrder() {
		List<com.onlinefooddelivery.model.Order> list=orderRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	@Test
	public void Order() {
		com.onlinefooddelivery.model.Order order = orderRepository.findById(16).get();
		assertEquals(16,order.getOrder_id());
	}
	


//	@Test
//	public void AllALogin() {
//		List<com.onlinefooddelivery.model.ALogin> list=aloginRepository.findAll();
//		assertThat(list).size().isGreaterThan(0);
//	}
//	@Test
//	public void ALogin() {
//		com.onlinefooddelivery.model.ALogin alogin = aloginRepository.findById("admin@gmail.com").get();
//		assertEquals("admin@gmail.com",alogin.getEmail_id());
//	}
	
}