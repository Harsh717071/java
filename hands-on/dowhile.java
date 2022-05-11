package corejava;

import java.util.Scanner;

public class dowhile {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int num , sum;
		num = 0;
		sum = 0;
		do {
			sum += num;
			System.out.println("enter a number:");
			num = sc.nextInt();
		}
		while(num>=0);
		System.out.println("the sum of number are " + sum);
		num = sc.nextInt();
		sc.close();
	}
}
