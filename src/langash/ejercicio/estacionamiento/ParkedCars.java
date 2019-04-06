package langash.ejercicio.estacionamiento;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
//import java.time.ZonedDateTime;
import java.util.Date;

public class ParkedCars {

	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	private Date fechaYHoraDeIngreso;
	private Date fechaYHoraActual;
	private String mail;
	private String patente;
	private Duration duration;

	public ParkedCars(String mail, String patente) throws ParseException {

		this.fechaYHoraActual = dateFormat.parse("2019-03-12");
		this.fechaYHoraDeIngreso = dateFormat.parse("2019-03-10");
		this.mail = mail;
		this.patente = patente;

	}

	public Date getFechaYHoraDeIngreso() {
		return fechaYHoraDeIngreso;
	}

	public void setFechaYHoraDeIngreso(Date fechaYHoraDeIngreso) {
		this.fechaYHoraDeIngreso = fechaYHoraDeIngreso;
	}

	public Date getFechaYHoraActual() {
		return fechaYHoraActual;
	}

	public void setFechaYHoraActual(Date fechaYHoraActual) {
		this.fechaYHoraActual = fechaYHoraActual;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

}
