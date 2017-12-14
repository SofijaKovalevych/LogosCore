package zooclub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Controller {

	private Map<Person, List<Pet>> map = new HashMap<>();

	public void addPerson(String name, int age) {
		map.put(new Person(age, name), new ArrayList<Pet>());
	}

	public void addPet(String name, int age, String petName, String type) {
		List<Pet> pets = map.get(new Person(age, name));
		if (pets != null) {
			pets.add(new Pet(petName, Type.valueOf(type.toUpperCase())));
		}
	}

	public void deletePet(String name, int age, String petName, String type) {
		List<Pet> pets = map.get(new Person(age, name));
		if (pets != null) {
			pets.removeIf((pet) -> pet.getName().equals(petName)
					&& pet.getType() == Type.valueOf(type.toUpperCase()));
		}
	}

	public void deletePerson(String name, int age) {
		map.remove(new Person(age, name));
	}

	public void deletePetFromAllPersons(String petName, String type) {
		map.forEach((key, value) -> value.removeIf((pet) -> pet.getName()
				.equals(petName)
				&& pet.getType() == Type.valueOf(type.toUpperCase())));
	}

	public void print() {
		if (!map.isEmpty())
			map.forEach((key, value) -> System.out.println(key + " -> " + value));
		else
			System.out.println("Zoo is empty");
	}

	public Map<Person, List<Pet>> getMap() {
		return map;
	}

	public void setMap(Map<Person, List<Pet>> map) {
		this.map = map;
	}

}
