package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConCatTest {

	@Test
	public void ConCatTest()
	{
	//creating a object of class
			MyJUnitClass junit=new MyJUnitClass();
			String result=junit.ConCat("MY","Love");
			assertEquals("MYLove", result);

	}

}
