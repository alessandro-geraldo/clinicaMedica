package com.geraldo.admClinicaMedica.service;

import com.geraldo.admClinicaMedica.exception.NotFoundException;
import com.geraldo.admClinicaMedica.model.Consulta;
import com.geraldo.admClinicaMedica.repository.ConsultaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultaService {

    private ConsultaRepository consultaRepository;

    public ConsultaService(ConsultaRepository consultaRepository) {
        this.consultaRepository = consultaRepository;
    }

    public Consulta cadastrarConsulta(Consulta consulta){
        return consultaRepository.save(consulta);
    }

    public List<Consulta> buscarConsultas(){
        return consultaRepository.findAll();
    }

    public Optional<Consulta> buscaConsultaPorId(Long id){
        return consultaRepository.findById(id);
    }

    public void excluirConsulta(Long id)throws NotFoundException{
        consultaRepository.findById(id).orElseThrow(()-> new NotFoundException(id));
    }

    public Consulta atualizarConsulta(Consulta consulta){
       return consultaRepository.save(consulta);
    }
}
