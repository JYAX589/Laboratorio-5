package com.josueyax.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josueyax.webapp.biblioteca.model.Prestamo;

public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {

}
