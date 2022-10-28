package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;
import edu.escuela.gamepz.utils.Escudo;

public class PruebaHerencia {
    public static void main(String[] args) {
        Personaje per01 = new Planta("David", 100);
        Personaje per02 = new Zombie("Bianca");
        Planta plan01 = new Planta("Fabian", 10, Escudo.MEDIO);
        Planta plan02 = new Planta("Almendra", 50);
        Planta plan03 = new Planta("Ricardo", Escudo.BAJO);
        Planta plan04 = new Planta("Silvia");
        Zombie zom01 = new Zombie("Armando", 80, false);
        Zombie zom02 = new Zombie("Josseline", true);
        Zombie zom03 = new Zombie("Eduardo");
        Personaje[] personajes = {per01,per02, plan01,plan02,plan03,plan04,zom01,zom02,zom03};
        int index = 0;
        for (Personaje p : personajes) {
            System.out.println(p);
            int al = (int)(Math.random()*10);
            if (p instanceof Planta){
                Planta tmp = (Planta) p;
                System.out.println("Soy planta "+ tmp.getEscudo());
                tmp.addVida(al);
            }
            if (p instanceof Zombie){
                Zombie tmp = (Zombie) p;
                System.out.println("Soy zombie "+ tmp.getAtaque() );
                tmp.come();
                tmp.decVida(al);
            }
            System.out.println(al + "\n" + p + "\n");
            System.out.println("*****Objeto " + ++index + "*****");
        }
    }
}
