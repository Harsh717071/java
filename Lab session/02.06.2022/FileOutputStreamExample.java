//java program to demonstrate fileoutputstream
package corejava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class FileOutputStreamExample {

	public static void main(String[] args)  {
		try {
			//create the object
		  FileOutputStream output=new FileOutputStream("D:\\myfile1.txt");
		  //initialize the value
		  String s= "Welcome to the world";
		  //calling the method
		  byte[] b= s.getBytes();
		  output.write(b);
		  output.close();
		  //print
		  System.out.println("Sucess");

	}
		catch(Exception e) {
			System.out.println(e);
		}

}
}
