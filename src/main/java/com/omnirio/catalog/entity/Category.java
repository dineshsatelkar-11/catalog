package com.omnirio.catalog.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Builder;


@Entity
@Table
public class Category {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoryId;
	
	String categoryName;
	
	@OneToMany(mappedBy="category")  
	private List<ProductAttributes> productAttributes;

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<ProductAttributes> getProductAttributes() {
		return productAttributes;
	}

	public void setProductAttributes(List<ProductAttributes> productAttributes) {
		this.productAttributes = productAttributes;
	}   
	
	
}

