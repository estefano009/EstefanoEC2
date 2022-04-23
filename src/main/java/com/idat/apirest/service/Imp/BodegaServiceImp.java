package com.idat.apirest.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.apirest.model.Bodega;
import com.idat.apirest.repository.BodegaRepository;
import com.idat.apirest.service.BodegaService;

@Service
public class BodegaServiceImp implements BodegaService {

	@Autowired
	private BodegaRepository repository;
	
	@Override
	public void guardaBodega(Bodega b) {
		// TODO Auto-generated method stub
		repository.save(b);
	}

	@Override
	public void eliminarBodega(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void editarBodega(Bodega b) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(b);
	}

	@Override
	public List<Bodega> listarBodega() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Bodega bodegaById(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
