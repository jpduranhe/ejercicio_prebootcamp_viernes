package cl.dprebootcamp.viernes.domain;

import java.time.LocalDate;

public class Persona {
	
	public Persona() {
		
	}
	
	
	public Persona(String rut, String nombres, String apellidos, LocalDate fechaNaciminento) {
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

	public void  setRut(String rut) {
		this.rut=rut;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNaciminento() {
		return fechaNaciminento;
	}

	public void setFechaNaciminento(LocalDate fechaNaciminento) {
		this.fechaNaciminento = fechaNaciminento;
	}
	
	
}
