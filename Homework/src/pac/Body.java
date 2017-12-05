package pac;

public class Body {
	private String color;
	int weight;
	public Body(String color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	public String getColor() {
		
		return "Текущий колір- "+ color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	

}
