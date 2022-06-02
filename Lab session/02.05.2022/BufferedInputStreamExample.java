//java to demonstrate bufferedinputstream



package corejava;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//creating the object 
       FileInputStream in= new FileInputStream("D:\\buffer.txt");
         BufferedInputStream buf= new BufferedInputStream(in);
         int i ;
	        //Calling read() method using While loop
	        while((i=buf.read())!= -1){
	            System.out.print((char)i);        }
	    
	        //Calling close() method
	        buf.close();
	        in.close();
	}

}
