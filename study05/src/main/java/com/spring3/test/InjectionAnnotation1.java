package com.spring3.test;

import com.spring3.dto.Store;

public class InjectionAnnotation1 {
	private Store storeBean1;
	private Store StoreBean2;
	public Store getStoreBean1() {
		return storeBean1;
	}
	public void setStoreBean1(Store storeBean1) {
		this.storeBean1 = storeBean1;
	}
	public Store getStoreBean2() {
		return StoreBean2;
	}
	public void setStoreBean2(Store storeBean2) {
		StoreBean2 = storeBean2;
	}
}
