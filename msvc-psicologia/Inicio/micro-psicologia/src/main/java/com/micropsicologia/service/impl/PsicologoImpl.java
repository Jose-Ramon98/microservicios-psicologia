package com.micropsicologia.service.impl;

import com.micropsicologia.entity.Psicologo;
import com.micropsicologia.exception.ResourceNotFoundException;
import com.micropsicologia.repository.PsicologoRepository;
import com.micropsicologia.service.PsicologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
    public class PsicologoImpl implements PsicologoService {

        @Autowired
        private PsicologoRepository psicologoRepository;



    @Override
    public Psicologo create(Psicologo psicologo) {
        String psicologoId = UUID.randomUUID().toString();
        psicologo.setId(psicologoId);
        return psicologoRepository.save(psicologo);
    }

    @Override
    public List<Psicologo> getAll() {
        return psicologoRepository.findAll();
    }

    @Override
    public Psicologo get(String id) {
        return psicologoRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Psicologo no encontrado con el ID : " + id));
    }
}
