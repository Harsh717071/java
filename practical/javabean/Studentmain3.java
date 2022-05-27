package corejava;

import java.util.ArrayList;
import java.util.List;

public class Studentmain3 {
	
	public static void main(String[] args) {
	Student3 student = new Student3();
	List<String> subjects = new ArrayList<String>();
	subjects.add("English");
	subjects.add("Science");
	subjects.add("Maths");
	subjects.add("Computer");
	// setting bean values
	student.setId(71);
	student.setName("Harsh");
	student.setSubjects(subjects);
	// getting bean value
	System.out.println("Student Id : " + student.getId());
	System.out.println("Student name : " + student.getName());
	List<String> subjectList = student.getSubjects();
	for (int i = 0; i < subjectList.size(); i++) {
	System.out.println("Student subject " + (i + 1) + " : " + subjectList.get(i));
	}
	}
	}


