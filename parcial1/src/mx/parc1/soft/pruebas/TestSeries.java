package src.mx.parc1.soft.pruebas;
import src.mx.parc1.soft.series.Serie;

public class TestSeries {
    public static void main(String[] args) {
        Serie s = new Serie();
        int m = s.genNumero(100);
        s.primos(m);
        int o = s.primoN(m/10);
        System.out.println(o);
        int n = s.genNumero(100);
        s.fibo(n);
        int p = s.fiboN(3, 11);
        System.out.println(p);
    }
}
