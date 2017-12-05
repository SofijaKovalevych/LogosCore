package zooclub;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Controller controller = new Controller();
		while (true) {
			System.out.println("Enter 1 to add person");
			System.out.println("Enter 2 to add pet");
			System.out.println("Enter 3 to show all zoo");
			System.out.println("Enter 4 to delete pet from person");
			System.out.println("Enter 5 to delete person");
			System.out.println("Enter 6 to delete pet");
			switch (sc.next()) {
			case "1":
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter age");
				int age = sc.nextInt();
				controller.addPerson(name, age);
				break;
			case "2":
				System.out.println("Enter name");
				name = sc.next();
				System.out.println("Enter age");
				age = sc.nextInt();
				System.out.println("Enter pet name");
				String petName = sc.next();
				System.out.println("Enter pet type");
				String type = sc.next();
				controller.addPet(name, age, petName, type);
				break;
			case "3":
				controller.print();
				break;
			case "4":
				System.out.println("Enter name");
				name = sc.next();
				System.out.println("Enter age");
				age = sc.nextInt();
				System.out.println("Enter pet name");
				petName = sc.next();
				System.out.println("Enter pet type");
				type = sc.next();
				controller.deletePet(name, age, petName, type);
				break;
			case "5":
				System.out.println("Enter name");
				name = sc.next();
				System.out.println("Enter age");
				age = sc.nextInt();
				controller.deletePerson(name, age);
				break;
			case "6":
				System.out.println("Enter pet name");
				petName = sc.next();
				System.out.println("Enter pet type");
				type = sc.next();
				controller.deletePetFromAllPersons(petName, type);
				break;
			default:
				sc.close();
				return;
			}
		}
	}
}
