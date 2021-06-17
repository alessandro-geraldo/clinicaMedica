package com.geraldo.admClinicaMedica.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends Exception{

    public NotFoundException(Long id){
        super(String.format("Codigo %s não encontrado",id));
    }
}
