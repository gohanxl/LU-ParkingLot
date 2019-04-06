package langash.ejercicio.estacionamiento.test;

import java.text.ParseException;

import org.junit.Before;
import org.junit.Test;

import langash.ejercicio.estacionamiento.ParkedCars;
import langash.ejercicio.estacionamiento.ParkingLot;
import langash.ejercicio.estacionamiento.ServicioExterno;

public class ParkingLotTest {

	private ParkedCars auto1;
	private ParkedCars auto2;
	private ParkedCars auto3;
	private ParkingLot estacionamiento1;
	// private Duration duration;

	@Before

	public void inicializacion() throws ParseException {

		auto1 = new ParkedCars("asd@hotmail.com", "123ABC");
		auto2 = new ParkedCars("qwe@hotmail.com", "456DEF");
		auto3 = new ParkedCars("zxc@hotmail.com", "789GHI");
		estacionamiento1 = new ParkingLot();
		// this.duration = Duration.between(this.getFechaYHoraDeIngreso(),
		// this.getFechaYHoraActual());

	}

	@Test

	public void ParkingLotTest1() {

		estacionamiento1.ingresoDetectado(auto1);
		estacionamiento1.ingresoDetectado(auto2);
		estacionamiento1.ingresoDetectado(auto3);

		System.out.println("Cantidad de autos estacionados: " + estacionamiento1.cantidadEstacionados() + "\n");

		estacionamiento1.egresoDetectado(auto3);

		System.out.println("Cantidad de autos estacionados: " + estacionamiento1.cantidadEstacionados() + "\n");

		System.out.println("Fecha de Ingreso: " + auto1.getFechaYHoraDeIngreso());
		System.out.println("Fecha de Salida (Actual): " + auto1.getFechaYHoraActual());

		System.out.println("\nTotal Factura: " + estacionamiento1.facturarEstadia(10, "456DEF"));

		ServicioExterno.EnviarMail("asd", "aaaa", "clara");

	}

}
