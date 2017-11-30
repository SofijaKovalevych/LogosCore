package studyInterface;

public class Circle implements Geometry{
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getSquer() {
		return Math.PI*(radius*radius);
	}	

}
