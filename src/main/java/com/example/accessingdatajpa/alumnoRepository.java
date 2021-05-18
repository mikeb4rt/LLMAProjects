package com.example.accessingdatajpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by: Daniels
 * Date: 14/05/2021
 * Description:
 */
public interface alumnoRepository extends CrudRepository<AlumnoEntity, Long> {
    List<AlumnoEntity> findByNombre(String nombre);

    AlumnoEntity findById(long id);
}
