package pac;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car bmw = new Car();
		System.out.println(bmw.getColor());
		
		bmw.tunning();
		
		bmw.setColor("рожевий");
		System.out.println(bmw.getColor());
		
		Wheel w = bmw.bord(2);
		System.out.println("знято колесо " + w);
		
		
		
		
		
	}

}
