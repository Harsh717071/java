package corejava;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

 class BufferOsExample {
 public static void main(String[]args) throws Exception {
	 //creating the object
	 FileOutputStream fout=new FileOutputStream("D:\\myfile.txt");
	 BufferedOutputStream bout = new BufferedOutputStream(fout);
	 //initialize the value
	 String s= "welcome to lecture";
	 byte b[]=s.getBytes();
	 bout.write(b);
	 bout.flush();
	 bout.close();
	 fout.close();
	 //print
	 System.out.println("Sucess");
	 
 }
}
