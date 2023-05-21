package com.calificacion.service.services.impl;

import com.calificacion.service.entities.Calificacion;
import com.calificacion.service.repository.CalificacionRepository;
import com.calificacion.service.services.CalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalificacionServiceImpl implements CalificacionService {

    @Autowired
    private CalificacionRepository calificacionRepository;

    @Override
    public Calificacion create(Calificacion calificacion) {
        return calificacionRepository.save(calificacion);
    }

    @Override
    public List<Calificacion> getCalificaciones() {
        return calificacionRepository.findAll();
    }

    @Override
    public List<Calificacion> getCalificacionesByIndividuoId(String individuoId) {
        return calificacionRepository.findByIndividuoId(individuoId);
    }

    @Override
    public List<Calificacion> getCalificacionesByPsicologoId(String psicologoId) {
        return calificacionRepository.findByPsicologoId(psicologoId);
    }
}
