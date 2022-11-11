package edu.escuela.gamepz.pruebas;
import java.util.LinkedList;
import java.util.TreeSet;

import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;
import edu.escuela.gamepz.utils.Escudo;
import edu.escuela.gamepz.utils.Tablero;

public class PruebaCollection {
    public static void main(String[] args) {
        Personaje[] datos = {
            new Planta("David", Tablero.genVida()), 
            new Zombie("Bianca",Tablero.genVida()),
            new Planta("Fabian", Tablero.genVida(), Escudo.MEDIO),
            new Planta("Almendra", Tablero.genVida()),
            new Planta("Ricardo", Tablero.genVida(),Escudo.BAJO),
            new Planta("Silvia",Tablero.genVida()),
            new Zombie("Armando", Tablero.genVida(), false),
            new Zombie("Josseline",Tablero.genVida(), true),
            new Zombie("Eduardo",Tablero.genVida())
        };
        TreeSet<Personaje> ts = new TreeSet<>();
        LinkedList<Personaje> linked = new LinkedList<>();
        
    }
}
