package com.josueyax.webapp.biblioteca.service;

import java.util.List;

import com.josueyax.webapp.biblioteca.model.Cliente;

public interface IClienteService {

    public List<Cliente> listarClientes();

    public Cliente buscarClientePorDpi(Long dpi);

    public Cliente guardarCliente(Cliente cliente); // Clase de retorno para el Response del Postman.

    public void eliminarCliente(Cliente cliente);
}
