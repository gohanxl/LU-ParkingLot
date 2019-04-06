package langash.ejercicio.estacionamiento;

//import java.time.Duration;
import java.util.ArrayList;

public class ParkingLot implements ParkingLotInterface {

	private Integer cantidadEstacionados = 0;
	private Integer espaciosDisponibles = 100;
	private Integer precioPorDia;

	private ArrayList<ParkedCars> CarsList;

	public ParkingLot() {

		CarsList = new ArrayList<ParkedCars>();

	}

	public Integer cantidadEstacionados() {

		if (CarsList.isEmpty()) {

			return null;
		}

		return cantidadEstacionados;
	}

	public Integer espaciosDisponibles() {

		if (espaciosDisponibles == 100) {

			return null;
		} else {

			espaciosDisponibles -= cantidadEstacionados;

			return espaciosDisponibles;
		}

	}

	public void ingresoDetectado(ParkedCars auto) {

		CarsList.add(auto);

		cantidadEstacionados++;
		espaciosDisponibles--;
		System.out.println("Ingreso Detectado\n");

	}

	public void egresoDetectado(ParkedCars auto) {

		if (CarsList.contains(auto)) {

			CarsList.remove(auto);

		}

		cantidadEstacionados--;
		espaciosDisponibles++;
		System.out.println("Egreso Detectado\n");
	}

	public int facturarEstadia(int precioPorDia, String patente) {

		this.precioPorDia = precioPorDia;
		int tarifa = 0;
		int dias = 0;

		for (ParkedCars e : CarsList) {

			if (e.getPatente().contains(patente)) {

				dias = (int) ((e.getFechaYHoraActual().getTime() - e.getFechaYHoraDeIngreso().getTime()) / 86400000);

			}

		}

		tarifa = precioPorDia * dias;

		return tarifa;
	}

	public Integer getCantidadEstacionados() {
		return cantidadEstacionados;
	}

	public void setCantidadEstacionados(Integer cantidadEstacionados) {
		this.cantidadEstacionados = cantidadEstacionados;
	}

	public Integer getEspaciosDisponibles() {
		return espaciosDisponibles;
	}

	public void setEspaciosDisponibles(Integer espaciosDisponibles) {
		this.espaciosDisponibles = espaciosDisponibles;
	}

	public Integer getPrecioPorDia() {
		return precioPorDia;
	}

	public void setPrecioPorDia(Integer precioPorDia) {
		this.precioPorDia = precioPorDia;
	}

	public ArrayList<ParkedCars> getCarsList() {
		return CarsList;
	}

	public void setCarsList(ArrayList<ParkedCars> carsList) {
		CarsList = carsList;
	}

	@Override
	public Integer precioPorDia() {
		// TODO Auto-generated method stub
		return null;
	}

}
