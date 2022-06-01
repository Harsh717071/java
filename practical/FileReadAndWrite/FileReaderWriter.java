package corejava;
import java.io.*;
public class FileReaderWriter{
	public static void main(String[]args) throws IOException{
		//creating filereader object 
		File file=new File("D:\\myfile.txt");
		FileReader reader = new FileReader(file);
		char chars[]= new char[(int) file.length()];
		//reading data from the 
		reader.read(chars);
		//writing data to another file
		File out = new File("D:\\copyofmyfile.txt");
		FileWriter writer = new FileWriter(out);
		//writing data to the file
		writer.write(chars);
		writer.flush();
		System.out.println("Data successfully written in the specified file");
		
		
	}
}
