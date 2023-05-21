package com.micropsicologia.service;

import com.micropsicologia.entity.Psicologo;

import java.util.List;

public interface PsicologoService {


    Psicologo create(Psicologo psicologo);
    List<Psicologo> getAll();
    Psicologo get(String id);





}
