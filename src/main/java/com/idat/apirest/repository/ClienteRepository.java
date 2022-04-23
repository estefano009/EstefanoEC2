package com.idat.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.apirest.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
