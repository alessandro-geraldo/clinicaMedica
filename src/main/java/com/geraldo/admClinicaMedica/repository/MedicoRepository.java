package com.geraldo.admClinicaMedica.repository;

import com.geraldo.admClinicaMedica.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
