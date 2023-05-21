package com.micropsicologia.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="psicologos")
public class Psicologo {



    @Id
    private String id;

    private String nombre;

    private String ubicacion;

    private String informacion;





}
