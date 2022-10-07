package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.Personaje;

public class Planta extends Personaje{
    private char escudo;
    public Planta(String nombre, int vida, char escudo){
        super(nombre, vida);
        this.escudo = escudo;
    }
    public Planta(String nombre, char escudo){
        this(nombre, 3, escudo);
    }
    public Planta(String nombre, int vida){
        this(nombre, vida, 'A');
    }
    public Planta(String nombre){
        this(nombre, 3, 'A');
    }
    public char getEscudo() {
        return escudo;
    }
    public String getDetalle(){
        return super.getDetalle() + "\t" + escudo;
    }
    public void decVida(){
        if(escudo == 'A'){
            super.decVida(2);
        } else {super.decVida();
        }
    }
    public void decVida(int dec){
        if(escudo == 'A'){
            super.decVida(2*dec);
        } else {super.decVida(dec);
        }
    }
    public void addVida(){
        if(escudo == 'A'){
            super.addVida(2);
        } else {super.addVida();
        }
    }
    public void addVida(int add){
        if(escudo == 'A'){
            super.addVida(2*add);
        } else {super.addVida(add);
        }
    }
}
