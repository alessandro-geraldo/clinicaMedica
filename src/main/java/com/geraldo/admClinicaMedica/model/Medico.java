package com.geraldo.admClinicaMedica.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codMedico;
    private String nomeMedico;
    private String especialidade;
    private String convenio;

    public Medico(){}

    public Medico(String nomeMedico, String especialidade, String convenio) {
        this.nomeMedico = nomeMedico;
        this.especialidade = especialidade;
        this.convenio = convenio;
    }

    public Long getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(Long codMedico) {
        this.codMedico = codMedico;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }
}
