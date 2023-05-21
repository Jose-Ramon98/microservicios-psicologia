package com.micropsicologia.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice//Esta anotación se utiliza para definir una clase que se encargará de manejar las excepciones y errores generados por los
// controladores REST en la aplicación, entralizar el manejo de excepciones
public class GlobalExceptionController {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String, Object>> handlerResourceNotFoundException(ResourceNotFoundException resourceNotFoundException){
        Map map = new HashMap();
        map.put("message",resourceNotFoundException.getMessage());
        map.put("success",false);
        map.put("status", HttpStatus.NOT_FOUND);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
    }

}
