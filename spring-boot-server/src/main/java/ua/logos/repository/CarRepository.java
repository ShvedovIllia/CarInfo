package ua.logos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.logos.entity.CarEntity;

@Repository

public interface CarRepository extends JpaRepository<CarEntity, Long>{

	CarEntity findByCarId(String carId);
}
