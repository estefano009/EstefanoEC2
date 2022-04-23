package com.idat.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.idat.apirest.model.Bodega;
import com.idat.apirest.service.BodegaService;

@RestController
@RequestMapping("/bodega")
public class BodegaController {
	
	@Autowired
	private BodegaService service;
	
	
	@RequestMapping(method = RequestMethod.GET, path = "/listar")
	public ResponseEntity<List<Bodega>>listar(){
		
		return new ResponseEntity<List<Bodega>>(service.listarBodega(),HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/guardar")
	public ResponseEntity<Void> guardar(@RequestBody Bodega bodega){
		service.guardaBodega(bodega);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/listar/{id}")
	public @ResponseBody ResponseEntity<Bodega> buscarById(@PathVariable Integer id){
		Bodega bodega = service.bodegaById(id);
		if(bodega != null) {
			return new ResponseEntity<Bodega>(bodega, HttpStatus.OK);

		}
		return new ResponseEntity<Bodega>(HttpStatus.NOT_FOUND);

	}
	
	@RequestMapping(method = RequestMethod.DELETE, path = "/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		Bodega bodega = service.bodegaById(id);
		if(bodega != null) {
			service.eliminarBodega(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);

	}
	
	@RequestMapping(method = RequestMethod.PUT, path = "/editar")
	public ResponseEntity<Void> editar(@RequestBody Bodega bodega){
		Bodega bodegas = service.bodegaById(bodega.getIdBodega());
		if(bodegas!= null) {
			service.editarBodega(bodegas);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}

	

}
