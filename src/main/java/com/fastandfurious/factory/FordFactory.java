// FordFactory.java
package com.fastandfurious.factory;

import com.fastandfurious.model.Chasis;
import com.fastandfurious.model.Cojineria;
import com.fastandfurious.model.Motor;

public class FordFactory extends Factory {
    @Override
    public Chasis crearChasis() {
        return new Chasis(4, "F123", "Automática");
    }

    @Override
    public Motor crearMotor() {
        return new Motor(250, "M123", "Térmico");
    }

    @Override
    public Cojineria crearCojineria() {
        return new Cojineria("C123", "Cuero");
    }
}
