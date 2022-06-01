package corejava;
import java.io.*; 
 class BufferedReaderExample{ 
	public static void main(String args[])throws Exception{
		//create InputStreamReader class and  obj3ect for InputStreamReader 
		InputStreamReader r=new InputStreamReader(System.in);
		//create BufferedReader class and object for  BufferedReader 
		BufferedReader br=new BufferedReader(r); 
		//printing the name
		System.out.println("Enter your name");
		String name=br.readLine();
		System.out.println("Welcome "+name); 
		} 
	}