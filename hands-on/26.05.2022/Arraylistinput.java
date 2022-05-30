//WAP to create new array list , add some colors(String)and print out the collection


package corejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

 class ArrayListInput {
 public static void main(String[]args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter the first name");
	 String a =sc.next();
	 System.out.println("enter the Second name");
	 String b =sc.next();
	 System.out.println("enter the third name");
	 String c =sc.next();
	 System.out.println("enter the fourth name");
	 String d =sc.next();
	 ArrayList<String> li = new ArrayList<String>();
	 li.add(a);
	 li.add(b);
	 li.add(c);
	 li.add(d);
	 Iterator<String> irs =  li.iterator();
	 while(irs.hasNext()) {
		 System.out.println(irs.next());
	 }
 }
}
