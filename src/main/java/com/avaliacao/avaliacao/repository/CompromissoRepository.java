package com.avaliacao.avaliacao.repository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.avaliacao.avaliacao.Entity.Compromisso;

public interface CompromissoRepository extends JpaRepository<Compromisso, Long>{

    @Query("select c from Compromisso c where c.cpm_nome = ?1 and c.cpm_data_hora > ?2")
    public List<Compromisso> buscarPeloNomeDataHora(String nome, LocalDateTime datahora);
}