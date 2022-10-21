package mx.gob.zacatecas.enumerados.equipos;
import mx.gob.zacatecas.enumerados.utileria.Tipo;
import mx.gob.zacatecas.enumerados.utileria.Memoria;
public class Computadora {
    private String marca;
    private Tipo tipo;
    private Memoria memoria;
    public Computadora(String marca, Tipo tipo, Memoria memoria) {
        this.marca = marca;
        this.tipo = tipo;
        this.memoria = memoria;
    }
    public String toString(){
        return marca +  tipo.getType() + " " + memoria.getVelocidad() + " " + memoria.getPines()+ tipo;
    }
}
