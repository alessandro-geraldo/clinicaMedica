package com.geraldo.admClinicaMedica.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codConsulta;
    private Date date;
    private Date hora;
    private String medicacao;

    @ManyToOne
    @JoinColumn(name = "codPaciente")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "codMedico")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "codExame")
    private Exame exame;

    public Consulta(){}

    public Consulta(Long codConsulta, Date date, Date hora, String medicacao, Paciente paciente, Medico medico, Exame exame) {
        this.codConsulta = codConsulta;
        this.date = date;
        this.hora = hora;
        this.medicacao = medicacao;
        this.paciente = paciente;
        this.medico = medico;
        this.exame = exame;
    }

    public Long getCodConsulta() {
        return codConsulta;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getMedicacao() {
        return medicacao;
    }

    public void setMedicacao(String medicacao) {
        this.medicacao = medicacao;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setCodConsulta(Long codConsulta) {
        this.codConsulta = codConsulta;
    }

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }
}
