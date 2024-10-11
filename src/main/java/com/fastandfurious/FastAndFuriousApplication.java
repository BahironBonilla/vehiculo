// FastAndFuriousApplication.java
package com.fastandfurious;

import com.fastandfurious.controller.VehiculoController;
import com.fastandfurious.model.Vehiculo;

public class FastAndFuriousApplication {
	public static void main(String[] args) {
		VehiculoController controller = new VehiculoController();
		Vehiculo vehiculo = controller.ensamblarVehiculo("Ford", "Rojo", "E123");

		// Aquí puedes imprimir los detalles del vehículo ensamblado
		System.out.println("Vehículo ensamblado con éxito: " + vehiculo);
	}
}
