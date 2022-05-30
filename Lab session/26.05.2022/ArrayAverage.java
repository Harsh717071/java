//java program to calculate average of the Int array

package corejava;

import java.util.Scanner;



 class ArrayAverage {

	public static void main(String[] args) {
	//creating the variable
		int len;
		int sum=0;
		int Average=0;
		//creating the scanner object
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the length");
       //taking the size of the array from user
        len=sc.nextInt();
        int a[]= new int[len];
        
        System.out.println("\nEnter"+ len + "element to store ");
        {
        	for(int i=0; i<len; i++) {
        		//taking element from the user
				a[i]= sc.nextInt();
        		
        	}
        	//printing the array
        	System.out.println(" ");
        	System.out.println("element in array: \n");
        	for(int i=0; i<len; i++) {
        		System.out.println(a[i] + " ");
        		sum = sum + a[i];
        		Average= sum/len;
        	}
        	//printing the average of array
        	        	System.out.println("\n Average of array "+ Average);
        }
       
	}

}
