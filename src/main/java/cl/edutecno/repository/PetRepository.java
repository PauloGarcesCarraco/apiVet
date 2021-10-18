package cl.edutecno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.edutecno.model.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long>{
	
	Pet findByNombre(String nombre);

}
