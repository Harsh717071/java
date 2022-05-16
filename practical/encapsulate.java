package corejava;

public class encapsulate {
     public static void main(String[]args) {
    	 //creating object of encapsulation class
    	 encapsulation e= new encapsulation();
    	 
    	 
    	 //setting value of variable
    	 e.setName("harsh");
    	 e.setAge(20);
    	 e.setRollno(21);
    	 
    	 //displaying value of the variable
    	 System.out.println("name : " + e.getName());
    	 System.out.println("age : " + e.getAge());
    	 System.out.println("roll no : " + e.getRollno());
     }
}
