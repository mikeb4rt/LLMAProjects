package com.example.accessingdatajpa;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by: Daniels
 * Date: 14/05/2021
 * Description:
 */
@Controller
public class JsonController {

    @GetMapping("/processJson")
    public ModelAndView getJson(Model model) {
        return new ModelAndView("alumno", "Alumno", new AlumnoEntity());
    }
    @PostMapping("/processJson")
    public String getSubmit(@ModelAttribute AlumnoEntity alumno,BindingResult result , Model model) {
        if (result.hasErrors()) {
            return "error";
        }
        AlumnoEntity insert = new AlumnoEntity()
        model.addAttribute("jsoninput", );
        return "result";
    }

}
