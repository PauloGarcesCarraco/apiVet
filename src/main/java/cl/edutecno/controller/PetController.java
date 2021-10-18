package cl.edutecno.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.edutecno.model.Pet;
import cl.edutecno.service.PetService;

@RestController
@RequestMapping("/api/v1/pet")
public class PetController {
	
	@Autowired
	private PetService petService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody Pet pet) {
		petService.save(pet);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	List <Pet> findAll(){
		return petService.findAll();
	}

}
