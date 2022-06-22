package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	public void Addtest() 
	{
		//creating a object of class
		MyJUnitClass junit=new MyJUnitClass();
		int result=junit.add(15,20);
		assertEquals(35, result);
		
	}

}
