package com.avaliacao.avaliacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avaliacao.avaliacao.Entity.Compromisso;
import com.avaliacao.avaliacao.repository.CompromissoRepository;
import com.avaliacao.avaliacao.service.ICompromissoService;

@RestController
@RequestMapping("/compromisso")
@CrossOrigin
public class CompromissoController {
    @Autowired
    private ICompromissoService service;

    @Autowired
    private CompromissoRepository repositorio_Compromisso;

    @GetMapping
    public List<Compromisso> buscarTodosCompromissos() {
         return service.buscarTodosCompromissos();
    }

    @PostMapping
    public Compromisso cadastarCompromisso(@RequestBody Compromisso Compromisso){
        return repositorio_Compromisso.save(Compromisso);
    }

    @GetMapping(value="/{compromisso}")
    public Compromisso buscarPorId(@PathVariable("compromisso") Long id){
        return service.buscarPorId(id);
    }


}
