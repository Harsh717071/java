package corejava;

public class Studentmain2 {
	
	public static void main(String[] args) {
	Student2 student = new Student2();
	String[] subjects = { "English", "Science", "Computer","maths" };
	// setting bean values
	student.setId(71);
	student.setName("Harsh");
	student.setSubjects(subjects);
	// getting bean value
	System.out.println("Student Id : " + student.getId());
	System.out.println("Student name : " + student.getName());
	String[] subjectArray = student.getSubjects();
	for (int i = 0; i < subjectArray.length; i++) {
	System.out.println("Student subject " + (i + 1) + " : " + subjectArray[i]);
	}
	}
	}

