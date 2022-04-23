package com.idat.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.apirest.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	Usuario findByUsuario(String usuario);

}
