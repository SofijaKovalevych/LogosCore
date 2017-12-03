package enumsCollections;

import java.util.Scanner;

import static enumsCollections.Util.*;

public class Main {
	
	final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Course myCourse = new Course();
		
		System.out.println("Set course name: ");
		
		myCourse.setName(sc.next());
		
		System.out.println("Course name is: " + myCourse.getName());
		
		System.out.println("Set univercity: ");
		
		String setUniver = sc.next();
		
		if (exist(Univercity.values(), setUniver)) {
			Univercity univercity = Univercity.valueOf(setUniver);
			myCourse.setUnivercity(univercity);
			System.out.println("Your course is in: " + printUnivercity(univercity.toString()));
		}else {
			System.out.println("Debil");
		}
		
		boolean marker = true;
	
		while(marker) {
			System.out.println("Enter 1 add student");
			System.out.println("Enter 2 to view course");			
			System.out.println("Enter 3 to exit");			
			switch(sc.next()) {
			case "1":
				System.out.println("Enter student name:");
				addStudentToMyCourse(myCourse, sc.next());
				break;
				case "2":
				viewMyCoustomCourse(myCourse);
				break;
				case "3":
					marker = false;
					break;
			default:
				return;
			}
				
		}
	}

}
