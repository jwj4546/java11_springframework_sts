package com.spring3.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring3.dto.Warehouse;

public class InjectionTest5 {

	public static void main(String[] args) {
		ApplicationContext ctx1 = new GenericXmlApplicationContext("classpath:injectionContext5.xml");
		
		Warehouse ware1 =  ctx1.getBean("ware1", Warehouse.class);
		System.out.println(ware1.toString());
	}

}
