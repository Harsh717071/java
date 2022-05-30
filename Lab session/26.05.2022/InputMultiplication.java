
//java program to create multiplication table
package corejava;

import java.util.Scanner;

 class InputMultiplication {
 public static void main(String[]args) {
	 //creating the scanner object
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the number");
	 //taking the user input
	 int a=sc.nextInt();
	//creating for loop
	 
	 if(a>0) {
		 System.out.println("");
		 System.out.println("multiplication table of " + a);
	 for(int i=1; i<11; i++) {
		 int multiply;
		multiply= i*a;
	//printing the table
		 System.out.println(i +"*"+ a +"="+ multiply);
	 }
 }
}
}