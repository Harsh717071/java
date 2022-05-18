package corejava;

import java.util.Scanner;

public class inputlogicalop {
	
public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the first number :");
	int a=sc.nextInt();
	System.out.println("enter the second number :");
	int b=sc.nextInt();
	System.out.println("enter the third number :");
	int c=sc.nextInt();
	System.out.println("enter the fourth number :");
	int d=sc.nextInt();
	
    
     
     if(a>b && c==d){
    	 System.out.println("true");
     }else {
    	 System.out.println("false");
     }
     if(a<b || c==d){
    	 System.out.println("One or both"+" the condition are true ");
     }else {
    	 System.out.println("Both the"+"the conditin are false");
     }
     System.out.println("!(a>b) :" + !(a>b));
     System.out.println("!(c>d) :" + !(c>d));
}
}
