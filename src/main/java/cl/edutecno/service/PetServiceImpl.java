package cl.edutecno.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.edutecno.model.Pet;
import cl.edutecno.repository.PetRepository;

@Service
public class PetServiceImpl implements PetService{
	
	@Autowired
	private PetRepository petRepository;

	@Override
	@Transactional(readOnly = false)
	public void save(Pet pet) {
		petRepository.save(pet);
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Pet> findAll() {
		return petRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Pet findByNombre(String nombre) {
		return petRepository.findByNombre(nombre);
	}

}
