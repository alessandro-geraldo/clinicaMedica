package com.geraldo.admClinicaMedica.service;

import com.geraldo.admClinicaMedica.exception.NotFoundException;
import com.geraldo.admClinicaMedica.model.Convenio;
import com.geraldo.admClinicaMedica.repository.ConvenioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConvenioService {

    private ConvenioRepository convenioRepository;

    public ConvenioService(ConvenioRepository convenioRepository) {
        this.convenioRepository = convenioRepository;
    }

    public Convenio cadastraConvenio(Convenio convenio){
        convenioRepository.save(convenio);
        return convenio;
    }

    public List<Convenio> listarConvenios(){
        return convenioRepository.findAll();
    }

    public Optional<Convenio> listaConvenioCod(Long id){
        return convenioRepository.findById(id);
    }

    public void excluiConvenioPorCod(Long id)throws NotFoundException {
        convenioRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
        convenioRepository.deleteById(id);
    }

    public Convenio atualizarConvenio(Convenio convenio){
        return convenioRepository.save(convenio);
    }
}
