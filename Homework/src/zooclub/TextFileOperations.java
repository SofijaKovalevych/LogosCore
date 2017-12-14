package zooclub;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TextFileOperations {

	public void save(Map<Person, List<Pet>> map) {
		try (FileWriter writer = new FileWriter("zoo.txt")) {
			Set<Person> persons = map.keySet();
			for (Person person : persons) {
				for (Pet pet : map.get(person)) {
					writer.write(person.toString() + pet + "\n");
				}
			}
		} catch (IOException e) {
		}
	}

	public Map<Person, List<Pet>> restore() {
		Map<Person, List<Pet>> map = new HashMap<>();
		try (Scanner sc = new Scanner(new File("zoo.txt"))) {
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				if (!line.isEmpty()) {
					String[] array = line.split("\\ ");
					Person person = new Person(Integer.valueOf(array[0]), array[1]);
					if (!map.containsKey(person)) {
						map.put(person, new ArrayList<>());
					}
					map.get(person).add(new Pet(array[2], Type.valueOf(array[3])));
				}
			}
		} catch (IOException e) {
		}
		return map;
	}

	public void addToFile(Map<Person, List<Pet>> map) {
		File file = new File("zoo.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try (FileWriter writer = new FileWriter(file, true)) {
			Set<Person> persons = map.keySet();
			for (Person person : persons) {
				for (Pet pet : map.get(person)) {
					writer.append(person.toString() + pet + "\n");
				}
			}
		} catch (IOException e) {
		}
	}

}
