package com.idat.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.apirest.model.Products;

public interface ProductsRepository extends JpaRepository<Products, Integer>{

}
