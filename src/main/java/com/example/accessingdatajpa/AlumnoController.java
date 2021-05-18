package com.example.accessingdatajpa;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;
@RestController
public class AlumnoController {

    private final Service service;
    @Autowired
    public AlumnoController(Service service) {
        this.service = service;
    }

    @PostMapping("/processJson")
    public String getSubmit(@RequestBody String processJson) throws IOException {
        Alumno alumno;
        ObjectMapper om = new ObjectMapper();
        try{
            String result = java.net.URLDecoder.decode(processJson, StandardCharsets.UTF_8.name());
            alumno = om.readValue(result, Alumno.class);
            service.addAlumno(alumno);
            System.out.println(alumno);
        }catch (Exception e){
            e.printStackTrace();
        }

        return "creado";
    }

    @GetMapping("find/{id}")
    public ResponseEntity<?> findAlumnoById (@PathVariable("id") Integer id){
        Optional<Alumno> alumno = service.findAlumnoById(id);
        return new ResponseEntity<>(alumno, HttpStatus.OK);
    }

    @GetMapping("all")
    public ResponseEntity<List<Alumno>> findAllAlumnos(){
        List <Alumno> alumnos = service.findAllAlumnos();
        return new ResponseEntity<>(alumnos, HttpStatus.OK);
    }
}
