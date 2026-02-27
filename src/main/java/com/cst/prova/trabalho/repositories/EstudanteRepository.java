package com.cst.prova.trabalho.repositories;

import com.cst.prova.trabalho.models.EstudanteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<EstudanteModel, Long> {
}
