package corejava;

import java.util.Scanner;

public class whileloop {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter the number ");
		int num1 = sc.nextInt();
		int i = 0;
			while(i<10) {
				i++;
				int k=num1 * i;
				System.out.println(num1+"*"+i +"=" +k  );
			}
	}

}

