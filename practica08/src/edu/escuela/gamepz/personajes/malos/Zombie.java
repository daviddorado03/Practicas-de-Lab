package edu.escuela.gamepz.personajes.malos;

import edu.escuela.gamepz.personajes.Personaje;

public class Zombie extends Personaje{
    private boolean ataque;
    public Zombie(String nombre, int vida, boolean ataque){
        super(nombre, vida);
        this.ataque = ataque;
    }
    public Zombie(String nombre, boolean ataque){
        this(nombre, 3, ataque);
    }
    public Zombie(String nombre){
        this(nombre, 3, false);
    }
    public boolean getAtaque() {
        return ataque;
    }
    public String getDetalle(){
        return super.getDetalle() + "\t" + ataque;
    }
    public void decVida(){
        if(!ataque){
            super.decVida(3);
        } else {super.decVida(2);
        }
    }
    public void decVida(int dec){
        if(!ataque){
            super.decVida(3*dec);
        } else {super.decVida(2*dec);
        }
    }
    public void addVida(){
        if(ataque){
            super.addVida(3);
        }
    }
    public void addVida(int add){
        if(ataque){
            super.addVida(3*add);
        }
    }
}
