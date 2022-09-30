package src.mx.parc1.soft.series;

public class Serie{
    private int f;
    private int t1 = 1;
    private int t2;
    public int fiboN(int n){
        for (int i = 1; i <= n; i++){
            t2 = f;
            f = t1 + f;
            t1 = t2;
            return t1;
        }
    }
}