package com.example.accessingdatajpa;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
@org.springframework.stereotype.Service
public class Service {

    private final AlumnoRepository alumnoRepository;


    @Autowired
    public Service(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    public void addAlumno(Alumno alumno){
        alumnoRepository.save(alumno);
    }

    public List<Alumno> findAllAlumnos(){
        return alumnoRepository.findAll();
    }

    public Optional<Alumno> findAlumnoById(int id){
        return alumnoRepository.findById(id);
    }
}
