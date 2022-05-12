package corejava;

public class implicitconversion {
	public static void main(String []args) {
		
		int i = 200;
		//automatic type conversion
		long l = i;
		//automatic type conversion
		float f = l;
		
		System.out.println("int value " + i);
		System.out.println("long value " + l);
		System.out.println("float value " + f);
	}

}
