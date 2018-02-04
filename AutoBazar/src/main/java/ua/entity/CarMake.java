package ua.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ua.entity.abstractEntity.EntityStringNameColumn;


@Entity
@Table
public class CarMake extends EntityStringNameColumn {
	
	@Column
	private int year;
	
	@ManyToOne
	private CarModel carModel;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public CarModel getCarModel() {
		return carModel;
	}

	public void setCarModel(CarModel carModel) {
		this.carModel = carModel;
	}

	@Override
	public String toString() {
		return "CarMake [year=" + year + ", carModel=" + carModel + "]";
	}

}