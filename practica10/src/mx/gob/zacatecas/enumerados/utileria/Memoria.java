package mx.gob.zacatecas.enumerados.utileria;
public enum Memoria{
    DDR("memoriaRam", 166.0f, 30), 
    DDR2("Laptop", 240.0f, 35), 
    DDR3("Laptop Nueva", 533.0f, 40), 
    DDR4("Gamer", 1600.0f, 40);
    private final String tipo;
    private final float velocidad;
    private final int pines;
    private Memoria(String tipo, float velocidad, int pines) {
        this.tipo = tipo;
        this.velocidad = velocidad;
        this.pines = pines;
    }
    public String getTipo() {
        return tipo;
    }
    public float getVelocidad() {
        return velocidad;
    }
    public int getPines() {
        return pines;
    }
}
