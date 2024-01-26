package cl.dprebootcamp.viernes.dto;

import java.time.LocalDate;
import java.time.Period;

public class PersonaDto {
	
	
	public PersonaDto(String rut, String nombres, String apellidos, LocalDate fechaNaciminento) {
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaNaciminento = fechaNaciminento;
	}

	private String rut;
	
	private String nombres;
	
	private String apellidos;
	
	private LocalDate fechaNaciminento;
	
	
	public String getRut() {
		
		return rut;
	}
	public String getNombres() {
		return nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public LocalDate getFechaNaciminento() {
		return fechaNaciminento;
	}
	
	public int getEdad() {
		
		Period perido= Period.between(fechaNaciminento, LocalDate.now());
		
		return perido.getYears();
	}

}
