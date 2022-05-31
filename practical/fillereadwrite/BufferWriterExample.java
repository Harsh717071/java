package corejava;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriterExample {
public static void main(String[]args) throws Exception{
	FileWriter writer = new FileWriter("D:\\myfile1.txt"); 
	BufferedWriter buffer = new BufferedWriter(writer);
	buffer.write("welcome to mumbai");
	buffer.close();
	System.out.println("Sucess");
}
}
