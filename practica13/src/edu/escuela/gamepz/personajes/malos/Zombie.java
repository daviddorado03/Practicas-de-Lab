package edu.escuela.gamepz.personajes.malos;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.Muerto;
public class Zombie extends Personaje implements Muerto{
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
    public String toString(){
        return super.toString() + "\t" + ataque;
    }
    public void decVida(){
        if(!ataque){
            setVida(vida - 3);
        } else {setVida(vida -2);
        }
    }
    public void decVida(int dec){
        if(!ataque){
            setVida(vida - 3*dec);
        } else {setVida(vida - 2*dec);
        }
    }
    public void addVida(){
        if(ataque){
            setVida(vida + 3);
        }
    }
    public void addVida(int add){
        if(ataque){
            setVida(vida + 3*add);
        }
    }
    public void come(){
        System.out.println("Comer cerebros");
    }
}
