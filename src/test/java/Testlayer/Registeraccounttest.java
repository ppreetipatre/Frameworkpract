package Testlayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baselayer.Baseclass;
import Pagelayer.Registeraccount;

public class Registeraccounttest extends Baseclass
{
	@BeforeTest
	
	public void setup() throws InterruptedException
	{
		initialization();
	}
	

	@Test(priority=1)
	public void validateRegisterAccounttest() throws InterruptedException
	{
		
		Registeraccount regi = new Registeraccount();
		regi.Registeraccount1("MH123", "Mrs.","preeti", "patre", "latur", "bellevie", "pune", "India", "Maharashtra", "PUNE", "22552", "preeti@gmail.com");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
