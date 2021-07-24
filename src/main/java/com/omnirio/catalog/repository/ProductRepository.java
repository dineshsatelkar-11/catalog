package com.omnirio.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omnirio.catalog.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
