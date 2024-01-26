package cl.dprebootcamp.viernes.repository;

import java.util.ArrayList;

import cl.dprebootcamp.viernes.domain.Persona;

public class PersonaRepository {
	
	
	
	private ArrayList<Persona> listadoPersonas= new ArrayList<Persona>();
	
	
	
	public void guardar(Persona persona) {
		listadoPersonas.add(persona);
	}
	
	
	public ArrayList<Persona> getList() {
		return listadoPersonas;
	}

}
