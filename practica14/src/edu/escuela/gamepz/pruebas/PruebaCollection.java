package edu.escuela.gamepz.pruebas;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;
import edu.escuela.gamepz.utils.BySize;
import edu.escuela.gamepz.utils.ByVida;
import edu.escuela.gamepz.utils.Escudo;
import edu.escuela.gamepz.utils.Tablero;

public class PruebaCollection{
    public static void main(String[] args) {
        String path = System.getProperty("user.home")+ System.getProperty("file.separator");
        String path1 = path;
        Scanner s = new Scanner(System.in);
        String fname = s.nextLine();
        path += fname;
        File f = new File(path);
        if (f.exists() ){
            if (f.isFile()){
                System.out.println("El archivo existe");
                System.exit(0);
            } if (f.isDirectory()){
                mostrarDirectorio(f);
                System.exit(0);
            }
        }
        Personaje[] datos = {
            new Planta("Fabian", Tablero.genVida()), 
            new Zombie("Bianca",Tablero.genVida()),
            new Planta("Fabian", Tablero.genVida(), Escudo.MEDIO),
            new Planta("Armando", Tablero.genVida()),
            new Planta("Bianca", Tablero.genVida(),Escudo.BAJO),
            new Planta("Dayan",Tablero.genVida()),
            new Zombie("Armando", Tablero.genVida(), false),
            new Zombie("Dayan",Tablero.genVida(), true),
            new Zombie("Armando",Tablero.genVida())
        };
        TreeSet<Personaje> ts = new TreeSet<>();
        LinkedList<Personaje> linked = new LinkedList<>();
        for (Personaje personaje : datos) {
            ts.add(personaje);
            linked.add(personaje);
        }
        System.out.println("---Orden Natural---");
        for (Personaje p : ts) {
            System.out.println(p);
        }
        System.out.println("---Orden Vida---");
        Collections.sort(linked, new ByVida());
        for (Personaje p : linked) {
            System.out.println(p);
        }
        ArrayList<Personaje> arr = new ArrayList<>();
        arr.addAll(linked);
        System.out.println("---Orden Tamanio---");
        Collections.sort(arr, new BySize());
        for (Personaje p : arr) {
            System.out.println(p);
        }
        guardarObjetos(f, ts);
    }
    private static void mostrarDirectorio(File f){
        for (String s : f.list()) {
            System.out.println(s);
        }
    }
    
    private static void guardarObjetos(File f, TreeSet ts) {
        try {
            FileOutputStream file = new FileOutputStream (f );
            ObjectOutputStream s = new ObjectOutputStream (file);
            for(Object o : ts){
                Personaje p = (Personaje) o;
                s.writeObject (p);
            } 
            file.close();
            s.close ();}
        catch (IOException e) {
            e.printStackTrace ();
        } 
    }
}
