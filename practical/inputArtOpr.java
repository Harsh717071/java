package corejava;

import java.util.Scanner;

public class inputArtOpr {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second number:");
		int num2 = sc.nextInt();
		
		int add,sum,mul, div, mod;
		add = num1+num2;
		sum = num1-num2;
		mul = num1*num2;
		div = num1/num2;
		mod = num1%num2;
		
		System.out.println("addition:" + add );
		System.out.println("substraction:" + sum);
		System.out.println("multiply :" + mul);
		System.out.println("division : " + div);
		System.out.println("addition:" + mod );
		
	}

}
