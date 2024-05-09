package com.spring3.vo;

import com.spring3.dto.Store;

//생성자로 주입
public class InjectionJava1Impl {
	private Store store;

	public InjectionJava1Impl(Store store) {
		super();
		this.store = store;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}
}
