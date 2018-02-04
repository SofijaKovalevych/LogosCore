package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ua.entity.abstractEntity.EntityStringNameColumn;

@Entity
@Table
public class CarModel extends EntityStringNameColumn{
	
	@OneToMany
	private List<CarMake> carMakes = new ArrayList<>();

	@ManyToOne
	private CarColor carColor;
	
	@ManyToOne
	private CarFuelType carFuelType;

	public List<CarMake> getCarMakes() {
		return carMakes;
	}

	public void setCarMakes(List<CarMake> carMakes) {
		this.carMakes = carMakes;
	}

	public CarColor getCarColor() {
		return carColor;
	}

	public void setCarColor(CarColor carColor) {
		this.carColor = carColor;
	}

	public CarFuelType getCarFuelType() {
		return carFuelType;
	}

	public void setCarFuelType(CarFuelType carFuelType) {
		this.carFuelType = carFuelType;
	}
	

}
