package testngpractice;

import org.testng.annotations.Test;

public class PriorityTestcase {
	
	@Test(priority=2)
	public void tc001() 
	{
		  System.out.println("Test case1: This is priority2");
	  }
	@Test(priority=3)
	public void tc002() {
		  System.out.println("Test case2: This is priority3");
		  }
	@Test(priority=1)
	public void tc003() {
		  System.out.println("Test case3: This is priority1");
	}

}
