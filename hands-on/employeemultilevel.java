package corejava;

public class employeemultilevel {
       public void print_name() {
    	   System.out.println("harsh");
       }     
}
class edepartment extends employeemultilevel{
	public void print_depatment() {
		System.out.println("IT");
	}
}
class estate extends edepartment{
	public void print_state() {
		System.out.println("maharastra");
	}
}
class multilevelinheritance{
	public static void main(String[]args) {
		estate e= new estate();
		e.print_name();
		e.print_depatment();
		e.print_state();
	}
}