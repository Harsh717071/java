package corejava;



class ConstructerOverloading {
    int a;
    String b;
	 ConstructerOverloading(int a, String b) {
		
		this.a = a;
		this.b = b;
	}
	 ConstructerOverloading(int a) {
		
		this.a = a;
	}
    public static void main(String[]args) {
    	ConstructerOverloading Obj1=new ConstructerOverloading(10,"java");
    	ConstructerOverloading Obj2=new ConstructerOverloading(10);
    	System.out.println(Obj1.a +"t/" + Obj1.b );
    	System.out.println(Obj2.a );
   
    }
}
