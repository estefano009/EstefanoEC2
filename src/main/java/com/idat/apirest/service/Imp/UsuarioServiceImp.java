package com.idat.apirest.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.apirest.model.Usuario;
import com.idat.apirest.repository.UsuarioRepository;
import com.idat.apirest.service.UsuarioService;


@Service
public class UsuarioServiceImp implements UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public void guardarUsuario(Usuario u) {
		// TODO Auto-generated method stub
		repository.save(u);
	}

	@Override
	public void eliminarUsuario(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void editarUsuario(Usuario u) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(u);
	}

	@Override
	public List<Usuario> listarUsuario() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Usuario usuarioById(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
