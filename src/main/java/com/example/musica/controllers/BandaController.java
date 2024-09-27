package com.example.musica.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.musica.models.Band;
import com.example.musica.repositories.BandRepository;

@RestController
public class BandaController {

	@Autowired
	private BandRepository bandRepository;

	@GetMapping("/bands") // Read

	public List<Band> bands() {
		return bandRepository.findAll();
	}

	@PostMapping("/bands") // Post - Create
	public void createBanda(@RequestBody Band band) {
		bandRepository.save(band);
	}

	@PutMapping("/bands") // Put - Update
	public void updateBanda(@RequestBody Band band) {
		Optional<Band> bandToFind = bandRepository.findById(band.getIdbanda());
		if (bandToFind != null) {
			bandRepository.save(band);
		}
	}

	@DeleteMapping("/bands") // Delete
	public void deleteBanda(@RequestParam(value = "idband") Long idband) {
		bandRepository.deleteById(idband);
	}

}
