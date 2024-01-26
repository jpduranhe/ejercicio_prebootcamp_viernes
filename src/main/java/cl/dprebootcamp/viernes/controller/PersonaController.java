package cl.dprebootcamp.viernes.controller;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.dprebootcamp.viernes.domain.Persona;
import cl.dprebootcamp.viernes.dto.PersonaDto;
import cl.dprebootcamp.viernes.service.PersonaService;



@RestController
@RequestMapping("/persona")
public class PersonaController {
	
	
	private PersonaService personaService= new PersonaService();
	
		
	@GetMapping("/listado")
	public ArrayList<Persona> getListado() {
		
		
		return personaService.getListado();
	}
	
	@PostMapping("/guardar")
	public boolean postPersona( @RequestBody Persona persona) {
		
		
		  PersonaDto personaDtoSalida= new PersonaDto(persona.getRut(),persona.getNombres(),persona.getApellidos(),persona.getFechaNaciminento());
		  
		  
		 boolean seGuarda= personaService.guardarPersona(personaDtoSalida);
		  
		  return seGuarda;
		
	}

}
