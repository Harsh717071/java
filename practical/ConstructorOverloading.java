package corejava;

public class ConstructorOverloading {
     String name ;
     double gpa;
	public ConstructorOverloading(String name, double gpa) {
	
		this.name = name;
		this.gpa = gpa;
	}
	public ConstructorOverloading(String name) {
		
		this.name = name;
	}
    public static void main(String[]args) {
    	ConstructorOverloading Obj1= new ConstructorOverloading("harsh",8.0);
    	ConstructorOverloading Obj2= new ConstructorOverloading("harsh");
    	System.out.println("name:"+ Obj1.name + "\t" + "G"
    			+ "Gpa:"+ Obj1.gpa);
    	System.out.println("name:" + Obj2.name);
    }
}
