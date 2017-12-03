package enumsCollections;

import java.util.ArrayList;
import java.util.List;

public class Course {

	private String name;
	
	private Univercity univercity;

	private List<Student> students = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Univercity getUnivercity() {
		return univercity;
	}

	public void setUnivercity(Univercity univercity) {
		this.univercity = univercity;
	}

	
}
