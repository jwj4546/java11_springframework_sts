package com.spring3.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring3.dto.Market;

public class InjectionTest3 {

	public static void main(String[] args) {
		ApplicationContext ctx1 = new GenericXmlApplicationContext("classpath:injectionContext3.xml");
		
		Market market1 = ctx1.getBean("market1", Market.class);
		System.out.println(market1.toString());
	}

}
