package oopSutdy;

public class Engine {
	
	private int horsePowore;

	public Engine(int horsePowore) {
		this.horsePowore = horsePowore;
	}

	public int getHorsePowore() {
		return horsePowore;
	}

	public void setHorsePowore(int horsePowore) {
		this.horsePowore = horsePowore;
	}

	@Override
	public String toString() {
		return "Engine [horsePowore=" + horsePowore + "]";
	}
	

}
