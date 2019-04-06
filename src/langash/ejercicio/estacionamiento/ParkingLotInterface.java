package langash.ejercicio.estacionamiento;

public interface ParkingLotInterface {

	public Integer cantidadEstacionados();

	public Integer espaciosDisponibles();

	public Integer precioPorDia();

	public void ingresoDetectado(ParkedCars auto);

	public void egresoDetectado(ParkedCars auto);

	public int facturarEstadia(int PrecioPorDia, String Patente); // se puede sacar el string patente ya que no le damos
																	// una fecha
																	// especifica a cada auto

}
