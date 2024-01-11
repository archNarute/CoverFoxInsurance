package listenarsStudy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener
{
    @Override
    public void onTestStart(ITestResult result) 
    {   String tcName = result.getName();
    	Reporter.log("TC " +tcName+" execution is started", true);
    }
    
    @Override
    public void onTestSuccess(ITestResult result) 
    {
    	Reporter.log("TC " +result.getName()+" is succesfully completed", true);
    }
    
    @Override
    public void onTestFailure(ITestResult result) 
    {
    	Reporter.log("TC " +result.getName()+" is failed, please check it properly", true);
    }
    
    @Override
    public void onTestSkipped(ITestResult result) 
    {
    	Reporter.log("TC " +result.getName()+" is skipped, please check dependent method", true);
    }
    
    
}
