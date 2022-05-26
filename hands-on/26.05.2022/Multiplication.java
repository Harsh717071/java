package corejava;

import java.util.Scanner;

class Multiplication {
 public static void main(String[]args) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the number");
	 int a=sc.nextInt();
	
	 for(int i=1; i<11; i++) {
		 int multiply;
		multiply= i*a;
	
		 System.out.println(i +"*"+ a +"="+ multiply);
	 }
 }
}
