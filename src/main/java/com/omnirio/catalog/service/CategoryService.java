package com.omnirio.catalog.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.omnirio.catalog.dto.CategoryDto;
import com.omnirio.catalog.entity.Category;

@Component
public interface CategoryService {
	
	CategoryDto saveCategory(CategoryDto categoryDto) throws Exception;
	
	Category getCategory(long id);

}
