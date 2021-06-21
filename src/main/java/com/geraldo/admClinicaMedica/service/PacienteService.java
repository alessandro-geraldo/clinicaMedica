package com.geraldo.admClinicaMedica.service;

import com.geraldo.admClinicaMedica.model.Paciente;
import com.geraldo.admClinicaMedica.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class PacienteService {

    private PacienteRepository pacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public List<Paciente> listarPacientesPorCidade(String cidade){
        List<Paciente> pacientes = pacienteRepository.findAll();
        return pacientes.stream().filter((paciente)-> paciente.getCidade().contains(cidade))
                .collect(Collectors.toList());

    }
}
