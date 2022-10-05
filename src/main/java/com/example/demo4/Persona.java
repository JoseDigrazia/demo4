package com.example.demo4;


public class Persona {
    private Integer edad;
    private String nombre;
    private Integer telefono;

    public Persona(){
    }

    public Persona(Integer edad,String nombre, Integer telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

public class Cliente extends Persona{
     private Double credito;
}
}