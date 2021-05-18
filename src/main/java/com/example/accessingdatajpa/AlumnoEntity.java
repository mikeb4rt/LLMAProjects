package com.example.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by: Daniels
 * Date: 14/05/2021
 * Description:
 */
@Entity
public class AlumnoEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String nombre;
    private int edad;

    protected AlumnoEntity() {}

    public AlumnoEntity(Long id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return String.format(
                "Alumno[id=%d, nombre='%s', edad='%s']",
                id, nombre, edad);
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
