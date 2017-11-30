package oopSutdy;

public abstract class Weight {

	private int weight = 1000;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Weight [weight=" + weight + "]";
	}
	
}
