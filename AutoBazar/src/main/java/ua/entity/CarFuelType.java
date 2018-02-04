package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ua.entity.abstractEntity.EntityStringNameColumn;

@Entity
@Table
public class CarFuelType extends EntityStringNameColumn {
	
	@OneToMany
	private List<CarModel> carModels = new ArrayList<>();

	public List<CarModel> getCarModels() {
		return carModels;
	}

	public void setCarModels(List<CarModel> carModels) {
		this.carModels = carModels;
	}

}