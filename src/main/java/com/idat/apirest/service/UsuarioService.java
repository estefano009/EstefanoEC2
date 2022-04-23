package com.idat.apirest.service;

import java.util.List;


import com.idat.apirest.model.Usuario;

public interface UsuarioService {
	
	public void guardarUsuario(Usuario u);
	public void eliminarUsuario(Integer id);
	public void editarUsuario(Usuario u);
	public List<Usuario> listarUsuario();
	public Usuario usuarioById(Integer id);

}
