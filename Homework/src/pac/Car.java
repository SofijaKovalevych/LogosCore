package pac;

public class Car {
	
	private SteeringWheel cermo;
	private Wheel [] wheels = new Wheel[4];
	
	private Body b;
	
	public Car() {
		cermo = new SteeringWheel(20, false);
		
		for (int i = 0; i < wheels.length; i++) {
			wheels[i] = new Wheel(30, "ë³òí³");
		}
		
		b = new Body("á³ëèé", 1300);
		
	}

	public void tunning() {
		 cermo.tunning();
		 
	}

	public void setCermo(SteeringWheel cermo) {
		this.cermo = cermo;
	}

	
	
	
	public void setColor(String color){
		b.setColor(color);
		
	}
	public String getColor(){
		return b.getColor();
	}
	public Wheel bord(int i){
		
		
		return wheels[i];
	}
}
