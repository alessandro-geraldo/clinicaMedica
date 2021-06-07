package com.geraldo.admClinicaMedica.model;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codPaciente;
    private String nomePaciente;
    private int telPaciente;
    private double pressaoArt;
    private double peso;
    private double altura;
    private String convenio;

    public Paciente(){}

    public Paciente(String nomePaciente, int telPaciente, double pressaoArt, double peso, double altura, String convenio) {
        this.nomePaciente = nomePaciente;
        this.telPaciente = telPaciente;
        this.pressaoArt = pressaoArt;
        this.peso = peso;
        this.altura = altura;
        this.convenio = convenio;
    }

    public Long getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(Long codPaciente) {
        this.codPaciente = codPaciente;
    }

    public int getTelPaciente() {
        return telPaciente;
    }

    public void setTelPaciente(int telPaciente) {
        this.telPaciente = telPaciente;
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

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public void setNomePaciente(String nomePaciente){
        this.nomePaciente = nomePaciente;
    }
    public String getNomePaciente(){
        return this.nomePaciente;
    }

}
