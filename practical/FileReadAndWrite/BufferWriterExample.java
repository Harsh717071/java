package corejava;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriterExample {
public static void main(String[]args) throws Exception{
	//creating the object
	FileWriter writer = new FileWriter("D:\\myfile1.txt"); 
	BufferedWriter buffer = new BufferedWriter(writer);
	//initialize the value
	buffer.write("welcome to mumbai");
	buffer.close();
	//print
	System.out.println("Sucess");
}
}
