package com.wipro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CafeInfo")
public class CafeInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cafeId;
	private String cafeName;
	private String cafeDesc;
	
	public CafeInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CafeInfo(String cafeName, String cafeDesc) {
		super();
		this.cafeName = cafeName;
		this.cafeDesc = cafeDesc;
	}

	public Integer getCafeId() {
		return cafeId;
	}

	public void setCafeId(Integer cafeId) {
		this.cafeId = cafeId;
	}

	public String getCafeName() {
		return cafeName;
	}

	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
	}

	public String getCafeDesc() {
		return cafeDesc;
	}

	public void setCafeDesc(String cafeDesc) {
		this.cafeDesc = cafeDesc;
	}
	
		

}
