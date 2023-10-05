package com.avaliacao.avaliacao.Entity;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cpm_compromisso")
public class Compromisso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cpm_id")
    private Long cpm_id;
    @Column(name = "cpm_nome")
	private String cpm_nome;
    @Column(name = "cpm_data_hora")
	private LocalDateTime cpm_data_hora;
    @Column(name = "cpm_duracao_prevista")
	private Float cpm_duracao_prevista;
    @Column(name = "cpm_cep")
	private Long cpm_cep;
    @Column(name = "cpm_numero")
	private Integer cpm_numero;

    public Compromisso (){}

    
    public String getCpm_nome() {
        return cpm_nome;
    }
  public Compromisso(String cpm_nome, LocalDateTime cpm_data_hora, Float cpm_duracao_prevista, Long cpm_cep, Integer cpm_numero) {
    this();
    this.cpm_nome = cpm_nome;
    this.cpm_data_hora = cpm_data_hora;
    this.cpm_duracao_prevista = cpm_duracao_prevista;
    this.cpm_cep = cpm_cep;
    this.cpm_numero = cpm_numero;
}
  public void setCpm_nome(String cpm_nome) {
        this.cpm_nome = cpm_nome;
    }
    public LocalDateTime getCpm_data_hora() {
        return cpm_data_hora;
    }
    public void setCpm_data_hora(LocalDateTime cpm_data_hora) {
        this.cpm_data_hora = cpm_data_hora;
    }
    public Float getCpm_duracao_prevista() {
        return cpm_duracao_prevista;
    }
    public void setCpm_duracao_prevista(Float cpm_duracao_prevista) {
        this.cpm_duracao_prevista = cpm_duracao_prevista;
    }
    public Long getCpm_cep() {
        return cpm_cep;
    }
    public void setCpm_cep(Long cpm_cep) {
        this.cpm_cep = cpm_cep;
    }
    public Integer getCpm_numero() {
        return cpm_numero;
    }
    public void setCpm_numero(Integer cpm_numero) {
        this.cpm_numero = cpm_numero;
    }

    
}
