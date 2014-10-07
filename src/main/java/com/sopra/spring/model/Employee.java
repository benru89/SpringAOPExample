package com.sopra.spring.model;
 
import com.sopra.spring.aspect.Loggable;
 
public class Employee {
 
    private String name;
     
    public String getName() {
        return name;
    }
 
    @Loggable
    public void setName(String nm) {
        this.name=nm;
    }
     
    public void throwException(){
        throw new RuntimeException("Exception de Prueba");
    }
     
}
