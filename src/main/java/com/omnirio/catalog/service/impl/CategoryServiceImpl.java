package com.omnirio.catalog.service.impl;

import java.util.Optional;

import org.h2.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.omnirio.catalog.dto.CategoryDto;
import com.omnirio.catalog.dto.CategoryResponseDto;
import com.omnirio.catalog.entity.Category;
import com.omnirio.catalog.repository.CategoryRepository;
import com.omnirio.catalog.service.CategoryService;

@Component
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public CategoryDto saveCategory(CategoryDto categoryDto) throws Exception {

		if (StringUtils.isNullOrEmpty(categoryDto.getCategoryName())) {
			throw new Exception();
		}
		Category category = convertDtoToEntity(categoryDto);
		category = categoryRepository.save(category);
		return convertEntityToDto(category);
	}

	@Override
	public Category getCategory(long id) {

		Optional<Category> category = categoryRepository.findById(id);
		if (category.isPresent()) {
			return category.get();
		}
		return null;
	}

	private Category convertDtoToEntity(CategoryDto categoryDto) {
		Category category = new Category();
		category.setCategoryName(categoryDto.getCategoryName());
		return category;
	}

	private CategoryDto convertEntityToDto(Category category) {
		CategoryDto categoryDto = new CategoryDto();
		categoryDto.setCategoryName(category.getCategoryName());
		return categoryDto;
	}
}
