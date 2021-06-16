package com.geraldo.admClinicaMedica.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codMedico;
    private String nomeMedico;
    private String especialidade;

    @ManyToOne
    private Cooperativa cooperativa;

    public Medico(){}

    public Medico(Long codMedico, String nomeMedico, String especialidade, Cooperativa cooperativa) {
        this.codMedico = codMedico;
        this.nomeMedico = nomeMedico;
        this.especialidade = especialidade;
        this.cooperativa = cooperativa;
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
