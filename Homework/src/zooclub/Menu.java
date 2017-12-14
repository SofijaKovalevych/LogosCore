package zooclub;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Menu {

	public void mainMenu() {
		Controller controller = new Controller();
		TextFileOperations fileOperations = new TextFileOperations();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter 1 to add person");
			System.out.println("Enter 2 to add pet");
			System.out.println("Enter 3 to show all zoo");
			System.out.println("Enter 4 to delete pet from person");
			System.out.println("Enter 5 to delete person");
			System.out.println("Enter 6 to delete pet");
			System.out.println("Enter 7 to work with file");
			switch (sc.next()) {
			case "1":
				addPersonMenu(controller, sc);
				break;
			case "2":
				addPet(controller, sc);
				break;
			case "3":
				controller.print();
				break;
			case "4":
				deletePetFromPerson(controller, sc);
				break;
			case "5":
				deletePerson(controller, sc);
				break;
			case "6":
				deletePet(controller, sc);
				break;
			case "7":
				subMenu(controller, fileOperations, sc);
			default:
				sc.close();
				return;
			}
		}
	}

	private void addPersonMenu(Controller controller, Scanner sc) {
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter age");
		int age = sc.nextInt();
		controller.addPerson(name, age);
	}

	private void addPet(Controller controller, Scanner sc) {
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Enter pet name");
		String petName = sc.next();
		System.out.println("Enter pet type");
		String type = sc.next();
		controller.addPet(name, age, petName, type);
	}

	private void deletePetFromPerson(Controller controller, Scanner sc) {
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Enter pet name");
		String petName = sc.next();
		System.out.println("Enter pet type");
		String type = sc.next();
		controller.deletePet(name, age, petName, type);
	}

	private void deletePerson(Controller controller, Scanner sc) {
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter age");
		int age = sc.nextInt();
		controller.deletePerson(name, age);
	}

	private void deletePet(Controller controller, Scanner sc) {
		System.out.println("Enter pet name");
		String petName = sc.next();
		System.out.println("Enter pet type");
		String type = sc.next();
		controller.deletePetFromAllPersons(petName, type);
	}

	private void subMenu(Controller controller, TextFileOperations fileOperations, Scanner sc) {
		while (true) {
			System.out.println("Enter 1 to save to text file");
			System.out.println("Enter 2 to read from text file");
			System.out.println("Enter 3 to add to text file");
			System.out.println("Enter 4 to reright text file");
			System.out.println("Enter 5 to return to main menu");
			switch (sc.next()) {
			case "1":
				fileOperations.save(controller.getMap());
				break;
			case "2":
				Map<Person, List<Pet>> map = fileOperations.restore();
				if (!map.isEmpty())
					map.forEach((key, value) -> System.out.println(key + " -> " + value));
				else
					System.out.println("Zoo is empty");
				break;
			case "3":
				fileOperations.addToFile(controller.getMap());
				break;
			case "4":
				fileOperations.save(controller.getMap());
				break;
			case "5":
				mainMenu();
				break;
			default:
				return;
			}
		}
	}
}
