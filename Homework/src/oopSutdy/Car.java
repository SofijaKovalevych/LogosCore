package oopSutdy;

public class Car extends Weight{
	
	private String color;
	
	private String lable;
	
	private String carModel;
	
	private Engine engine;
	
	public static void staticToString(Car car){
		if(car.getCarModel()!=null){
			System.out.println("This car model: " + car.getCarModel());
		}else{
			System.out.println("This car model: is some shit");
		}
	}
	
	public static void countOfWhils(){
		System.out.println("Every car has four wheels");
	}
	
	public Car() {

	}

	public Car(String color, String lable, String carModel, Engine engine) {
		this.color = color;
		this.lable = lable;
		this.carModel = carModel;
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLable() {
		return lable;
	}

	public void setLable(String lable) {
		this.lable = lable;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", lable=" + lable + ", carModel=" + carModel + ", engine=" + engine + "]";
	}

	

}
