package com.avaliacao.avaliacao.service;

import java.util.List;

import com.avaliacao.avaliacao.Entity.Compromisso;

public interface ICompromissoService {
    public Compromisso buscarPorId(Long id);
    public Compromisso novoCompromisso(Compromisso compromisso);
    public List<Compromisso> buscarTodosCompromissos();
}
