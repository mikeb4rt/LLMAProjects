package com.example.accessingdatajpa;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.nio.charset.StandardCharsets;


/**
 * Created by: Daniels
 * Date: 18/05/2021
 * Description:
 */
public class jsonToJava {

    public jsonToJava(String json) {

        AlumnoEntity alumnoEntity;
        try{
            String result = java.net.URLDecoder.decode(json, StandardCharsets.UTF_8.name());
            ObjectMapper om = new ObjectMapper();
            result = result.substring(12);
            alumnoEntity = om.readValue(result, AlumnoEntity.class);
            System.out.println(alumnoEntity);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
