package com.calificacion.service.controller;

import com.calificacion.service.entities.Calificacion;
import com.calificacion.service.services.CalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calificaciones")
public class CalificacionController {

    @Autowired
    private CalificacionService calificacionService;

    @PostMapping
    public ResponseEntity<Calificacion> guardarCalificacion(@RequestBody Calificacion calificacion){
        return ResponseEntity.status(HttpStatus.CREATED).body(calificacionService.create(calificacion));
    }

    @GetMapping
    public ResponseEntity<List<Calificacion>> listarCalificaciones(){
        return ResponseEntity.ok(calificacionService.getCalificaciones());
    }

    @GetMapping("/individuos/{individuoId}")
    public ResponseEntity<List<Calificacion>> listarCalificacionesPorUsuarioId(@PathVariable String individuoId){
        return ResponseEntity.ok(calificacionService.getCalificacionesByIndividuoId(individuoId));
    }

    @GetMapping("/psicologos/{psicologoId}")
    public ResponseEntity<List<Calificacion>> listarCalificacionesPorHotelId(@PathVariable String psicologoId){
        return ResponseEntity.ok(calificacionService.getCalificacionesByPsicologoId(psicologoId));
    }
}