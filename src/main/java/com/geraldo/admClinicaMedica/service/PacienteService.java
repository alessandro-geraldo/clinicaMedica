package com.geraldo.admClinicaMedica.service;

import com.geraldo.admClinicaMedica.exception.NotFoundException;
import com.geraldo.admClinicaMedica.model.Paciente;
import com.geraldo.admClinicaMedica.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PacienteService {

    private PacienteRepository pacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public Paciente cadastrarPaciente(Paciente paciente){
        return pacienteRepository.save(paciente);
    }

    public List<Paciente> consultaPaciente(){
        return pacienteRepository.findAll();
    }

    public Optional<Paciente> consultaPacientePorCod(Long id)throws NotFoundException{
        return pacienteRepository.findById(id);
    }

    public Paciente atualizaPaciente(Paciente paciente){
        return pacienteRepository.save(paciente);
    }

    public void excluirPacientePorCod(Long id)throws NotFoundException{
        pacienteRepository.findById(id).orElseThrow(()-> new NotFoundException(id));
        pacienteRepository.deleteById(id);
    }

    public List<Paciente> listarPacientesPorCidade(String cidade){
        List<Paciente> pacientes = pacienteRepository.findAll();
        return pacientes.stream()
                .filter((paciente)-> paciente.getCidade()
                .contains(cidade))
                .collect(Collectors.toList());
    }

}
