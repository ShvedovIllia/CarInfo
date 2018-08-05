package ua.logos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.logos.domain.CarDTO;
import ua.logos.entity.CarEntity;
import ua.logos.repository.CarRepository;
import ua.logos.service.CarService;
import ua.logos.service.utils.ObjectMapperUtils;
import ua.logos.service.utils.StringUtils;

@Service
public class CarServiceImpl implements CarService{

	@Autowired
	private CarRepository carRepository;
	
	@Autowired
	private ObjectMapperUtils modelMapper;
	
	@Autowired
	private StringUtils stringUtils;
	
	@Override
	public void create(CarDTO carDTO) {
		carDTO.setCarId(stringUtils.generate());
		carRepository.save(modelMapper.map(carDTO, CarEntity.class));
	}

	@Override
	public void update(CarDTO carDTO) {
		carRepository.save(modelMapper.map(carDTO, CarEntity.class));

	}

	@Override
	public void delete(String carId) {
		CarEntity car = carRepository.findByCarId(carId);
		carRepository.delete(car);
	}

	@Override
	public List<CarDTO> findAll() {
		return modelMapper.mapAll(carRepository.findAll(), CarDTO.class);
	}

	@Override
	public CarDTO findById(String carId) {
		return modelMapper.map(carRepository.findByCarId(carId), CarDTO.class);
	}

}
