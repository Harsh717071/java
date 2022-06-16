package corejava;

import java.util.Scanner;

public class ToysExample {
	
	//creating Multidimenssional Array list  for Toys
	    String[][] toys = new String [6][6];
         
	    ToysExample()
	    {
	   // Creating array list of toys
	    toys [0][0]="1";
	    toys[0][1]="Hulk";

	    toys [1][0]="2";
	    toys [1][1] ="Avengers ";

	    toys [2][0]="3";
	    toys [2][1]="Thanos";

	    toys [3][0]="4";
	    toys [3][1]="Marvel";

	    toys [4][0]="5";
	    toys[4][1]="Power angers";
	    
	    toys [5][0]="5";
	    toys[5][1]="Escobar";

	    }
         
	    public static String getToy(int price)
	    {
	    	//static gettoy method
	        String toysname;
	        switch(price)
	        {
	        //Price of each toys
	            case 350: 
	                toysname = "Hulk";
	                return toysname;
	            
	            case 450:
	                toysname = "Avengers";
	                return toysname;
	                
	            case 300:
	                toysname = "Thanos";
	                return toysname;
	                
	            case 550:
	                toysname = "Marvel";
	                return toysname;
	                
	            case 750:
	                toysname = "Power rangers";
	                return toysname;
	                
	            case 850:
	                toysname = "Escobar";
	                return toysname;
	                
	            default:
	                toysname = "No Toys Available in this Range";
	                return toysname;
	        }
	    }
           
	    public static void main(String[] args) {
	   System.out.println("Enter the price of Toys");
	   //creating  scanner class object    
	   Scanner sc = new Scanner (System.in); 
	        int price = sc.nextInt ();
            
	        System.out.println(getToy(price));

	        sc.close();
	    }
	}


