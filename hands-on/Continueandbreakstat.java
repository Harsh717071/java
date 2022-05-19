package corejava;

import java.util.Scanner;

public class Continueandbreakstat {
  public static void main(String[]args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number:");
	  
	  
	   
	  for ( int f = sc.nextInt();  f<15; f++) {
		  if(f==10) {
			  continue;
		  }else if(f==12){
			  break;
		  }
		  System.out.println(f);
		 
	  }
	 
  }
}
