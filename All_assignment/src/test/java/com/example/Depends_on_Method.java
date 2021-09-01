package com.example;

import org.testng.annotations.Test;

public class Depends_on_Method {
	@Test 
	public void b() {
	System.out.println("Second test method");
	//System.out.println(Thread.currentThread().getId());	
	}
	
	@Test
	public void c() {
	System.out.println("First test method");	
	//System.out.println(Thread.currentThread().getId());	
	}
	
	@Test(dependsOnMethods= {"c"}) 
	public void a() {
	System.out.println("third test method");	
	//System.out.println(Thread.currentThread().getId());	
	}
	
}
