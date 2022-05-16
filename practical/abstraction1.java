package corejava;


    class abstraction1 extends abstraction {

	public  int multiply(int n1, int n2) {
		return n1*n2;
	}
	public  int multiplyone(int n1, int n2,int n3) {
		return n1*n2*n3;
	}
	public static void main(String[]args) {
		abstraction a1 = new abstraction1();
		
	  System.out.println("multiplication of 2 number: " + a1.multiply(10,20));
	  System.out.println("multiplication of 3 number: " + a1.multiplyone(10,20,30));
	}
}
