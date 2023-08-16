package Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselayer.Baseclass1;
import UtilityLayer.Selectclass;
import UtilityLayer.Utilsclass;

public class Keralaregisterportal extends Baseclass1
{
		@FindBy(id="userName")
		private WebElement uname;
		@FindBy(xpath="//div[@class='input-icons']/i")
		private WebElement dob;
		@FindBy (xpath="//span[@id='spanMonth']/img")
		private WebElement month;
		
		@FindBy (xpath="//span[@id='spanYear']/img")
		private WebElement year;
		
		@FindBy (xpath="//span[@id='CalContent']//tr/td")
		private WebElement date;
		
		@FindBy(xpath="(//input[@name='gender'])[2]")
		private WebElement female;
		
		@FindBy(xpath="(//input[@type='text'])[3]")
		private WebElement houseno;
		
		@FindBy(xpath="(//input[@type='text'])[4]")
		private WebElement place;
		
		@FindBy(xpath="(//input[@type='text'])[5]")
		private WebElement locality;
		
		@FindBy(xpath="//select[@id='districtCbo']")
		private WebElement district;
		
		@FindBy(xpath="(//input[@type='text'])[6]")
		private WebElement mobile;
		
		@FindBy(xpath="(//input[@type='text'])[7]")
		private WebElement aadhar;
		
		@FindBy(xpath="(//input[@type='text'])[8]")
		private WebElement email;
		
		@FindBy(xpath="(//input[@type='password'])[1]")
		private WebElement password;
		
		@FindBy(xpath="(//input[@type='password'])[2]")
		private WebElement confirmp;
		
		@FindBy(xpath="//select[@id='securityQnsCbo']")
		private WebElement passrecovry;
		
		
		@FindBy(xpath="//input[@id='securityAns']")
		private WebElement passrecovryans;

		@FindBy(xpath="//input[@type='checkbox']")
		private WebElement iagree;
		
		public Keralaregisterportal()
		{
			PageFactory.initElements(driver, this);
		}
		
		public  void keralaregistration(String name,String Month, String Year, String Date, String gender, String House,String Place,
				String Locality, String District,String Mobile , String AAdhar, String Email,
				String Password, String Confirmp, int Passrecover, String Passans)
		{
			
			Utilsclass.sendKeys(uname, name);
			Utilsclass.click(dob);
			Utilsclass.click(month);
//			
//			if(month.getText().equals(Month))
//			{
//				month.click();
//				//break;
//			}
			//Utilsclass.sendKeys(month, Month);
			
			//JavascriptExecutor js= (JavascriptExecutor)driver;
			//js.executeScript("arguments[0].value='Month';", month);
//			Actions act = new Actions((WebDriver) month);
//			act.click(month).build().perform();
			
			Utilsclass.sendKeys(year, Year);
			Utilsclass.sendKeys(date, Date);
			Selectclass.selectByvlaue(female, gender);
			Utilsclass.sendKeys(houseno, House);
			Utilsclass.sendKeys(place, Place);
			Utilsclass.sendKeys(locality, Locality);
			Selectclass.selectByvisibletext(district, District);
			Utilsclass.sendKeys(mobile, Mobile);
			Utilsclass.sendKeys(aadhar, AAdhar);
			Utilsclass.sendKeys(email, Email);
			Utilsclass.sendKeys(password, Password);
			Utilsclass.sendKeys(confirmp, Confirmp);
			Selectclass.selectByIndex(passrecovry, Passrecover);
			Utilsclass.sendKeys(passrecovryans, Passans);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
}
