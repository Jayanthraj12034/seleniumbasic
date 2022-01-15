package TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testngclass3 {
	
	@Test 
	public void test1(){
		
		Reporter.log("hello",true);
		
	}
	@Test(dependsOnMethods="test1")
	public void test2(){
		
	Reporter.log("uday",true);	
	Assert.fail();
	}
	
	@Test(dependsOnMethods="test2")
	public void test3(){
		
		Reporter.log("bye guys",true);
		
	
	}
}
