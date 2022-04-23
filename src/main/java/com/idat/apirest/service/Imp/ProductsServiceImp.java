package com.idat.apirest.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.apirest.model.Products;
import com.idat.apirest.repository.ProductsRepository;
import com.idat.apirest.service.ProductsService;

@Service
public class ProductsServiceImp implements ProductsService {

	@Autowired
	private ProductsRepository repository;
	
	@Override
	public void guardaProducts(Products p) {
		// TODO Auto-generated method stub
		repository.save(p);
	}

	@Override
	public void eliminarProducts(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void editarProducst(Products p) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(p);
	}

	@Override
	public List<Products> listarProducts() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Products productsById(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
