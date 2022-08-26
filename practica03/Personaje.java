public class Personaje {
    private String nombre;
    private int edad;
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void saludar(){
        System.out.println("Hola alumno de POO" + nombre);
    }
}
