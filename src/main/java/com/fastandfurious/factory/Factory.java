// Factory.java
package com.fastandfurious.factory;

import com.fastandfurious.model.Chasis;
import com.fastandfurious.model.Cojineria;
import com.fastandfurious.model.Motor;

public abstract class Factory {
    public abstract Chasis crearChasis();

    public abstract Motor crearMotor();

    public abstract Cojineria crearCojineria();
}
