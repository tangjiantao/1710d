package com.liqian.movie.vo;

import com.liqian.movie.domain.Movie;

public class MovieVO extends Movie {//继承实体对象   属性都可使用
	
	//只需要写父类不存在的属性即可
	private String dateBegin;
	private String dateEnd;
	private Double priceBegin;
	private Double priceEnd;
	private Integer longTimeBegin;
	private Integer longTimeEnd;
	//排序的列
	private String orderColumn;
	//排序方式  asc   desc
	private String orderMethod;
	
	
	
	
	
	
	
	public String getOrderMethod() {
		return orderMethod;
	}
	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}
	public String getOrderColumn() {
		return orderColumn;
	}
	public void setOrderColumn(String orderColumn) {
		this.orderColumn = orderColumn;
	}
	public String getDateBegin() {
		return dateBegin;
	}
	public void setDateBegin(String dateBegin) {
		this.dateBegin = dateBegin;
	}
	public String getDateEnd() {
		return dateEnd;
	}
	public void setDateEnd(String dateEnd) {
		this.dateEnd = dateEnd;
	}
	public Double getPriceBegin() {
		return priceBegin;
	}
	public void setPriceBegin(Double priceBegin) {
		this.priceBegin = priceBegin;
	}
	public Double getPriceEnd() {
		return priceEnd;
	}
	public void setPriceEnd(Double priceEnd) {
		this.priceEnd = priceEnd;
	}
	public Integer getLongTimeBegin() {
		return longTimeBegin;
	}
	public void setLongTimeBegin(Integer longTimeBegin) {
		this.longTimeBegin = longTimeBegin;
	}
	public Integer getLongTimeEnd() {
		return longTimeEnd;
	}
	public void setLongTimeEnd(Integer longTimeEnd) {
		this.longTimeEnd = longTimeEnd;
	}
	
	
	

}
