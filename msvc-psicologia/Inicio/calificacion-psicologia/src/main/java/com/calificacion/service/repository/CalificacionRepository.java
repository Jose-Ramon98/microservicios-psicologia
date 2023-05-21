package com.calificacion.service.repository;

import com.calificacion.service.entities.Calificacion;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CalificacionRepository extends MongoRepository<Calificacion,Long> {

    List<Calificacion> findByIndividuoId(String individuoId);
    List<Calificacion> findByPsicologoId(String psicologoId);
}
