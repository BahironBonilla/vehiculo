// Vehiculo.java
package com.fastandfurious.model;

import java.util.Date;

public class Vehiculo {
    private Chasis chasis;
    private Motor motor;
    private Cojineria cojineria;
    private String color;
    private Date fechaEnsamblaje;
    private String numEnsamblaje;

    public Vehiculo(Chasis chasis, Motor motor, Cojineria cojineria, String color, Date fechaEnsamblaje,
            String numEnsamblaje) {
        this.chasis = chasis;
        this.motor = motor;
        this.cojineria = cojineria;
        this.color = color;
        this.fechaEnsamblaje = fechaEnsamblaje;
        this.numEnsamblaje = numEnsamblaje;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Cojineria getCojineria() {
        return cojineria;
    }

    public void setCojineria(Cojineria cojineria) {
        this.cojineria = cojineria;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getFechaEnsamblaje() {
        return fechaEnsamblaje;
    }

    public void setFechaEnsamblaje(Date fechaEnsamblaje) {
        this.fechaEnsamblaje = fechaEnsamblaje;
    }

    public String getNumEnsamblaje() {
        return numEnsamblaje;
    }

    public void setNumEnsamblaje(String numEnsamblaje) {
        this.numEnsamblaje = numEnsamblaje;
    }

    // Getters and Setters

}
