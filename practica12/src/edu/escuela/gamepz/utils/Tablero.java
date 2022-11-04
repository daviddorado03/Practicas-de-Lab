package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.Personaje;

public class Tablero {
    private static final int MAX_SIZE = 10;
    private static Personaje[] personajes = new Personaje[MAX_SIZE];
    private Tablero(){};
    public static void mostrar(){
        System.out.println("\nInicio *** Contenido del arreglo en Tablero");
        for (Personaje pos : personajes) {
            if ( pos == null){
                System.out.println(pos + "---");
            } else {
                System.out.println(pos + " " + Personaje);
            } System.out.println();
        }
    }
}
