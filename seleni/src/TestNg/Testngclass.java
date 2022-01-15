package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testngclass {
	@Test
	public void test10(){
		
		Reporter.log("hello",true);
	}
	@Test
	public void test20(){
		Reporter.log("world",true);
	}
}
