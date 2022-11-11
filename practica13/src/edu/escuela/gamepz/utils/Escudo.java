package edu.escuela.gamepz.utils;
public enum Escudo {
    SUPER (0), MEDIO (1), BAJO (2), NULO (3);
    private final int nivel;
    private Escudo(int nivel) {
        this.nivel = nivel;
    }
    public int getNivel(){
        return nivel;
    }
}
