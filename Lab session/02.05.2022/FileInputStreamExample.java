
//java program to demonstrate fileinputstream
package corejava;

import java.io.File;
import java.io.FileInputStream;

 class FileInputStreamExample {

	public static void main(String[] args) throws Exception {
	
		//create the object
       File file= new File("D://myfile1.txt");
       FileInputStream input= new FileInputStream(file);
      //initialize the value
       int i = 0;
       //call the method in while loop
		while ((i = input.read()) != -1) {
			System.out.print((char) i);
		}
		input.close();

      
	}

}
