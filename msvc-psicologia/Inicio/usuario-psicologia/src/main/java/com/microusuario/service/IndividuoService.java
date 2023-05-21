package com.microusuario.service;

import com.microusuario.entity.Individuo;

import java.util.List;

public interface IndividuoService {


    Individuo saveIndividuo(Individuo individuo);

    List<Individuo> getAllIndividuo();

    Individuo getIndividuo (String individuoId);









}
