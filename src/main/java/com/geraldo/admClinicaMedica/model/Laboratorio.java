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

    public Laboratorio(){}

    public Laboratorio(Long codLaboratorio, String nomeLaboratorio) {
        this.codLaboratorio = codLaboratorio;
        this.nomeLaboratorio = nomeLaboratorio;
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

}
