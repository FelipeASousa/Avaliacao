package com.avaliacao.avaliacao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avaliacao.avaliacao.Entity.Compromisso;
import com.avaliacao.avaliacao.repository.CompromissoRepository;

@Service
public class CompromissoService implements ICompromissoService {
    @Autowired
    private CompromissoRepository compromissoRepo;

    public Compromisso buscarPorId(Long id) {
        Optional<Compromisso> compromissoOp = compromissoRepo.findById(id);
        if (compromissoOp.isPresent()) {
            return compromissoOp.get();
        }
        throw new IllegalArgumentException("Id inválido!");
    }

    public Compromisso novoCompromisso(Compromisso compromisso) {
        if(compromisso == null  ||
        compromisso.getCpm_nome() == null ||
        compromisso.getCpm_data_hora() == null ||
        compromisso.getCpm_duracao_prevista() == null
                 ) {
            throw new IllegalArgumentException("Nome inválido!");
        }
        return compromissoRepo.save(compromisso);
    }

    public List<Compromisso> buscarTodosCompromissos() {
        return compromissoRepo.findAll();
    }

}
