package com.geraldo.admClinicaMedica.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Laboratorio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codLaboratorio;
    private String nomeLaboratorio;

    @JsonIgnore
    @ManyToMany(mappedBy = "laboratorios")
    private Set<Exame> exames = new HashSet<>();

    public Laboratorio(){}

    public Laboratorio(Long codLaboratorio, String nomeLaboratorio, Set<Exame> exames) {
        this.codLaboratorio = codLaboratorio;
        this.nomeLaboratorio = nomeLaboratorio;
        this.exames = exames;
    }

    public void setCodLaboratorio(Long codLaboratorio) {
        this.codLaboratorio = codLaboratorio;
    }

    public Long getCodLaboratorio() {
        return codLaboratorio;
    }

    public String getNomeLaboratorio() {
        return nomeLaboratorio;
    }

    public void setNomeLaboratorio(String nomeLaboratorio) {
        this.nomeLaboratorio = nomeLaboratorio;
    }

    public Set<Exame> getExames() {
        return exames;
    }

    public void setExames(Set<Exame> exames) {
        this.exames = exames;
    }
}
