// MazdaFactory.java
package com.fastandfurious.factory;

import com.fastandfurious.model.Chasis;
import com.fastandfurious.model.Cojineria;
import com.fastandfurious.model.Motor;

public class MazdaFactory extends Factory {
    @Override
    public Chasis crearChasis() {
        return new Chasis(4, "M123", "Mecánica");
    }

    @Override
    public Motor crearMotor() {
        return new Motor(220, "M123", "Híbrido");
    }

    @Override
    public Cojineria crearCojineria() {
        return new Cojineria("C123", "Sintético");
    }
}
