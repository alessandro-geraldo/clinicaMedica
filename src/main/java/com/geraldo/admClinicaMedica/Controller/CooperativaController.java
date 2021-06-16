package com.geraldo.admClinicaMedica.Controller;

import com.geraldo.admClinicaMedica.model.Cooperativa;
import com.geraldo.admClinicaMedica.repository.CooperativaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/cooperativa")
public class CooperativaController {

    @Autowired
    private CooperativaRepository cooperativaRepository;

    @GetMapping
    public List<Cooperativa> buscarCooperativas(){
       return cooperativaRepository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Cooperativa> buscarCooperativaPorId(@PathVariable Long id){
        return cooperativaRepository.findById(id);
    }

    @PostMapping
    public void cadastrarCooperativa(@RequestBody Cooperativa cooperativa){
        cooperativaRepository.save(cooperativa);
    }

    @PutMapping
    public void atualizaCooperativa(@RequestBody Cooperativa cooperativa){
        cooperativaRepository.save(cooperativa);
    }

    @DeleteMapping("/{id}")
    public void excluirCooperativa(@PathVariable Long id){
        cooperativaRepository.deleteById(id);
    }
}
