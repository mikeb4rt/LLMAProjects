package com.example.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by: Daniels
 * Date: 18/05/2021
 * Description:
 */
@Entity
public class AsignaturaEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    public int nota;
    public String nombre;

    public AsignaturaEntity(String nombre, int nota , Long id){
        this.id = id;
        this.nombre = nombre;
        this.nota = nota;
    }

    public AsignaturaEntity(){
    }

    @Id
    public Long getId() {
        return id;
    }

    public int getNota() {
        return nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
