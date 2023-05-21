package com.micropsicologia.controller;


import com.micropsicologia.entity.Psicologo;
import com.micropsicologia.service.PsicologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/psicologos")
    public class PsicologoController {

        @Autowired
        private PsicologoService psicologoService;


        @PostMapping
        public ResponseEntity<Psicologo> guardarPsicologo(@RequestBody Psicologo psicologo){
            return ResponseEntity.status(HttpStatus.CREATED).body(psicologoService.create(psicologo));
        }
    @GetMapping
    public ResponseEntity<List<Psicologo>> listarPsicologos(){
        return ResponseEntity.status(HttpStatus.CREATED).body(psicologoService.getAll());
    }
    @GetMapping("/{psicologoId}")
    public ResponseEntity<Psicologo> obtenerPsicologo(@PathVariable String psicologoId){
        return ResponseEntity.status(HttpStatus.CREATED).body(psicologoService.get(psicologoId));
    }



    }
