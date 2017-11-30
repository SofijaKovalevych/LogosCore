package homeworkCar;

public class Car{

	int speed;
	String color;
	String name;
	static int wheels = 4;

	public static void main(String[] args) {
		Car vaz = new Car(5, "red", "Vaz");
		System.out.println(vaz);

		Car skoda = new Car(6, "green", "Skoda");
		System.out.println(skoda);
		
	}
	
	public Car(int speed, String color, String name) {
		this.speed = speed;
		this.color = color;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car speed:" + speed + ", color: " + color + ", name: " + name + ", wheels: " + wheels;
	}		
		
}