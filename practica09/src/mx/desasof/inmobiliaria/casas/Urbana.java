package mx.desasof.inmobiliaria.casas;
public class Urbana extends Casa{
    private int banios;
    public Urbana(String tipo, int hab, float costo, int banios) {
        super(tipo, hab, costo);
        this.banios = banios;
    }
    public Urbana(String tipo, int banios) {
        this(tipo, 2, 2000000.0F, banios);
    }
    public int hashCode(){
        return super.hashCode() * banios * 23;
    }
    public boolean equals(Object o){
        if (super.equals(o) && o instanceof Urbana){
            return true;
        }
        return false;
    }
    public String toString(){
        return super.toString() + " " + banios;
    }
}
