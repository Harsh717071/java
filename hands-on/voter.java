package corejava;

import java.util.Scanner;

public class voter {
	public static void main(String[]args) {
 Scanner sc = new Scanner (System.in);
  
 System.out.println("Enter voter number");
 int user = sc.nextInt();
 if(user <= 18) {
	 System.out.println("user cannot vote");
 }
		
	
	}
}
