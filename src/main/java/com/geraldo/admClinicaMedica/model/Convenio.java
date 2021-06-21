package com.geraldo.admClinicaMedica.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Convenio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
