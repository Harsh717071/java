//java program to create new file with exception handling
package corejava;

import java.io.File;

 class CreateFile {

	public static void main(String[] args)  {
		
        try {
        	//create the object
        	File file= new File("D:\\Createfile4.txt");
        	//calling the method using if loop
        	if(file.createNewFile()) {
        		//print
        		System.out.println("Sucess");
        	}
        	else {
        		//print
        		System.out.println("Not sucess");
        	}
        }catch(Exception e) {
        	System.out.println(e);
        }
        }
	}


