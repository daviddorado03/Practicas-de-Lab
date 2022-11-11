package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.Personaje;

public class Tablero {
    public static final int MAX_SIZE = 10;
    public static Personaje[] personajes = new Personaje[MAX_SIZE];
    private Tablero(){};
    public static void mostrar(){
        System.out.println("\nInicio *** Contenido del arreglo en Tablero");
        for (int i = 0; i < personajes.length; i++) {
            if ( personajes[i] == null){
                System.out.println(i + "---");
            } else {
                System.out.println(i + " " + personajes[i]);
            }
        } System.out.println("Fin *** Contenido del arreglo en Tablero\n");
    }
    public static void insertar(Personaje p, int pos) throws PersException{
        if (pos < 0 || pos >= MAX_SIZE ){
            throw new PersException("Indice fuera de rango ", pos);
        } personajes[pos] = p;
    }
    public static void borrar(int pos) throws PersException{
        if (pos < 0 || pos >= MAX_SIZE ){
            throw new PersException("Indice fuera de rango ", pos);
        } if ( personajes[pos] == null){
            throw new PersException("Si personaje para borrar ", pos);
        }personajes[pos] = null;
    }
    public static int genVida(){
        return (int)(Math.random()*10+1);
    }
}
