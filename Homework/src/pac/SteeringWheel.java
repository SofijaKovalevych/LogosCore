package pac;

public class SteeringWheel {
	private double radius;
	private boolean hydroPower;
	
	
	public SteeringWheel(double radius, boolean hydroPower) {
		super();
		this.radius = radius;
		this.hydroPower = hydroPower;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public boolean isHydroPower() {
		return hydroPower;
	}
	public void setHydroPower(boolean hydroPower) {
		this.hydroPower = hydroPower;
	}
	public double plusSteeringWheel(double k){
		if(k<0.5){
			System.out.println("Кермо не може бути меншим!");
			return radius;
		}else{
		radius = radius*k;
		System.out.println("радіус керма " + radius);
		return radius;
		}
	}
	
	public void tunning(){
		if(!hydroPower){
			hydroPower = true;
			System.out.println("На кермо потсавлений гідропідсилювач");
		}
	}
	
}
