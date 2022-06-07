package corejava;
import java.io.*;
public class CallByValue {
    static void Swap(int x,int y) {
    	int temp;
    	//step 1
    temp = x;
    //step 2
    x=y;
    //step 3
    y=temp;
    System.out.println("after swapping a="+ x +" b= "+ a);
    
    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//intialize the value
	
      int a= 10;
      int b= 12;
      //print message
      System.out.println("before swapping a="+ a +" b= "+ b);
      Swap(a,b);
      //print message
      
	}

}
