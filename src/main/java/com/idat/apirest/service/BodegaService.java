package com.idat.apirest.service;

import java.util.List;

import com.idat.apirest.model.Bodega;

public interface BodegaService {
	
	public void guardaBodega(Bodega b);
	public void eliminarBodega(Integer id);
	public void editarBodega(Bodega b);
	public List<Bodega> listarBodega();
	public Bodega bodegaById(Integer id);


}
