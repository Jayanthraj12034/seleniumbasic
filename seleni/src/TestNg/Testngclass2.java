package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testngclass2 {
	
	@Test(invocationCount=2,priority=1)
	
	public void test1(){
		
		Reporter.log("hello",true);
		
	}
	
	@Test(invocationCount=4,priority=0)
	public void test12(){
		Reporter.log("worlds",true);
	}

}
