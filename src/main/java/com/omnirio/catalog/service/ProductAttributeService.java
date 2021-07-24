package com.omnirio.catalog.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.omnirio.catalog.dto.CategoryDto;
import com.omnirio.catalog.entity.Category;
import com.omnirio.catalog.entity.ProductAttributes;

@Component
public interface ProductAttributeService {
	
	ProductAttributes saveCategory(CategoryDto categoryDto) throws Exception;

}
