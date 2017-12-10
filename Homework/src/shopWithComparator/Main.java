package shopWithComparator;

import java.util.Scanner;

public class Main {

	private static final Scanner sc = new Scanner(System.in);
	private static final Shop s = new Shop();

	public static void main(String[] args) {

		menu();

	}

	private static void menu() {
		while (true) {
			System.out.println("------------Shop--------------");
			System.out.println("1 Add product");
			System.out.println("2 Delete producr");
			System.out.println("3 Chenge product");
			System.out.println("4 Sort by ");
			System.out.println("5 Exit ");
			System.out.println("Choose your destany - ");
			switch (sc.next()) {
			case "1":
				s.addTovar();
				break;
			case "2":
				System.out.println("Enter the name of product:");
				String name = sc.next();
				s.deleteTovar(name);
				break;
			case "3":
				System.out.println("Enter name old product to chenge");
				String nameOfReplace = sc.next();
				s.replaceTovar(nameOfReplace);
				break;
			case "4":
				while (true) {
					System.out.println("------------Sort--------------");
					System.out.println("1 Sort by name");
					System.out.println("2 Sort by leught");
					System.out.println("3 Sort by price");
					System.out.println("4 Sort by wight");
					System.out.println("5 Return");
					System.out.println("Choose your destany - ");
					switch (sc.next()) {
					case "1":
						s.sortByName().forEach(System.out::println);
						break;
					case "2":
						s.sortByLenght().forEach(System.out::println);
						break;
					case "3":
						s.sortByPrice().forEach(System.out::println);
						break;
					case "4":
						s.sortByWidth().forEach(System.out::println);
						break;
					case "5":
						menu();
						break;
					default:
						return;
					}
				}
			default:
				return;
			}
		}
	}
}
