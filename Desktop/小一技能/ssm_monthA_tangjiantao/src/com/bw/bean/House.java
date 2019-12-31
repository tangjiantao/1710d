package com.bw.bean;

import java.util.Arrays;
import java.util.List;

public class House {
	private Integer h_id;
	private String h_address;
	private String h_use;
	private String h_area;
	private String h_pic;
	private List<Owner> owner;
	private int [] oids;
	public Integer getH_id() {
		return h_id;
	}
	public void setH_id(Integer h_id) {
		this.h_id = h_id;
	}
	public String getH_address() {
		return h_address;
	}
	public void setH_address(String h_address) {
		this.h_address = h_address;
	}
	public String getH_use() {
		return h_use;
	}
	public void setH_use(String h_use) {
		this.h_use = h_use;
	}
	public String getH_area() {
		return h_area;
	}
	public void setH_area(String h_area) {
		this.h_area = h_area;
	}
	public String getH_pic() {
		return h_pic;
	}
	public void setH_pic(String h_pic) {
		this.h_pic = h_pic;
	}
	public List<Owner> getOwner() {
		return owner;
	}
	public void setOwner(List<Owner> owner) {
		this.owner = owner;
	}
	public int[] getOids() {
		return oids;
	}
	public void setOids(int[] oids) {
		this.oids = oids;
	}
	public House(Integer h_id, String h_address, String h_use, String h_area, String h_pic, List<Owner> owner,
			int[] oids) {
		super();
		this.h_id = h_id;
		this.h_address = h_address;
		this.h_use = h_use;
		this.h_area = h_area;
		this.h_pic = h_pic;
		this.owner = owner;
		this.oids = oids;
	}
	public House() {
		super();
	}
	@Override
	public String toString() {
		return "House [h_id=" + h_id + ", h_address=" + h_address + ", h_use=" + h_use + ", h_area=" + h_area
				+ ", h_pic=" + h_pic + ", owner=" + owner + ", oids=" + Arrays.toString(oids) + "]";
	}
	
}
