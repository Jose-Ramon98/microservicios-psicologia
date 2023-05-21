package com.calificacion.service.services;

import com.calificacion.service.entities.Calificacion;

import java.util.List;

public interface CalificacionService {

    Calificacion create(Calificacion calificacion);

    List<Calificacion> getCalificaciones();

    List<Calificacion> getCalificacionesByIndividuoId(String individuoId);

    List<Calificacion> getCalificacionesByPsicologoId(String psicologoId);

}
