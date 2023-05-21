package com.microusuario.service.impl;

import com.microusuario.entity.Individuo;
import com.microusuario.exception.ResourceNotFoundException;
import com.microusuario.repository.IndividuoRepository;
import com.microusuario.service.IndividuoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class IndividuoImpl implements IndividuoService {


    @Autowired
    private IndividuoRepository individuoRepository;


    @Override
    public Individuo saveIndividuo(Individuo individuo) {
        String randomIndividuoId= UUID.randomUUID().toString();
        individuo.setIndividuoId(randomIndividuoId);
        return individuoRepository.save(individuo);
    }

    @Override
    public List<Individuo> getAllIndividuo() {
        return individuoRepository.findAll();

    }

    @Override
    public Individuo getIndividuo(String individuoId) {
       return individuoRepository.findById(individuoId).orElseThrow(()->  new ResourceNotFoundException("Usuario no encontrado con el ID : " + individuoId));
    }
}
