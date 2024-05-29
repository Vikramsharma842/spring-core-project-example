package com.example.springdependencyinjection.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springdependencyinjection.bean.Address;
import com.example.springdependencyinjection.bean.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createAddrObj() {
		Address addr = new Address();
		addr.setCity("Jamshedpur");
		addr.setHouseno(123);
		addr.setPincode(831007);
		return addr;
	}

	@Bean
	public Student createStudentObj() {
		Student std = new Student();
		std.setName("Vikram");
		std.setRollno(345);
		std.setAddress(createAddrObj());
		return std;
	}

}
