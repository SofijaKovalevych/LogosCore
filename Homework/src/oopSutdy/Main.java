package oopSutdy;

public class Main {

	public static void main(String[] args) {
		Engine engine = new Engine(100);
		Car car = new Car("Red", "Ferrari", "F50", engine);
		
		System.out.println(car + " " + " car weight: " + car.getWeight());

		Car car1 = new Car("Red", "Ferrari", "F15", new Engine(500));
		car1.setWeight(1500);
		
		System.out.println(car1 + " car weight: " + car1.getWeight());
		
		Car car2 = new Car();
		car2.setCarModel("Shit");
		Car.staticToString(car2);
		Car.staticToString(car);
		Car car3 = new Car();
		Car.staticToString(car3);
		Car.countOfWhils();
	}

}
