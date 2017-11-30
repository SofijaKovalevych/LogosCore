package studyInterface;

public class Human {
	
	private String name;
	
	private final String age = "Infinity";
	
	public Human(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Human [Name=" + name + ", Ege=" + age + "]";
	}

}
