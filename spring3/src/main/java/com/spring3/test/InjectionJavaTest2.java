package com.spring3.test;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring3.vo.InjectionJava2;

public class InjectionJavaTest2 {
	
	//필드 주입
	private InjectionJava2 java2;
	
	//생성자 주입
	@Autowired
	public InjectionJavaTest2(InjectionJava2 java2) {
		this.java2 = java2;
	}
	
	//수정자 주입
	@Autowired
	public void setJava2(InjectionJava2 java2) {
		this.java2 = java2;
	}
	public InjectionJava2 getJava2() {
		return java2;
	}
}
