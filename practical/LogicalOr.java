package corejava;

public class LogicalOr {
	public static void main(String[]args) {
		//Initializing the variable
		int a, b, c ,d;
		a = 10;
		b = 1;
		c = 20;
		d = 30;
		
		//displaying a ,b ,c, d
		System.out.println("value of a : " + a);
		System.out.println("value of b : " + b);
		System.out.println("value of c : " + c);
		//using logical AND OPERATER to verify constraints
		if( a>b || c==d){
			
			System.out.println("One or both"+" the condition are true ");
		}
		else {
			System.out.println("Both the"+"the conditin are false");
		}
		
	}
}
