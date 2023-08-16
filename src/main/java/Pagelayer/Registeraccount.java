package Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import Baselayer.Baseclass;
import UtilityLayer.Selectclass;
import UtilityLayer.Utilsclass;

public class Registeraccount extends Baseclass
{
	Select sel;
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement userid;
	
	
	@FindBy(xpath="//select[@id='ctl00_SPWebPartManager1_g_19865d08_0763_4e76_89db_c347d1b6935f_ctl00_ddlTitle']")
	private WebElement maritalstatus;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement firstname;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement lastname;
	
	@FindBy(xpath="//select[@id='ctl00_SPWebPartManager1_g_19865d08_0763_4e76_89db_c347d1b6935f_ctl00_ddlHintQuestion']")
	private WebElement hintquestion;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement hintanswer;
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	private WebElement address1;
	
	
	@FindBy(xpath="(//input[@type='text'])[7]")
	private WebElement address2;
	
	
	@FindBy(xpath="//select[@id='ctl00_SPWebPartManager1_g_19865d08_0763_4e76_89db_c347d1b6935f_ctl00_ddlCountry']")
	private WebElement country;

	@FindBy(xpath="//select[@id='ctl00_SPWebPartManager1_g_19865d08_0763_4e76_89db_c347d1b6935f_ctl00_ddlState']")
	private WebElement state;
	
	@FindBy(xpath="//select[@id='ctl00_SPWebPartManager1_g_19865d08_0763_4e76_89db_c347d1b6935f_ctl00_ddlCity']")
	private WebElement city;
	
	@FindBy(xpath="(//input[@type='text'])[10]")
	private WebElement pincode;
	
	@FindBy(xpath="(//input[@type='text'])[11]")
	private WebElement email;
	
	
	@FindBy(xpath="(//input[@type='text'])[13]")
	private WebElement mobileno;
	
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement terms;
	
	public Registeraccount()
	{
		PageFactory.initElements(driver,this);
	}
		
	
		public void Registeraccount1(String Userid, String marital,String Firstname, String Lastname, String Hintans,String Address1,String Address2,
				String Country, String State,String City, String Pincode, String Email) throws InterruptedException
		{
			
		Utilsclass uti= new Utilsclass();
		Thread.sleep(5000);
		uti.sendKeys(userid, Userid);
		Thread.sleep(5000);
		Selectclass.selectByvisibletext(maritalstatus, marital);
		uti.sendKeys(firstname, Firstname);
		uti.sendKeys(lastname, Lastname);
		Selectclass.selectByIndex(hintquestion, 0);
		uti.sendKeys(hintanswer, Hintans);
		uti.sendKeys(address1, Address1);
		uti.sendKeys(address2, Address2);
		

		Selectclass.selectByvisibletext(country, Country);
		Thread.sleep(5000);
		Selectclass.selectByvisibletext(state, State);
		Thread.sleep(5000);
		Selectclass.selectByvisibletext(city, City);
		uti.sendKeys(pincode, Pincode);
		Thread.sleep(5000);
		uti.sendKeys(email,Email );
	}
	
	
	
	
	
	
	
	
	
	
}
