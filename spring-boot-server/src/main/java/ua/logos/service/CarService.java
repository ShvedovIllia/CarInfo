package ua.logos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ua.logos.domain.CarDTO;

@Service

public interface CarService {
	
	void create(CarDTO carDTO);
	
	void update(CarDTO carDTO);
	
	void delete(String carId);
	
	List<CarDTO> findAll();
	
	CarDTO findById(String carId);

}
