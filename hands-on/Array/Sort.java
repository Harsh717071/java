package corejava;

import java.util.Arrays;
import java.util.Collections;

public class Sort {
 public static void main(String[]args) {
	//custom input string 
	 String arr[]= {"harsh ", "shubham", "abhi"};
	 
	 //Sorts arr[] in ascending array 
	 Arrays.sort(arr);
	 //printing the array after sorting 
	 System.out.println("Modified arr[]: %s" + Arrays.toString(arr) );
	 
	 Arrays.sort(arr, Collections.reverseOrder());
	 System.out.println("ln descending order Modified arr[]:" + Arrays.toString(arr));
 }
}
