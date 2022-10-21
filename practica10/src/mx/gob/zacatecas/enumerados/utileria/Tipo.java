package mx.gob.zacatecas.enumerados.utileria;
public enum Tipo {
    SERVER ("Servidor"), 
    WORKSTATION("Estación de trabajo"), 
    DESKTOP ("Escritorio"), 
    LAPTOP ("Portatil");
    private final String type;
    private Tipo(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
}
