package com.geraldo.admClinicaMedica.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Exame {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codExame;
    private String nomeExame;
    private String descricao;
    @JsonIgnore
    @ManyToMany(mappedBy = "exames")
    private Set<Consulta> consultas = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "tb_exame_laboratorio",
            joinColumns = @JoinColumn(name = "codExame",referencedColumnName = "codExame"),
            inverseJoinColumns = @JoinColumn(name = "codLaboratorio",referencedColumnName = "codLaboratorio"))
    private Set<Laboratorio> laboratorios = new HashSet<>();

    public Exame() {
    }

    public Exame(Long codExame, String nomeExame, String descricao, Set<Laboratorio> laboratorios) {
        this.codExame = codExame;
        this.nomeExame = nomeExame;
        this.descricao = descricao;
        this.laboratorios = laboratorios;
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

    public Set<Laboratorio> getLaboratorios() {
        return laboratorios;
    }

    public void setLaboratorios(Set<Laboratorio> laboratorios) {
        this.laboratorios = laboratorios;
    }
}
