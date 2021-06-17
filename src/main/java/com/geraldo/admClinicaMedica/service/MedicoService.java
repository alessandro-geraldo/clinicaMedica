package com.geraldo.admClinicaMedica.service;

import com.geraldo.admClinicaMedica.exception.NotFoundException;
import com.geraldo.admClinicaMedica.model.Medico;
import com.geraldo.admClinicaMedica.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoService {

    private MedicoRepository medicoRepository;

    public MedicoService(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    public Medico cadastraMedico(Medico medico){
        return medicoRepository.save(medico);
    }

    public List<Medico> consultaMedicos(){
        return medicoRepository.findAll();
    }

    public Optional<Medico> consultaMedicoPorCod(Long id){
        return medicoRepository.findById(id);
    }

    public void excluirMedicoPorCod(Long id)throws NotFoundException{
        medicoRepository.findById(id).orElseThrow(()-> new NotFoundException(id));
        medicoRepository.deleteById(id);
    }

    public Medico atualizarMedico(Medico medico)throws NotFoundException{
        medicoRepository.findById(medico.getCodMedico()).orElseThrow(()->new NotFoundException(medico.getCodMedico()));
       return medicoRepository.save(medico);
    }
}
