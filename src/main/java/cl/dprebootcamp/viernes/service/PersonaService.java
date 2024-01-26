package cl.dprebootcamp.viernes.service;

import java.util.ArrayList;

import cl.dprebootcamp.viernes.domain.Persona;
import cl.dprebootcamp.viernes.dto.PersonaDto;
import cl.dprebootcamp.viernes.repository.PersonaRepository;
import cl.dprebootcamp.viernes.util.ValidaRut;

public class PersonaService {
	
	private PersonaRepository personaRepository= new PersonaRepository();
	
	
	
	public boolean guardarPersona(PersonaDto personaDto) {
		
		
		if(personaDto.getEdad()<18) {
			System.out.println("NO SE GUARDA Por MENOR DE EDAD!!!!!");
			return false;
		}
		if( ValidaRut.validar(personaDto.getRut()) == false ) {
			System.out.println("NO SE GUARDA Por RUT INVALIDO!!!!!");
			return false;
		}
		
		Persona persona= new Persona();
		
		persona.setRut(personaDto.getRut());
		persona.setNombres(personaDto.getNombres());
		persona.setApellidos(personaDto.getApellidos());
		persona.setFechaNaciminento(personaDto.getFechaNaciminento());
		
		
		System.out.println("SE GUARDA!!!!!");
		personaRepository.guardar(persona);
		
		return true;
	}
	
	public ArrayList<Persona> getListado(){
		return personaRepository.getList();
	}

}
