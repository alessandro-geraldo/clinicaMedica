package com.geraldo.admClinicaMedica.Controller;

import com.geraldo.admClinicaMedica.exception.NotFoundException;
import com.geraldo.admClinicaMedica.service.ConvenioService;
import com.geraldo.admClinicaMedica.model.Convenio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/convenio")
public class CoonvenioController {

    @Autowired
    public ConvenioService convenioService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Convenio createConvenio(@RequestBody Convenio convenio){
       return convenioService.cadastraConvenio(convenio);
    }

    @GetMapping
    public List<Convenio> listAll(){
        return convenioService.listarConvenios();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Optional<Convenio> listById(@PathVariable Long id){
        return convenioService.listaConvenioCod(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id)throws NotFoundException {
        convenioService.excluiConvenioPorCod(id);
    }

    @PutMapping
    public Convenio update(@RequestBody Convenio convenio){
        return convenioService.atualizarConvenio(convenio);
    }




}
