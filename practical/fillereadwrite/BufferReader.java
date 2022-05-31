package corejava; 
import java.io.BufferedReader;
import java.io.FileReader; 
public class BufferReader { 
	public static void main(String [] args) throws Exception { 
		FileReader file = new FileReader("D:\\myfile1.txt");
		BufferedReader br = new BufferedReader(file); 
		int i ;
		while((i=br.read())!= -1){ 
			System.out.print((char)i); 
			} 
		br.close(); 
		file.close(); 
		} 
	}