package com.geraldo.admClinicaMedica.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Exame {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codExame;
    private String nomeExame;
    private String descricao;
    private List Laboratorio;

    public Exame(){}

    public Exame(String nomeExame, String descricao, List laboratorio) {
        this.nomeExame = nomeExame;
        this.descricao = descricao;
        Laboratorio = laboratorio;
    }

    public Long getCodExame() {
        return codExame;
    }

    public void setCodExame(Long codExame) {
        this.codExame = codExame;
    }

    public String getNomeExame() {
        return nomeExame;
    }

    public void setNomeExame(String nomeExame) {
        this.nomeExame = nomeExame;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List getLaboratorio() {
        return Laboratorio;
    }

    public void setLaboratorio(List laboratorio) {
        Laboratorio = laboratorio;
    }
}
