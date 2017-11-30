package studyInterface;

public class MainGeometry {

	public static void main(String[] args) {
		
		Circle circle = new Circle(7.5);
		System.out.println("Circle square is: " + circle.getSquer());
		
		System.out.println();
		
		Squere squere = new Squere(15, 15);
		System.out.println("Square square is: " + squere.getSquer());

	}

}
