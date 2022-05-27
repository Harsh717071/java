package corejava;

public class Studentmain {
		public static void main(String[] args) {
		Student1 student = new Student1();
		//setting bean values
		student.setId(70);
		student.setName("harsh");
		student.setActive(true);
		//getting bean value
		System.out.println("Student Id : "+student.getId());
		System.out.println("Student name : "+student.getName());
		System.out.println("Student active : "+student.isActive());
		}
		}


