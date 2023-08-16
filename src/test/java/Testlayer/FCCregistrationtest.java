package Testlayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baselayer.Baseclass2;
import Pagelayer.FCCuserregistration;

public class FCCregistrationtest extends Baseclass2
{
				
		@BeforeTest
		public void serup()
		{
			initialization();
			
		}
	
		@Test(priority=1)
		public void validateFCCregistrationtest()
		
		{
			
			FCCuserregistration fcc= new FCCuserregistration();
			fcc.FCCregistration("pihu","pihu","pihu123","pihu123","Mrs","kaavya",
				"yashpal","waghmare","pihu","kaavya@gmail.com","+91","1234569545",
				"12345",5,"yash");			
		}
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
}
