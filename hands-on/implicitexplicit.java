package corejava;

public class implicitexplicit {

	public static void main(String[]args) {
		int i = 400;
		
		// implicit type conversion
		
		double d = i;
		
		System.out.println("double value: " + d);
		
		// explicit type conversion
		
		double f = 300.0;
		
		int l = (int)f ;
		
		System.out.println("int value: " + l);
	}
}
