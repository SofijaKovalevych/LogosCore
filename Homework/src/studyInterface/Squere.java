package studyInterface;

public class Squere implements Geometry{

	private int lenght;

	private int height;
	
	public Squere(int lenght, int height) {
		this.lenght = lenght;
		this.height = height;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public double getSquer() {
		return lenght*height;
	}

}
