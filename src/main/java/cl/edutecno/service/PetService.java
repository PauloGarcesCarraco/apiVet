package cl.edutecno.service;

import java.util.List;

import cl.edutecno.model.Pet;

public interface PetService {
	
	void save(Pet pet);
	Pet findByNombre(String nombre);
	List<Pet>findAll();

}
