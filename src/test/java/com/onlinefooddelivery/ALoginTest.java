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
class ALoginTest {
	
	@Autowired
	ALoginRepository aloginRepository;
	
	@Test
	public void AllALogin() {
		List<com.onlinefooddelivery.model.ALogin> list=aloginRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	@Test
	public void ALogin() {
		com.onlinefooddelivery.model.ALogin alogin = aloginRepository.findById("admin@gmail.com").get();
		assertEquals("admin@gmail.com",alogin.getEmail_id());
	}
	
}