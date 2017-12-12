package independentWork;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import static independentWork.Tail.*;

public class Main {
	private static final List<Animal> ANIMALSLIST = new LinkedList<>();
	private static final HashSet<Animal> ANIMALSSET = new HashSet<>();
	private static final Map<Integer, Animal> ANIMALSMAP = new TreeMap<>();

	public static void main(String[] args) {

		Animal animal0 = new Animal("Shit", "Shit", 99, NO_TAIL);
		Animal animal1 = new Animal("Test", "Test", 88, TAIL);
		Animal animal2 = new Animal("Fruit", "Dead", 77, NO_TAIL);
		Animal animal3 = new Animal("HI", "No", 66, TAIL);
		Animal animal4 = new Animal("No", "Fear", 55, NO_TAIL);

		ANIMALSLIST.add(animal0);
		ANIMALSLIST.add(animal1);
		ANIMALSLIST.add(animal2);
		ANIMALSLIST.add(animal3);
		ANIMALSLIST.add(animal4);

		ANIMALSSET.addAll(ANIMALSLIST);

		ANIMALSMAP.put(4, animal4);
		ANIMALSMAP.put(2, animal2);
		ANIMALSMAP.put(0, animal0);
		ANIMALSMAP.put(3, animal3);
		ANIMALSMAP.put(1, animal1);

		System.out.println("List before sorting");
		ANIMALSLIST.forEach(System.out::println);

		Collections.sort(ANIMALSLIST, new Comparator<Animal>() {
			@Override
			public int compare(Animal animal1, Animal animal2) {
				if (animal1.getTail() == animal2.getTail()) {
					return animal1.getTail().compareTo(animal2.getTail());
				} else {
					return animal1.getTail().compareTo(animal2.getTail());
				}
			}
		});
		System.out.println("List after sorting");
		ANIMALSLIST.forEach(System.out::println);

		System.out.println("Set before sort:");
		ANIMALSSET.forEach(System.out::println);
		
		System.out.println("Set after sort:");
		ANIMALSSET.stream().sorted((o1, o2) -> -o2.getTail().compareTo(o1.getTail())).forEach(System.out::println);
		
		System.out.println("Sorted map:");
		for (java.util.Iterator<Entry<Integer, Animal>> iterator = ANIMALSMAP.entrySet().iterator(); iterator.hasNext();) {
			Entry<Integer, Animal> m = iterator.next();
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("Sorted map by tail:");
		ANIMALSMAP.entrySet().stream().sorted(Map.Entry.<Integer, Animal>comparingByValue((o1, o2) -> -o2.getTail().compareTo(o1.getTail()))).forEach(entry -> {
		       System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		});
	}
}
