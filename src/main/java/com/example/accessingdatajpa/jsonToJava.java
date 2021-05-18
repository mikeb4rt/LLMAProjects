package com.example.accessingdatajpa;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Created by: Daniels
 * Date: 18/05/2021
 * Description:
 */
public class jsonToJava {


    public jsonToJava(String json) {
        try{
            ObjectMapper om = new ObjectMapper();
            AlumnoEntity alumnoEntity = om.readValue(json, AlumnoEntity.class);
            System.out.println(alumnoEntity);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
