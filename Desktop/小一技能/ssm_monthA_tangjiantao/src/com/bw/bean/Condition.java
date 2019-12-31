package com.bw.bean;

public class Condition {
	private Integer pageNum;
	private String o_name;
	private String h_address;
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public String getO_name() {
		return o_name;
	}
	public void setO_name(String o_name) {
		this.o_name = o_name;
	}
	public String getH_address() {
		return h_address;
	}
	public void setH_address(String h_address) {
		this.h_address = h_address;
	}
	
	public Condition(Integer pageNum, String o_name, String h_address) {
		super();
		this.pageNum = pageNum;
		this.o_name = o_name;
		this.h_address = h_address;
	}
	public Condition() {
		super();
	}
	@Override
	public String toString() {
		return "Condition [pageNum=" + pageNum + ", o_name=" + o_name + ", h_address=" + h_address + "]";
	}
	
	
}
