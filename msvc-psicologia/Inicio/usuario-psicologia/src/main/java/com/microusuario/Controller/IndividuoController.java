package com.microusuario.Controller;


import com.microusuario.entity.Individuo;
import com.microusuario.service.IndividuoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/individuos")
    public class IndividuoController {

    @Autowired
    private IndividuoService individuoService;

    @PostMapping
    public ResponseEntity<Individuo> guardarIndividuo(@RequestBody Individuo individuoRequest){
        Individuo individuo = individuoService.saveIndividuo(individuoRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(individuo);
    }
    @GetMapping("/{individuoId}")
    public ResponseEntity<Individuo> obtenerIndividuo(@PathVariable String individuoId){
        Individuo individuo = individuoService.getIndividuo(individuoId);
        return ResponseEntity.ok(individuo);
    }

    @GetMapping
    public ResponseEntity<List<Individuo>> listarIndividuos(){
        List<Individuo> individuo = individuoService.getAllIndividuo();
        return ResponseEntity.ok(individuo);
    }










}
