package com.omnirio.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omnirio.catalog.entity.ProductAttributes;

@Repository
public interface ProductAttributesRepository extends JpaRepository<ProductAttributes, Long> {

}
