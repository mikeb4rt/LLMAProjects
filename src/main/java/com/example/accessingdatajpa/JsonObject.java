package com.example.accessingdatajpa;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.charset.StandardCharsets;
public class JsonObject {

    public JsonObject(String json) {

        Alumno alumno;
        try{
            String result = java.net.URLDecoder.decode(json, StandardCharsets.UTF_8.name());
            ObjectMapper om = new ObjectMapper();
            result = result.substring(12);
            alumno = om.readValue(result, Alumno.class);
            System.out.println(alumno);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
