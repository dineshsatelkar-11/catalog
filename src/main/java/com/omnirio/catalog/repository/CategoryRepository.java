package com.omnirio.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omnirio.catalog.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

	Category findByCategoryName(String categoryName);
}
