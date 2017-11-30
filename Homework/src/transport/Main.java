package transport;

import java.util.Scanner;

public class Main {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter passanget name:");
		String name = sc.next();

		AbsTranstort transport = choose();
		Pasanger pasanger = new Pasanger(name, transport);
		System.out.println(pasanger);

	}

	private static AbsTranstort choose() {
		System.out.println("Choose transport:");
		System.out.println("1 car");
		System.out.println("2 track");
		System.out.println("3 bus");
		AbsTranstort transport = chooseWehicle(sc.next());
		return transport;
	}

	private static AbsTranstort chooseWehicle(String num) {
		try {
			int number = Integer.valueOf(num);
			if (number == 1) {
				return new Car();
			} else if (number == 2) {
				return new Track();
			} else if (number == 3)
				return new Bus();

			System.out.println("What are your doing your morran!!!");
			return choose();
		} catch (NumberFormatException e) {
			System.out.println("What are your doing your morran!!!");
			return choose();
		}
	}
}
