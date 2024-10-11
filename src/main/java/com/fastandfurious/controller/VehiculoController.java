// VehiculoController.java
package com.fastandfurious.controller;

import com.fastandfurious.factory.Factory;
import com.fastandfurious.factory.FordFactory;
import com.fastandfurious.factory.MazdaFactory;
import com.fastandfurious.factory.ToyotaFactory;
import com.fastandfurious.model.Chasis;
import com.fastandfurious.model.Cojineria;
import com.fastandfurious.model.Motor;
import com.fastandfurious.model.Vehiculo;

import java.util.Date;

public class VehiculoController {
    public Vehiculo ensamblarVehiculo(String marca, String color, String numEnsamblaje) {
        Factory factory;

        switch (marca.toLowerCase()) {
            case "ford":
                factory = new FordFactory();
                break;
            case "mazda":
                factory = new MazdaFactory();
                break;
            case "toyota":
                factory = new ToyotaFactory();
                break;
            default:
                throw new IllegalArgumentException("Marca no soportada");
        }

        Chasis chasis = factory.crearChasis();
        Motor motor = factory.crearMotor();
        Cojineria cojineria = factory.crearCojineria();

        return new Vehiculo(chasis, motor, cojineria, color, new Date(), numEnsamblaje);
    }
}
