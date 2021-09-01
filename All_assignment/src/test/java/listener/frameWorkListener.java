package listener;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class frameWorkListener extends TestListenerAdapter
{
	public void onStart(ITestContext rv)
	{
		System.out.println("Execution is started.");
	}
	public void onFinsish(ITestContext rv)
	{
		System.out.println("Execution is done.");	
	}
	public void onTestStart(ITestResult rv)
	{
		System.out.println("TestScript execution started.");	
	}
	public void onTestSuccess(ITestResult rv)
	{
		System.out.println("TestScript passed.");	
	}
	public void onTestFailed(ITestResult rv)
	{

		System.out.println("TestScript failed.");
	}
	public void onTestSkipped(ITestResult rv)
	{
		System.out.println("TestScript Skipped.");	
	}
}
