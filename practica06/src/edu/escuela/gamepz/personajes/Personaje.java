package com.patito.poo1pract.personajes;

public class Personaje {
    private String nombre;
    private int edad;

    public Personaje(String nombre){
        this.nombre = nombre;
        this.edad = 0;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void saludar(){
        System.out.println("Hola alumno de POO " + nombre);
    }
    public int getEdad(){
        return edad;
    }
    public boolean setEdad(int edad){
        if (edad > 0 && edad < 121){
            this.edad = edad;
            return true;
        }
        return false;
    }
}
