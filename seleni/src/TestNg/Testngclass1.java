package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testngclass1 {
	
	@Test(priority=1)
	
	public void test1(){
		
		Reporter.log("hello",true);
	}
	
	@Test
	
	public void zest2(){
		
		Reporter.log("world",true);
	}

}
