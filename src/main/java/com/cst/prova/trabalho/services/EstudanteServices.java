package com.cst.prova.trabalho.services;

import com.cst.prova.trabalho.models.EstudanteModel;
import com.cst.prova.trabalho.repositories.EstudanteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteServices {

    private static final Logger log = LoggerFactory.getLogger(EstudanteServices.class);
    @Autowired
    private EstudanteRepository estudanteRepository;

    public EstudanteModel criarEstudante(EstudanteModel estudanteModel){return estudanteRepository.save(estudanteModel);}

    public List<EstudanteModel>  ListarTodosEstudantes(){return estudanteRepository.findAll();}

    public void deletarAluno(Long id){
        estudanteRepository.deleteById(id);
    }

}
