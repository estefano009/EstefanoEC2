package com.idat.apirest.service;

import java.util.List;


import com.idat.apirest.model.Products;

public interface ProductsService {
	
	public void guardaProducts(Products p);
	public void eliminarProducts(Integer id);
	public void editarProducst(Products p);
	public List<Products> listarProducts();
	public Products productsById(Integer id);
	

}
