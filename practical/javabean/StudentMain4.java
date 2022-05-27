package corejava;

import java.util.ArrayList;
import java.util.List;


	public class StudentMain4 {
		public static void main(String[] args) {
		Student4 student = new Student4();
		List<Subject> subjects = new ArrayList<Subject>();
		Subject subject1 = new Subject();
		subject1.setCode(210);
		subject1.setName("English");
		subjects.add(subject1);
		Subject subject2 = new Subject();
		subject2.setCode(220);
		subject2.setName("Science");
		subjects.add(subject2);
		Subject subject3 = new Subject();
		subject3.setCode(230);
		subject3.setName("Computer");
		subjects.add(subject3);
		
		// setting bean values
		student.setId(72);
		student.setName("Harsh");
		student.setSubjects(subjects);
		// getting bean value
		System.out.println("Student Id : " + student.getId());
		System.out.println("Student name : " + student.getName());
		List<Subject> subjectList = student.getSubjects();
		for (int i = 0; i < subjectList.size(); i++) {
		Subject subject = subjectList.get(i);
		System.out.println("Student subject " + (i + 1) + " : " + subject.getCode() 
		+ " : " + subject.getName());
		}
		}
		}


