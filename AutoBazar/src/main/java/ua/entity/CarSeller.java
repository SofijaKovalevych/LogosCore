package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ua.entity.abstractEntity.EntityStringNameColumn;

@Entity
@Table
public class CarSeller extends EntityStringNameColumn {
	
	@Column
	private String lastName;
	
	@Column
	private int age;
	
	@Column
	private String phoneNumber;
	
	@OneToMany
	private List<Car> cars = new ArrayList<>();

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "CarSeller [lastName=" + lastName + ", age=" + age + ", phoneNumber=" + phoneNumber + ", cars=" + cars
				+ "]";
	}
	
}
