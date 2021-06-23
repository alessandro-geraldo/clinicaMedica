package com.geraldo.admClinicaMedica.Controller;

import com.geraldo.admClinicaMedica.exception.NotFoundException;
import com.geraldo.admClinicaMedica.model.Paciente;
import com.geraldo.admClinicaMedica.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/paciente")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @PostMapping
    public void cadastraPaciente(@RequestBody Paciente paciente) {
        pacienteService.cadastrarPaciente(paciente);
    }

    @GetMapping
    public List<Paciente> consultaTodosPacientes(){
        return pacienteService.consultaPaciente();
    }

    @GetMapping(value = "/{id}")
    public Optional<Paciente> buscarPorCodigo(@PathVariable Long id) throws NotFoundException {
        return pacienteService.consultaPacientePorCod(id);
    }

    @DeleteMapping(value = "/{id}")
    public void exluirPacientePorCodigo(@PathVariable Long id) throws NotFoundException {
        pacienteService.excluirPacientePorCod(id);
    }

    @PutMapping
    public void atualizaPaciente(@RequestBody Paciente paciente){
        pacienteService.atualizaPaciente(paciente);
    }

    @GetMapping(value = {"/cidade/{cidade}"})
    public List<Paciente> listarPacientesPorCidade(@PathVariable String cidade){
        return pacienteService.listarPacientesPorCidade(cidade);
    }

}
