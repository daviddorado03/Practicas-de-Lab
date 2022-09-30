package mx.parc1.soft.parcial.pruebas;
import mx.parc1.soft.parcial.series.Serie;

public class TestSeries {
    public static void main(String[] args) {
        Serie s = new Serie();
        //int m = s.genNumero(100);
        //s.primos(m);
        //int o = s.primoN(m/10);
        // System.out.println(o);
        //int n = s.genNumero(100);
        //s.fibo(n);
        int n = s.genNumero(100);
        int p = s.fiboN(n);
        System.out.println(p);
    }
}
