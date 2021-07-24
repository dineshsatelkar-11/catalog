package com.omnirio.catalog.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omnirio.catalog.dto.CategoryDto;
import com.omnirio.catalog.entity.Category;
import com.omnirio.catalog.service.CategoryService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/services/catalog_api_gateway")
public class CatalogController {

	
	@Autowired
	CategoryService categoryService;
	
	@PostMapping(value= "/add_category", produces = "application/json")
	public CategoryDto saveCategory(@RequestBody CategoryDto categoryDto) throws Exception{
		return categoryService.saveCategory(categoryDto);		
	}
	
	@GetMapping(value= "/get_category", produces = "application/json")
	public Category getCategory(@RequestBody Long id) throws Exception{
		return categoryService.getCategory(id);		
	}
}
