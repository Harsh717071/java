package corejava;

 class Parent {
void show() {
	System.out.println("parent show");
}
}
class child extends Parent{
	//this method overrides show() of parent
	//@override
	void show() {
		System.out.println("child show");
	}
}
//driver class
class xyz{
	public static void main(String[]args) {
		//if a parent type reference refers
		// to a parent object , then parents
		// show is called
		Parent x= new Parent();
		x.show();
		//if a parent type refernece refers 
		// to a child object childs show()
		// is called .this is called RUN TIME
		//POLYMORPHISM 
		Parent y= new child();
				y.show();
	}
}