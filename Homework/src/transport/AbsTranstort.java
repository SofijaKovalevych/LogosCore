package transport;

public abstract class AbsTranstort {
	
	private String name; 
	
	private int whells;
	
	private int pesengers;

	public AbsTranstort(int whells, int pesengers, String name) {
		this.whells = whells;
		this.pesengers = pesengers;
		this.name = name;
	}

	public int getWhells() {
		return whells;
	}

	public int getPesengers() {
		return pesengers;
	}

	public String getName() {
		return name;
	}

}
