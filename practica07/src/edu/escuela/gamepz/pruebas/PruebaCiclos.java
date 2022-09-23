package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;

public class PruebaCiclos {
    public static void main(String[] args){
        Personaje per01 = new Personaje("Diego");
        Personaje per02 = new Personaje("Almendra");
        Personaje per03= new Personaje("Bianca");
        Personaje per04 = new Personaje("Jordan");
        int n = 0;
        int m = 0;
        while (n>=m){
            n = ((int)(Math.random()*100));
            m = ((int)(Math.random()*100));
        }
        System.out.println("n = " + n);
        System.out.println("m = " + m);
        for (int i = n; i < m; i++){
            int ed = ((int)(Math.random()*250));
            if (per01.setEdad(ed)){
                System.out.println(per01.getDetalle() + "se modificó la edad");
            } else {
                System.out.println(per01.getDetalle() + "sin modifcación en edad a " + ed);
            }
            ed = ((int)(Math.random()*250));
            if (per02.setEdad(ed)){
                System.out.println(per02.getDetalle() + "se modificó la edad");
            } else {
                System.out.println(per02.getDetalle() + "sin modifcación en edad a " + ed);
            }
            ed = ((int)(Math.random()*250));
            if (per03.setEdad(ed)){
                System.out.println(per03.getDetalle() + "se modificó la edad");
            } else {
                System.out.println(per03.getDetalle() + "sin modifcación en edad a " + ed);
            }
            ed = ((int)(Math.random()*200));
            System.out.println(ed);
            
        }
    }
}
