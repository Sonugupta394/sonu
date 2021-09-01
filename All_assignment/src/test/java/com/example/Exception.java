package com.example;

import org.testng.annotations.Test;

public class Exception {
	@Test(expectedExceptions=ArithmeticException.class)
	  public void test1() {
			int a,b,c;
			a=0;
			b=80;
			c=b/a;
			System.out.println("division:" +c);
	  }
	
	
		@Test(enabled=false)               ///Ignore method
		  public void test2() {
				System.out.println("Arithmatic Exception");
		  }
		  
}
