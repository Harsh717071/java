package corejava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

 class RegularExpression {
	public static void main(String[] args) { 
		//creating the scanner class
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter input text: "); 
		String input = sc.nextLine();
		String regex = "[a-z]"; 
		//Creating a pattern object 
		Pattern pattern = Pattern.compile(regex); 
		//Matching the compiled pattern in the String 
		Matcher matcher = pattern.matcher(input); 
		int count =0; 
		while (matcher.find()) { 
			count++;
		} 
		System.out.println("Number characters from the range (a-z): "+count); }
	}


