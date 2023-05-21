package com.microusuario.exception;


//Al extender RuntimeException, puedes crear tus propias clases de excepción personalizadas
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException() {
        super("No se encontró");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
