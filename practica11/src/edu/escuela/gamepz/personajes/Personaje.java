package edu.escuela.gamepz.personajes;
public abstract class Personaje {
    private String nombre;
    protected int vida;

    public Personaje(String nombre, int vida){
        this.nombre = nombre;
        this.vida = vida;
    }
    public Personaje(String nombre){
        this(nombre, 3);
    }
    public void setNombre(String nombre){
        if ((nombre.length() > 5) && (nombre.length() < 25)){
            this.nombre = nombre;
        }
    }
    public String getNombre(){
        return nombre;
    }
    public void saludar(){
        System.out.println("Hola alumno de POO " + nombre);
    }
    public int getVida(){
        return vida;
    }
    public boolean setVida(int vida){
        if (vida >= 0 && vida < 100){
            this.vida = vida;
            return true;
        }
        return false;
    }
    public String toString(){
        return nombre + "\t" + vida;
    }
    public abstract void decVida();
    public abstract void decVida(int dec);
    public abstract void addVida();
    public abstract void addVida(int add);
}
