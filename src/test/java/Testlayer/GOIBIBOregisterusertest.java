package Testlayer;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baselayer.Baseclass3;
import Pagelayer.GOIBIBOregisteruser;

public class GOIBIBOregisterusertest extends Baseclass3
{
		@BeforeTest
		public void setup()
		{
			initialization();
			
		}
	
	@Test(priority=1)
	public  void validateGOIBIBORegisteruser() throws InterruptedException
	{
		GOIBIBOregisteruser GOIBIBO = new GOIBIBOregisteruser();
		GOIBIBO.GOIBIBORegisteruser("aarav", "Jun", "2021", "28", "Male", "2358456215",
				"Aarav@gmail.com", "Public", "Indian", "English", "Aarav@123",
				"Aarav@123", "Who was your Childhood hero?", "shaktiman", "india", "pp", "Maharastra", "Latur", 
				"nilage", "vaibhav nager", "LATUR");
		
		
		
		
	}
	@Test(priority=2)
	public void validationnumber()
	{
		Assert.assertEquals("preeti", "priti");
		
	}
	
	
	
}
