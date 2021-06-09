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

   @JsonIgnore
    @OneToMany(mappedBy = "convenio")
    private Set<Paciente> pacientes = new HashSet<>();

    @JsonIgnore
    @ManyToMany(mappedBy = "convenios")
    private Set<Medico> medicos = new HashSet<>();

    public Convenio(){}

    public Convenio(Long codConvenio, String nomeConvenio, Set<Paciente> pacientes) {
        this.codConvenio = codConvenio;
        this.nomeConvenio = nomeConvenio;
        this.pacientes = pacientes;
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

    public Set<Paciente> getPacientes() {
        return pacientes;
    }
}
