package com.omnirio.catalog.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.omnirio.catalog.entity.ProductAttributes;

import lombok.Data;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryResponseDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	String categoryName;
	
	List<ProductAttributes> productAttributes;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}