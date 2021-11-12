package com.tecweb.controller;

import com.tecweb.domain.Aluno;
import com.tecweb.service.AlunoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/alunos")
public class AlunoController {

    @Autowired
    private AlunoServico servico;

    @PostMapping
    public Aluno salvar(@RequestBody Aluno aluno) {
        return servico.salvar(aluno);
    }
}
