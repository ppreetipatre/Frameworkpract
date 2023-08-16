package Testlayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baselayer.Baseclass1;
import Pagelayer.Keralaregisterportal;

public class Keralaregisterportaltest extends Baseclass1
{

	@BeforeTest
	public void setup() throws InterruptedException
	{
		initialization();
	}
	
	@Test
	public void validatekeralaregistration()
	{
		Keralaregisterportal kerala = new Keralaregisterportal();
		kerala.keralaregistration("pihu", "May","2021","12", "F", "204", "wagholi", "pune", "Kannur", "123545", "251245121212", "pihu@gmail.com", "pihu@123", "pihu@123", 2, "reading");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
