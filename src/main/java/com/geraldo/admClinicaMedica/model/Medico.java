package com.geraldo.admClinicaMedica.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codMedico;
    private String nomeMedico;
    private String especialidade;

    @OneToMany(mappedBy = "medico")
    private Set<Consulta> consultas = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "tab_medico_convenio",
    joinColumns = @JoinColumn(name = "cod_medico"),
    inverseJoinColumns = @JoinColumn(name = "cod_convenio"))
    private Set<Convenio> convenios = new HashSet<>();

    public Medico(){}

    public Medico(Long codMedico, String nomeMedico, String especialidade, Set<Consulta> consultas, Set<Convenio> convenios) {
        this.codMedico = codMedico;
        this.nomeMedico = nomeMedico;
        this.especialidade = especialidade;
        this.consultas = consultas;
        this.convenios = convenios;
    }

    public Set<Consulta> getConsultas() {
        return consultas;
    }

    public Set<Convenio> getConvenios() {
        return convenios;
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


}
