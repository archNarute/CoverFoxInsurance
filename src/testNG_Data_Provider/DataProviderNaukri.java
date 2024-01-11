package testNG_Data_Provider;

import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;

public class DataProviderNaukri {
 
	@DataProvider(name="regression")
	public static String[][] naukriDataSet()
	{
		String data[][]= {{"QA","Pune"}, {"dev","mumbai"}};
		return data;
	}
}
