package enumsCollections;

import java.util.Iterator;

public class Util {
	
	public static String printUnivercity(String enums) {
		String name = enums.toLowerCase();
		Character first = name.charAt(0);
		String bigLetter = first.toString().toUpperCase();
		String fromUppercace = name.replace(name.charAt(0), bigLetter.charAt(0));
		return fromUppercace;
	}
	
	public static void addStudentToMyCourse(Course course, String name) {
		course.getStudents().add(new Student(name));
	}
	
	public static void viewMyCoustomCourse(Course course) {
		System.out.println("Univercity: " + printUnivercity(course.getUnivercity().toString()));
		System.out.println("Course name: " + course.getName());
		
		System.out.println("Iterator");
		
		Iterator<Student> iterator = course.getStudents().iterator();
			while (iterator.hasNext()) {
				System.out.println("Get money from: " + iterator.next().getName());
			}
		
		course.getStudents().forEach(e -> System.out.println("Get money from: " + e.getName() + " java 8"));
	}
	
	public static boolean exist(Enum<? extends Univercity>[] enums, String name){
		for (int i = 0; i < enums.length; i++) {
			if(enums[i].name().toLowerCase().equals(name.toLowerCase())){
				return true;
			}
		}
		return false;
	}

}
