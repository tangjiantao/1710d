package com.bw.bean;



public class Owner {
	private Integer o_id;
	private String o_name;
	private String o_idno;
	private String o_sex;
	public Integer getO_id() {
		return o_id;
	}
	public void setO_id(Integer o_id) {
		this.o_id = o_id;
	}
	public String getO_name() {
		return o_name;
	}
	public void setO_name(String o_name) {
		this.o_name = o_name;
	}
	public String getO_idno() {
		return o_idno;
	}
	public void setO_idno(String o_idno) {
		this.o_idno = o_idno;
	}
	public String getO_sex() {
		return o_sex;
	}
	public void setO_sex(String o_sex) {
		this.o_sex = o_sex;
	}
	public Owner(Integer o_id, String o_name, String o_idno, String o_sex) {
		super();
		this.o_id = o_id;
		this.o_name = o_name;
		this.o_idno = o_idno;
		this.o_sex = o_sex;
	}
	public Owner() {
		super();
	}
	@Override
	public String toString() {
		return "Owner [o_id=" + o_id + ", o_name=" + o_name + ", o_idno=" + o_idno + ", o_sex=" + o_sex + "]";
	}
	
}
