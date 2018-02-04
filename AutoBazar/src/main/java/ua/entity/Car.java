package ua.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ua.entity.abstractEntity.EntityStringNameColumn;

@Entity
@Table
public class Car extends EntityStringNameColumn{
	
	@Column
	private BigDecimal price;

	@ManyToOne
	private CarMake carMake;
	
	@ManyToOne
	private CarSeller carSeller;
	
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public CarMake getCarMake() {
		return carMake;
	}

	public void setCarMake(CarMake carMake) {
		this.carMake = carMake;
	}

	public CarSeller getCarSeller() {
		return carSeller;
	}

	public void setCarSeller(CarSeller carSeller) {
		this.carSeller = carSeller;
	}

	@Override
	public String toString() {
		return "Car [price=" + price + ", carMake=" + carMake + ", carSeller=" + carSeller + "]";
	}
	
}