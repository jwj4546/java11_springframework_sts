package com.spring3.test;

import com.spring3.dto.Shop;

public class InjectionAnnotation2 {
	private Shop shopBean1;
	private Shop shopBean2;
	public Shop getShopBean1() {
		return shopBean1;
	}
	public void setShopBean1(Shop shopBean1) {
		this.shopBean1 = shopBean1;
	}
	public Shop getShopBean2() {
		return shopBean2;
	}
	public void setShopBean2(Shop shopBean2) {
		this.shopBean2 = shopBean2;
	}
}
