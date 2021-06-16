package com.geraldo.admClinicaMedica.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Convenio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codConvenio;
    private String nomeConvenio;

    public Convenio(){}

    public Convenio(Long codConvenio, String nomeConvenio) {
        this.codConvenio = codConvenio;
        this.nomeConvenio = nomeConvenio;

    }

    public Long getCodConvenio() {
        return codConvenio;
    }

    public void setCodConvenio(Long codConvenio) {
        this.codConvenio = codConvenio;
    }

    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public void setNomeConvenio(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }


}
