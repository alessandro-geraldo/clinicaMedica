package com.geraldo.admClinicaMedica.model;

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

    @ManyToMany
    @JoinTable(name = "tb_consulta_exame",joinColumns = @JoinColumn(name = "codConsulta"), inverseJoinColumns = @JoinColumn(name = "codExame"))
    private Set<Exame> exames = new HashSet<>();

    public Consulta(){}

    public Consulta(Date date, Date hora, String medicacao) {
        this.date = date;
        this.hora = hora;
        this.medicacao = medicacao;
//        this.paciente = paciente;
//        this.medico = medico;
//        Exame = exame;
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

//    public Paciente getPaciente() {
//        return paciente;
//    }
//
//    public void setPaciente(Paciente paciente) {
//        this.paciente = paciente;
//    }
//
//    public Medico getMedico() {
//        return medico;
//    }
//
//    public void setMedico(Medico medico) {
//        this.medico = medico;
//    }
//
//    public Exame getExame() {
//        return Exame;
//    }
//
//    public void setExame(Exame exame) {
//        Exame = exame;
//    }
}
