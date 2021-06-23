package com.geraldo.admClinicaMedica.Controller;

import com.geraldo.admClinicaMedica.model.Exame;
import com.geraldo.admClinicaMedica.repository.ExameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/exame")
public class ExameController {

    @Autowired
    ExameRepository exameRepository;

    @GetMapping
    public List<Exame> buscaExames(){
        return exameRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Exame> buscaExamePorId(@PathVariable Long id){
        return exameRepository.findById(id);
    }

    @PostMapping
    public void cadastraExame(@RequestBody Exame exame){
        exameRepository.save(exame);
    }

    @PutMapping
    public void atualizaExame(@RequestBody Exame exame){
        exameRepository.save(exame);
    }

    @DeleteMapping("/{id}")
    public void excluiExame(@PathVariable Long id){
        exameRepository.deleteById(id);
    }
}
