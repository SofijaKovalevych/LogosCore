package shopWithComparator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.Comparator.comparingInt;

public class Shop {

	private static final Scanner sc = new Scanner(System.in);
	ArrayList<Comodity> List = new ArrayList<>();

	public void addTovar() {
		System.out.println("**********Product options*************");
		System.out.println("Product name: ");
		String name = sc.next();
		System.out.println("Price: ");
		int price = sc.nextInt();
		System.out.println("Wight: ");
		int wigth = sc.nextInt();
		System.out.println("Lenght: ");
		int len = sc.nextInt();
		List.add(new Comodity(name, price, wigth, len));
		List.forEach(System.out::println);
	}

	public void deleteTovar(String name) {
		Iterator<Comodity> iterator = List.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getName().equals(name)) {
				iterator.remove();
			}
		}
		for (Comodity comodity : List) {
			System.out.println("Product " + comodity);
		}
	}

	public void replaceTovar(String nameOfReplace) {
		System.out.println("Price: ");
		int price = sc.nextInt();
		System.out.println("Widht: ");
		int wigth = sc.nextInt();
		System.out.println("Leght: ");
		int len = sc.nextInt();
		Comodity c = new Comodity(nameOfReplace, price, wigth, len);
		int j = 0;
		for (int i = 0; i < List.size(); i++) {
			if (List.get(i).getName().equals(nameOfReplace)) {
				j = i;
			} else {
				System.out.println("No product with this name found");
				return;
			}
		}
		List.set(j, c);
		for (Comodity comodity : List) {
			System.out.println(comodity);
		}
	}

	public Stream<Comodity> sortByName() {
		return List.stream().sorted((o1, o2)->o1.getName().compareTo(o2.getName()));
	}

	public Stream<Comodity> sortByLenght() {
		return List.stream().sorted(comparingInt(Comodity::getLenght));
	}

	public Stream<Comodity> sortByPrice() {
		return List.stream().sorted(comparingInt(Comodity::getPrice));
	}

	public Stream<Comodity> sortByWidth() {
		return List.stream().sorted(comparingInt(Comodity::getWidth));
	}
}
