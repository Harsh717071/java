//java program to create ArrayList
package corejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

 class ArrayListInput {
 public static void main(String[]args) {
	 //creating the scanner object
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter the first color");
	 String a =sc.next();
	 //taking input from user 
	 System.out.println("enter the Second color");
	 String b =sc.next();
	//taking input from user 
	 System.out.println("enter the third color");
	 String c =sc.next();
	//taking input from user 
	 System.out.println("enter the fourth color");
	 String d =sc.next();
	//taking input from user 
	 
	 
	 
	 //creating the object 
	 ArrayList<String> li = new ArrayList<String>();
	 
	 li.add(a);
	 li.add(b);
	 li.add(c);
	 li.add(d);
	 
	//method of iterating the element ArrayList
	 Iterator<String> irs =  li.iterator();
	 System.out.println("");
	 System.out.println("list of colors");
	
	 
	 while(irs.hasNext()) {
		
		 //printing the list
		 System.out.println(irs.next());
	 }
 }
}
