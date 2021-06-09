package com.geraldo.admClinicaMedica.Controller;

import com.geraldo.admClinicaMedica.model.Laboratorio;
import com.geraldo.admClinicaMedica.model.Paciente;
import com.geraldo.admClinicaMedica.repository.LaboratorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/laboratorio")
public class LaboratorioController {

    @Autowired
    LaboratorioRepository laboratorioRepository;

    @GetMapping
    public List<Laboratorio> consultaLaboratorio(){
        return laboratorioRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Laboratorio> consultaLaboratorioPorCodigo(@PathVariable long id){
        return laboratorioRepository.findById(id);
    }

    @PostMapping
    public void cadastraLaboratorio(@RequestBody Laboratorio laboratorio){
        laboratorioRepository.save(laboratorio);
    }

    @DeleteMapping(value = "/{id}")
    public void excluirLaboratorioPorCodigo(@PathVariable Long id){
        laboratorioRepository.deleteById(id);
    }

    @PutMapping
    public void atualizaLaboratorio(@RequestBody Laboratorio laboratorio){
        laboratorioRepository.save(laboratorio);
    }
}
