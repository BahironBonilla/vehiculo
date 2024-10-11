// ToyotaFactory.java
package com.fastandfurious.factory;

import com.fastandfurious.model.Chasis;
import com.fastandfurious.model.Cojineria;
import com.fastandfurious.model.Motor;

public class ToyotaFactory extends Factory {
    @Override
    public Chasis crearChasis() {
        return new Chasis(4, "T123", "Automática");
    }

    @Override
    public Motor crearMotor() {
        return new Motor(240, "M123", "Eléctrico");
    }

    @Override
    public Cojineria crearCojineria() {
        return new Cojineria("C123", "Tela");
    }
}
