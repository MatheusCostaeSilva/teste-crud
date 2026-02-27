package com.cst.prova.trabalho.repositories;

import com.cst.prova.trabalho.models.EstudanteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;

public interface EstudanteRepository extends JpaRepository<EstudanteModel, Long> {
}
