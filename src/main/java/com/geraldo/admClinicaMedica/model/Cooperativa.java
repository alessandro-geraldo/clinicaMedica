package com.geraldo.admClinicaMedica.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cooperativa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codCooperativa;
    private String nomeCooperativa;

    public Cooperativa(){}

    public Cooperativa(Long codCooperativa, String nomeCooperativa) {
        this.codCooperativa = codCooperativa;
        this.nomeCooperativa = nomeCooperativa;
    }

    public Long getCodCooperativa() {
        return codCooperativa;
    }

    public void setCodCooperativa(Long codCooperativa) {
        this.codCooperativa = codCooperativa;
    }

    public String getNomeCooperativa() {
        return nomeCooperativa;
    }

    public void setNomeCooperativa(String nomeCooperativa) {
        this.nomeCooperativa = nomeCooperativa;
    }
}
