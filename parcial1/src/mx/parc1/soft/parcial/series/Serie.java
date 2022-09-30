package mx.parc1.soft.parcial.series;

public class Serie{
    private int f;
    private int x =1;
    private int y;
    public int fiboN(int n){
        for (int i = 0; i <= n; i++){
            y = f;
            f = x + f;
            x = y;
        }
        return x;
    }
    public int genNumero(int x){
        y = 0;
        if (x < 10){
            x = 100;
        }
        while (y < x){
            y = (int)(Math.random()*x*10);
        }
        return y;
    }
}
