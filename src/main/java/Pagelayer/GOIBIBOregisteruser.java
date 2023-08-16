package Pagelayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselayer.Baseclass3;
import UtilityLayer.Handledropdown;

import UtilityLayer.Selectclass;

import UtilityLayer.Utilsclass;


public class GOIBIBOregisteruser extends Baseclass3
{

		@FindBy(xpath="(//input[@type='text'])[2]")
		private WebElement name;
		
		@FindBy(xpath="(//input[@type='text'])[3]")
		private WebElement dob;
		
		
		@FindBy(xpath="//div[@class='DayPickerDdCont-cstBtnWrap']//span")
		private WebElement month;
		
		@FindBy(xpath="//li[@class='DayPicker-ddListItem']")
		private List<WebElement> month1;
		
		@FindBy(xpath="//li[@class='DayPicker-ddListItem']")
		private List<WebElement> year;
		
		@FindBy(xpath="//span[@class='DayPicker-Day  txtCenter']")
		private List<WebElement> date;
		
		@FindBy(xpath="//input[@type='radio']")
		private List<WebElement> gender;
		
		@FindBy(xpath="(//input[@type='text'])[4]")
		private WebElement mobile;
		

		@FindBy(xpath="(//input[@type='text'])[5]")
		private WebElement email;
		

		@FindBy(xpath="//div[@class='trainsCreateNewUserWrap localityNewWrap ']//p")
		private List<WebElement> profession;
		

		@FindBy(xpath="(//input[@type='text'])[7]")
		private List<WebElement> nationality;
		
		@FindBy(xpath="//div[@class='trainsCreateNewUserWrap localityNewWrap ']//li")
		private List<WebElement> language;
		
		@FindBy(xpath="(//input[@type='text'])[9]")
		private WebElement password;
		
		@FindBy(xpath="(//input[@type='text'])[10]")
		private WebElement confirmpassword;
		
		@FindBy(xpath="//div[@class='trainsCreateNewUserWrap localityNewWrap ']//li//p")
		private List<WebElement> securityQ;
		
		@FindBy(xpath="(//input[@type='text'])[12]")
		private WebElement securityA;
		
		@FindBy(xpath="//div[@class='trainsCreateNewUserWrap localityNewWrap ']//li")
		private List<WebElement> country;
		
		@FindBy(xpath="(//input[@type='text'])[14]")
		private WebElement pincode;
		
		@FindBy(xpath="(//input[@type='text'])[15]")
		private WebElement state;
		
		@FindBy(xpath="(//input[@type='text'])[16]")
		private List<WebElement> city;
		
		
		@FindBy(xpath="(//input[@type='text'])[17]")
		private List<WebElement> locality;
	
		
		@FindBy(xpath="(//input[@type='text'])[18]")
		private WebElement address;
		
		
		@FindBy(xpath="(//input[@type='text'])[19]")
		private WebElement addresscontact;
		
		
		public GOIBIBOregisteruser()
		{
			PageFactory.initElements(driver, this);
		}
		
		public  void GOIBIBORegisteruser(String Fname, String Month,String Year,String Date,
				String Gender, String Mobile, String Email, String Profession,String Nationality,
				String Lang,String Passwd,String Confiempw, String Securityq, String Securitya,
				String Country, String Pincde, String State, String City, String Locality,
				String Address, String Addcontact) throws InterruptedException
		{
			Utilsclass.sendKeys(name, Fname);
			Utilsclass.click(dob);
			
			//Handledropdown.findElements(month, Month);
			Thread.sleep(5000);
			Utilsclass.click(month);
			
			Handledropdown.findelement(month1, Month);
			
			//Handledropdown.findElements(month1, Month);
			
			//Handledropdown.selectByVisibletext(month, Month);
			Thread.sleep(5000);
			Handledropdown.findelement(year, Year);
			Thread.sleep(5000);
			Handledropdown.findelement(date, Date);
		
//			Handledropdown.findElements(month, Month);
//			Handledropdown.findElements(year, Year);
//			Handledropdown.findElements(date, Date);
			Handledropdown.findelement(gender, Gender);
			Utilsclass.sendKeys(mobile, Mobile);
			Utilsclass.sendKeys(email, Email);
			Handledropdown.findelement(profession, Profession);
			Handledropdown.findelement(nationality, Nationality);
			Handledropdown.findelement(language, Lang);
			Utilsclass.sendKeys(password, Passwd);
			Utilsclass.sendKeys(confirmpassword, Confiempw);
			Handledropdown.findelement(securityQ, Securityq);
			Utilsclass.sendKeys(securityA, Securitya);
			Handledropdown.findelement(country, Country);
			Utilsclass.sendKeys(pincode, Pincde);
			Utilsclass.sendKeys(state, State);
			Handledropdown.findelement(city, City);
			Handledropdown.findelement(locality, Locality);
			Utilsclass.sendKeys(address, Address);
			Utilsclass.sendKeys(addresscontact, Addcontact);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
