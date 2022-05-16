package corejava;

public class encapsulateemployee {

	public static void main(String[]args) {
		
		encapsulationemployee e1 = new encapsulationemployee();
		
		e1.setId(21);
		e1.setName("harsh");
		e1.setAddress("ghansoli,navi mumbai");
		
		System.out.println("employee id: " + e1.getId());
		System.out.println("employee name: " + e1.getName());
		System.out.println("employee address: " + e1.getAddress());
	}
}
