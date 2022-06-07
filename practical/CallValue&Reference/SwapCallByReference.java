package corejava;

public class SwapCallByReference {
  int a=10,b=20,t;
  //the original value of a will be changed as we are trying to pass the objects.object are passed by referncce
  void swap(SwapCallByReference c) {
	  
	  c.t=c.a;
	  c.a=c.b;
	  c.b=c.t;
	  
  }
	public static void main(String[] args) {
		//create the object
		SwapCallByReference c=new SwapCallByReference();
	        System.out.println("Before call-by-reference a="+c.a +" b="+c.b);
	       // passing the object as a value using pass-by-reference
	        c.swap(c);
	        System.out.println("after call-by-reference a="+c.a +" b="+c.b);
	}

}
