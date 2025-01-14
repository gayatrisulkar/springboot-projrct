package com.onlinefooddelivery;


import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.onlinefooddelivery.dao.RegisterRepository;
import com.onlinefooddelivery.model.Register;
@SpringBootTest
class RegisterTest {
	@Autowired      
	RegisterRepository registerRepository;
	@Test
	public void addRegisters() {
		Register registers = new Register();
		registers.setUser_id(9);
		registers.setF_name("seeta");
		registers.setL_name("patil");
		registers.setAddress("mumbai");
		registers.setEmail_id("sa@gmail.com");
		registers.setPhone_no(9.657458418);
		registers.setPassword("6476145");
		registerRepository.save(registers);
		assertNotNull(registerRepository.findById(1).get());
	}

	@Test
	public void AllRegisters() {
		List<Register> list = registerRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	public void Register() {
		Register registers = registerRepository.findById(1).get();
		assertEquals(1, registers.getUser_id());
	}
	

	
	
}
