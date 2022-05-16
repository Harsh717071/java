package corejava;

 class abstractemployee extends abstractionemployee {

	
public int addition(int a, int b , int c) {
	return a+b+c;
}
public int sub(int a, int b , int c) {
	return a-b-c;
}

public static void main(String[]args) {
	abstractionemployee a1 = new abstractemployee();
	
	System.out.println("employee id: " + a1.addition(10,29,39));
	System.out.println("employee name: " + a1.sub(10,20,30));

}
 }
