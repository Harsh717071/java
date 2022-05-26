package corejava;

import java.util.Scanner;



 class Average {

	public static void main(String[] args) {
	
		int len;
		int sum=0;
		int Average=0;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the length");
        len=sc.nextInt();
        int a[]= new int[len];
        
        System.out.println("\nEnter"+ len + "element to store ");
        {
        	for(int i=0; i<len; i++) {
        		
				a[i]= sc.nextInt();
        		
        	}
        	System.out.println(" ");
        	System.out.println("element in array: \n");
        	for(int i=0; i<len; i++) {
        		System.out.println(a[i] + " ");
        		sum = sum + a[i];
        		Average= sum/len;
        	}
        	        	System.out.println("\n Average of array "+ Average);
        }
       
	}

}
