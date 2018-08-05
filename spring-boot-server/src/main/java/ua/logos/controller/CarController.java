package ua.logos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.logos.domain.CarDTO;
import ua.logos.service.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {

	@Autowired
	private CarService carService;

	@PostMapping
	public ResponseEntity<Void> createCar(@RequestBody CarDTO carDTO) {
		carService.create(carDTO);
		return new ResponseEntity<>(HttpStatus.CREATED);

	}
	
	@GetMapping
	public ResponseEntity<List<CarDTO>> getAll(){
		return new ResponseEntity<List<CarDTO>>(carService.findAll(), HttpStatus.OK);
		
	}
	

}
