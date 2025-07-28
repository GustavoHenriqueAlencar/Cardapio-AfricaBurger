package com.cardapio_africa_burger.cardapio.exceptions;

public class ResourceNotFoundException extends  RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(Long id) {
        super("Recurso não encontrado com o ID: " + id);
    }
}
