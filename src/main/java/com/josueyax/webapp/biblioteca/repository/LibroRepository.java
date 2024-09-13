package com.josueyax.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josueyax.webapp.biblioteca.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long>{
    
}
