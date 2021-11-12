package com.tecweb.service;

import com.tecweb.domain.Aluno;
import com.tecweb.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AlunoServico {

    private AlunoRepository repository;


    public Aluno salvar(Aluno aluno) {
        return repository.save(aluno);
    }
}
