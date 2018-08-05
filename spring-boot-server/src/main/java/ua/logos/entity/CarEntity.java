package ua.logos.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name="car")
public class CarEntity extends BaseEntity{
	
	private String carId;
	
	private String make;
	
	private String model;
	
	private String color;
	
	private String image;
	
	@Column(columnDefinition="DECIMAL(2,1)")
	private BigDecimal engine;
	
	@Column(columnDefinition="DECIMAL(9,2)")

	private BigDecimal price;
	
	private LocalDate modelYear;
	
	private String transmission;
	
	private String typeOfDrive;
	
	private String fuelType;
	
	
	
	
}
