package com.geraldo.admClinicaMedica.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codConsulta;
    private Date date;
    private Date hora;
    private String medicacao;
    private Paciente paciente;
    private Medico medico;
    private List Exame;

    public Consulta(){}

    public Consulta(Date date, Date hora, String medicacao, Paciente paciente, Medico medico, List exame) {
        this.date = date;
        this.hora = hora;
        this.medicacao = medicacao;
        this.paciente = paciente;
        this.medico = medico;
        Exame = exame;
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

    public List getExame() {
        return Exame;
    }

    public void setExame(List exame) {
        Exame = exame;
    }
}
