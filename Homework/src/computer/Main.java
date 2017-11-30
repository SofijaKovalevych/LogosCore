package computer;

public class Main {

	public static void main(String[] args) {

		Computer computer = new Computer("PC", 0, new Cpu("Intel", 9.99), new Mouse("Bloody", 9.99),
				new Keyboard("A4tech", 9.99), new Monitor("Samsung", 9.99));

		ComputerInterFace.computepSyso(computer);

	}

}
