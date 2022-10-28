package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.Escudo;

public class Planta extends Personaje{
    private Escudo escudo;
    public Planta(String nombre, int vida, Escudo escudo){
        super(nombre, vida);
        this.escudo = escudo;
    }
    public Planta(String nombre, Escudo escudo){
        this(nombre, 3, escudo);
    }
    public Planta(String nombre, int vida){
        this(nombre, vida, NULO);
    }
    public Planta(String nombre){
        this(nombre, 3, NULO);
    }
    public Escudo getEscudo() {
        return escudo;
    }
    public String toString(){
        return super.toString() + "\t" + escudo;
    }
    public void decVida(){
        if(escudo == 'A'){
            decVida(2);
        } else {decVida();
        }
    }
    public void decVida(int dec){
        if(escudo == 'A'){
            decVida(2*dec);
        } else {decVida(dec);
        }
    }
    public void addVida(){
        if(escudo == 'A'){
            addVida(2);
        } else {addVida();
        }
    }
    public void addVida(int add){
        if(escudo == 'A'){
            addVida(2*add);
        } else {addVida(add);
        }
    }
}
