package com.microusuario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="psico-microservicicos")
public class Individuo {


    @Id
    @Column(name="id")
    private String individuoId;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;



    @Column(name="sugerencia")
    private String sugerencia;











}
