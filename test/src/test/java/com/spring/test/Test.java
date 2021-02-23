package com.spring.test;

import com.spring.config.AppConfig;
import com.spring.service.A;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.MimeTypeUtils;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ComponentScan("com.spring.service")
//@ContextConfiguration(classes = {com.spring.service.A.class,com.spring.service.B.class})
public class Test {

//	@Autowired
//	private A a;

	@org.junit.Test
	public void test(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		// 将配置的bean添加到beanFactory
		context.register(AppConfig.class);
		// 刷新beanFactory
		context.refresh();


		A a = context.getBean(A.class);
		System.out.println("====="+MimeTypeUtils.TEXT_PLAIN);
		System.out.println(a);
	}
}
