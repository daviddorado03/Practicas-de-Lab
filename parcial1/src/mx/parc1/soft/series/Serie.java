package src.mx.parc1.soft.series;

public class Serie{
    private int f;
    private int t1 = 1;
    private int t2;
    private int y;
    public int fiboN(int n){
        for (int i = 0; i <= n; i++){
            t2 = f;
            f = t1 + f;
            t1 = t2;
        }
        return t1;
    }
    public int genNumero(int x){
        for (int i = 0; i >= x; i++){
            y = (int)(Math.random()*10);
        }
        return y;
    }
}