// Motor.java
package com.fastandfurious.model;

public class Motor {
    private int potenciaMaxima;
    private String numPieza;
    private String tecnologia;

    public Motor(int potenciaMaxima, String numPieza, String tecnologia) {
        this.potenciaMaxima = potenciaMaxima;
        this.numPieza = numPieza;
        this.tecnologia = tecnologia;
    }

    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public void setPotenciaMaxima(int potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    public String getNumPieza() {
        return numPieza;
    }

    public void setNumPieza(String numPieza) {
        this.numPieza = numPieza;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    // Getters and Setters

}
