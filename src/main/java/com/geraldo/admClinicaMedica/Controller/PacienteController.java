package com.geraldo.admClinicaMedica.Controller;

import com.geraldo.admClinicaMedica.model.Paciente;
import com.geraldo.admClinicaMedica.repository.PacienteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/paciente")
public class PacienteController {

    private PacienteRepository pacienteRepository;

    public PacienteController(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    @PostMapping
    public void cadastraPaciente(@RequestBody Paciente paciente){
        pacienteRepository.save(paciente);
    }

    @GetMapping
    public List<Paciente> consultaTodosPacientes(){
        return pacienteRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Paciente> buscarPorCodigo(@PathVariable Long id){
        return pacienteRepository.findById(id);
    }

    @DeleteMapping(value = "/{id}")
    public void exluirPacientePorCodigo(@PathVariable Long id) {
        pacienteRepository.deleteById(id);
    }
    @PutMapping
    public void atualizaPaciente(@RequestBody Paciente paciente){

    }

}
