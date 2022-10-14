package mx.desasof.inmobiliaria.pruebas;
import mx.desasof.inmobiliaria.casas.Casa;
import mx.desasof.inmobiliaria.casas.Campo;
import mx.desasof.inmobiliaria.casas.Urbana;
public class PruebaCasa {
    public static void main(String[] args) {
        Casa cas1 = new Casa("Estandar", 3, 3000000);
        Campo cam1 = new Campo("Cazador", 3.5F, 10F);
        Urbana urb1 = new Urbana("Residencia", 3, 2500000, 2);
        Casa cas2 = new Casa("Estandar", 3, 3000000);
        Campo cam2 = new Campo("Cazador", 3.5F, 10);
        Urbana urb2 = new Urbana("Residencia", 3, 2500000, 2);
        Casa cas3 = new Casa("Estandar");
        Campo cam3 = new Campo("Cazador", 4, 15000, 3f, 5f);
        Urbana urb3 = new Urbana("Residencia", 5);
        Casa [] casas = {cas1, cam1, urb1, cas2, cam2, urb2, cas3, cam3, urb3};
        int i = 0;
        while (i < casas.length){
            for (Casa c : casas) {
                if(casas[i] == c){
                    System.out.println(casas[i] + " son el mismo objeto " + c + "\n = = = = = ");
                }if(casas[i].equals(c)){
                    System.out.println(casas[i] + " son iguales " + c+ "\n e e e e e ");
                }System.out.println(casas[i] + " son diferentes " + c + "\n ! ! ! ! ! ");
            } System.out.println("----------------");
            i++;
        }
    }
}
