package com.spring2.dto;

public class Sample {
	private int num;
	private String title;
	private String contents;
	private String res;
	
	public Sample() {}
	public Sample(int num, String title, String contents, String res) {
		super();
		this.num = num;
		this.title = title;
		this.contents = contents;
		this.res = res;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
	@Override
	public String toString() {
		return "Sample [num=" + num + ", title=" + title + ", contents=" + contents + ", res=" + res + "]";
	}
}
