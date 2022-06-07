package corejava;

public class CallByRefernce {
   //the original value of a will be changed as we are trying to pass the objects.object are passed by referncce
	int a=10;
	
	void call(CallByRefernce c) {
		c.a=c.a+10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CallByRefernce c=new CallByRefernce();
        System.out.println("Before call-by-reference "+c.a);
        //passing the object as a value using pass-by-reference
        c.call(c);
        System.out.println("After call-by-reference "+c.a);
	}

}
