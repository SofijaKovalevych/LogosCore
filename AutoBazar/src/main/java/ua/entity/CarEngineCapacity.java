package ua.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ua.entity.abstractEntity.AbstractEntityId;

@Entity
@Table
public class CarEngineCapacity extends AbstractEntityId {
	
	@Column
	private BigDecimal enginCapacity;
	
	@OneToMany
	private List<CarModel> carModels = new ArrayList<>();

	public BigDecimal getEnginCapacity() {
		return enginCapacity;
	}

	public void setEnginCapacity(BigDecimal enginCapacity) {
		this.enginCapacity = enginCapacity;
	}

	public List<CarModel> getCarModels() {
		return carModels;
	}

	public void setCarModels(List<CarModel> carModels) {
		this.carModels = carModels;
	}

}