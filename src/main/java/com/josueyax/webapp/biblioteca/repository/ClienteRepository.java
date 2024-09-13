package com.josueyax.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josueyax.webapp.biblioteca.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}
