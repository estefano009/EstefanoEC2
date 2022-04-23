package com.idat.apirest.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.idat.apirest.model.Usuario;
import com.idat.apirest.repository.UsuarioRepository;

public class MyUserDetail implements UserDetailsService{
	
	@Autowired
	private UsuarioRepository repositorio;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = repositorio.findByUsuario(username);
		UserBuilder user = null;
		if(usuario == null)
			throw new UsernameNotFoundException("No existe");
		else {
			user = User.withUsername(username);
			user.password(new BCryptPasswordEncoder().encode(usuario.getPassword()));
			user.roles(usuario.getRol());
		}
		return user.build();
	}


}
