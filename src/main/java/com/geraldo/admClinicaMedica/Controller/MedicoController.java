package com.geraldo.admClinicaMedica.Controller;

import com.geraldo.admClinicaMedica.exception.NotFoundException;
import com.geraldo.admClinicaMedica.model.Medico;
import com.geraldo.admClinicaMedica.repository.MedicoRepository;
import com.geraldo.admClinicaMedica.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/medico")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Medico createMedico(@RequestBody Medico medico){
       return medicoService.cadastraMedico(medico);
    }

    @GetMapping
    public List<Medico> listAll(){
        return medicoService.consultaMedicos();
    }

    @GetMapping("/{id}")
    public Optional<Medico> listById(@PathVariable Long id){
        return medicoService.consultaMedicoPorCod(id);
    }

    @DeleteMapping("/{id}")
    public void deleteMedicoById(@PathVariable Long id)throws NotFoundException {
        medicoService.excluirMedicoPorCod(id);
    }

    @PutMapping
    public Medico updateMedico(@RequestBody Medico medico)throws NotFoundException{
        return medicoService.atualizarMedico(medico);
    }
}
