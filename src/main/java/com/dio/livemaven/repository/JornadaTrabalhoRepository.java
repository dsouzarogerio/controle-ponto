package com.dio.livemaven.repository;

import com.dio.livemaven.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Implementa os métodos CRUD
 */
@Repository
public interface JornadaTrabalhoRepository extends JpaRepository<JornadaTrabalho, Long> {


}
