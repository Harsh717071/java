package corejava;

import java.util.Scanner;

public class InputRelational {
 public static void main(String[]args) {
	 Scanner sc = new Scanner (System.in);
	 
	 System.out.println("enter the first number");
	 int a = sc.nextInt();
	 System.out.println("enter the second number");
	 int b = sc.nextInt();
	//is equal to
		System.out.println("a == b = " + (a== b) );
		//is not equal to
		System.out.println("a != b = " + (a != b) );
		//Greater than
		System.out.println("a >  b = " + (a > b) );
		//Less than
		System.out.println("a < b = " + (a <  b) );
		//Greater than or equal to
		System.out.println("a >= b = " + (a >= b) );
		//Less than or equal to
		System.out.println("a <= b = " + (a <= b) );
 }
}
