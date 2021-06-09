package com.geraldo.admClinicaMedica.model;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codPaciente;
    @Column(length = 60, nullable = false)
    private String nomePaciente;
    @Column(nullable = false)
    private int telPaciente;
    @Column(length = 20,nullable = false)
    private String cidade;
    @Column(nullable = false)
    private double pressaoArt;
    @Column(nullable = false)
    private double peso;
    @Column(nullable = false)
    private double altura;

    @OneToMany(mappedBy = "paciente")
    private Set<Consulta> consultas = new HashSet<>();

     @ManyToOne
     @JoinColumn(name = "codConvenio")
     private Convenio convenio;

    public Paciente(){}

    public Paciente(Long codPaciente, String nomePaciente, int telPaciente, String cidade, double pressaoArt, double peso, double altura, Set<Consulta> consultas,Convenio convenio) {
        this.codPaciente = codPaciente;
        this.nomePaciente = nomePaciente;
        this.telPaciente = telPaciente;
        this.cidade = cidade;
        this.pressaoArt = pressaoArt;
        this.peso = peso;
        this.altura = altura;
        this.consultas = consultas;
        this.convenio = convenio;
    }

    public Long getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(Long codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public int getTelPaciente() {
        return telPaciente;
    }

    public void setTelPaciente(int telPaciente) {
        this.telPaciente = telPaciente;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getPressaoArt() {
        return pressaoArt;
    }

    public void setPressaoArt(double pressaoArt) {
        this.pressaoArt = pressaoArt;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Set<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(Set<Consulta> consultas) {
        this.consultas = consultas;
    }

    public Convenio getConvenio() {
        return convenio;
    }

    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
    }
}
