package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;;

public class PruebaHerencia {
    public static void main(String[] args) {
        Personaje per01 = new Personaje("David", 100);
        Personaje per02 = new Personaje("Bianca");
        Planta plan01 = new Planta("Fabian", 10, 'B');
        Planta plan02 = new Planta("Almendra", 50);
        Planta plan03 = new Planta("Ricardo", 'C');
        Planta plan04 = new Planta("Ricardo");
        Zombie zom01 = new Zombie("Armando", 80, false);
        Zombie zom02 = new Zombie("Josseline", true);
        Zombie zom03 = new Zombie("Eduardo");
        Personaje[] personajes = {per01,per02, plan01,plan02,plan03,plan04,zom01,zom02,zom03};
        int index = 0;
        for (Personaje p : personajes) {
            System.out.println(p.getDetalle());
            int al = (int)(Math.random()*101+1);
            if (p instanceof Planta){
                Planta tmp = (Planta) p;
                System.out.println("Soy planta "+ tmp.getEscudo());
                tmp.addVida(al);
            }
            if (p instanceof Zombie){
                Zombie tmp = (Zombie) p;
                System.out.println("Soy zombie "+ tmp.getAtaque());
                tmp.decVida(al);
            }
            System.out.println(al + "\n" + p.getDetalle() + "\n");
            System.out.println("*****Objeto " + ++index + "*****");
        }
    }
}
