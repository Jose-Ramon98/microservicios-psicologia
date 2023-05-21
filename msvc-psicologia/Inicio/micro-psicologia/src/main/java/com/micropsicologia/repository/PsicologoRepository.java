package com.micropsicologia.repository;

import com.micropsicologia.entity.Psicologo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PsicologoRepository extends JpaRepository<Psicologo,String> {
}
