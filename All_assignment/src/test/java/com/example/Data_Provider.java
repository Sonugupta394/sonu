package com.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	@DataProvider(name = "data-provider")
    public Object[][] getData() {
		Object[][] table_values=new Object[][] 
				{
			{"Username"}, {"Password"},
			{"Username1"},{"Password1"},
			{"Username2"},{"Password2"}
    };
    return table_values;
	}
 
    @Test(dataProvider = "data-provider")
    public void testMethod(String data) {
       System.out.println("Data is: " + data); 
    }  
	
}
