public class Casa{
    private String tipo;
    private int hab;
    private float costo;
    public Casa(String tipo, int hab, float costo) {
        this.tipo = tipo;
        this.hab = hab;
        this.costo = costo;
    }
    public Casa(String tipo) {
        this(tipo, 2, 2000000.0F);
    }
    
}