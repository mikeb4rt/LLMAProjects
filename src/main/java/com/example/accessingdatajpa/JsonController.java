package com.example.accessingdatajpa;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

/**
 * Created by: Daniels
 * Date: 14/05/2021
 * Description:
 */
@RestController
public class JsonController {

    @GetMapping("/processJson")
    public ModelAndView getJson(Model model) {
        return new ModelAndView("alumno", "Alumno", new AlumnoEntity());
    }
    @PostMapping("/processJson")
    public String getSubmit(@RequestBody String processJson, Model model ) throws IOException {
        jsonToJava jtj = new jsonToJava(processJson);

        return processJson;
    }

}
