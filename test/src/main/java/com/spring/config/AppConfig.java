package com.spring.config;

import com.spring.service.A;
import com.spring.service.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public A a() {
		return new A();
	}

	@Bean
	public B b() {
		return new B();
	}
}
