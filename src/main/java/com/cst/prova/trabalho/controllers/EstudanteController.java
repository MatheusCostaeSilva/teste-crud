package com.cst.prova.trabalho.controllers;

import com.cst.prova.trabalho.models.EstudanteModel;
import com.cst.prova.trabalho.services.EstudanteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = ("/estudantes"))
public class EstudanteController {

    @Autowired
    private EstudanteServices estudanteServices;

    @PostMapping
    public EstudanteModel criarEstudante(@RequestBody EstudanteModel estudanteModel){return estudanteServices.criarEstudante(estudanteModel);}
    @GetMapping
    public List<EstudanteModel> ListarTodosEstudantes(){return estudanteServices.ListarTodosEstudantes();}
    @DeleteMapping("/{id}")
    public void deletarEstudante(@PathVariable Long id){
        estudanteServices.deletarEstudante(id);
    }


}
