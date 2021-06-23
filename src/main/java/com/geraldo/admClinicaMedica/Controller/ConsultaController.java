package com.geraldo.admClinicaMedica.Controller;

import com.geraldo.admClinicaMedica.exception.NotFoundException;
import com.geraldo.admClinicaMedica.model.Consulta;
import com.geraldo.admClinicaMedica.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/consulta")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    @PostMapping
    public Consulta createConsulta(@RequestBody Consulta consulta){
        return consultaService.cadastrarConsulta(consulta);
    }

    @GetMapping
    public List<Consulta> listAll(){
        return consultaService.buscarConsultas();
    }

    @GetMapping("/{id}")
    public Optional<Consulta> listById(@PathVariable Long id){
        return consultaService.buscaConsultaPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deleteConsulta(@PathVariable Long id)throws NotFoundException {
        consultaService.excluirConsulta(id);
    }

    @PutMapping
    public Consulta updateConsulta(@RequestBody Consulta consulta){
       return consultaService.atualizarConsulta(consulta);
    }
}
