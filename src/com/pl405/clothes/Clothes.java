package com.pl405.clothes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cloth_info")
public class Clothes {
	
	@Id
	private Integer prod_id;
	private String prod_size;
	private String prod_type;
	private String prod_gender;
	
	
	public Integer getProd_id() {
		return prod_id;
	}
	public void setProd_id(Integer prod_id) {
		this.prod_id = prod_id;
	}
	public String getProd_size() {
		return prod_size;
	}
	public void setProd_size(String prod_size) {
		this.prod_size = prod_size;
	}
	public String getProd_type() {
		return prod_type;
	}
	public void setProd_type(String prod_type) {
		this.prod_type = prod_type;
	}
	public String getProd_gender() {
		return prod_gender;
	}
	public void setProd_gender(String prod_gender) {
		this.prod_gender = prod_gender;
	}
	
}
