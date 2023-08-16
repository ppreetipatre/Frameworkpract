package Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselayer.Baseclass2;
import UtilityLayer.Selectclass;
import UtilityLayer.Utilsclass;

public class FCCuserregistration extends Baseclass2
{

	@FindBy(id="frm-registration:loginName")
	private WebElement username;
	
	@FindBy(id="frm-registration:confirmEmail")
	private WebElement confirmusername;
	
	@FindBy(id="frm-registration:password")
	private WebElement password;
	
	@FindBy(id="frm-registration:repassword")
	private WebElement confirmpassword;
	
	
	@FindBy(id="frm-registration:prefix")
	private WebElement prefix;
	
	@FindBy(id="frm-registration:firstName")
	private WebElement firstname;
	
	@FindBy(id="frm-registration:middleName")
	private WebElement middlename;
	
	@FindBy(id="frm-registration:lastName")
	private WebElement lastname;
	
	
	@FindBy(id="frm-registration:suffix")
	private WebElement suffix;
	
	
	@FindBy(id="frm-registration:emailAddress2")
	private WebElement secondemail;
	
	
	@FindBy(id="frm-registration:phoneCC")
	private WebElement countrycode;
	
	@FindBy(id="frm-registration:phonePN")
	private WebElement phoneno;
	
	@FindBy(id="frm-registration:phoneExtension")
	private WebElement phoneextension;
	
	
	@FindBy(id="frm-registration:quest1")
	private WebElement securityQ;
	
	@FindBy(id="frm-registration:quest1_Ans")
	private WebElement answer;
	
	
	public FCCuserregistration()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public  void FCCregistration(String Username,String Confirmusername,String Password,String ConfirmP, String Prefix,
			String Fname,String Mname, String Lname, String Suffix, String Secondmail,
			String Countrycode,String Phoneno, String Phextension, int  Securityq, String Answer)
	{
		Utilsclass.sendKeys(username, Username);
		Utilsclass.sendKeys(confirmusername, Confirmusername);
		Utilsclass.sendKeys(password, Password);
		Utilsclass.sendKeys(confirmpassword, ConfirmP);
		Selectclass.selectByvisibletext(prefix, Prefix);
		//Utilsclass.sendKeys(prefix, Prefix);
		Utilsclass.sendKeys(firstname, Fname);
		Utilsclass.sendKeys(middlename, Mname);
		Utilsclass.sendKeys(lastname, Lname);
		Utilsclass.sendKeys(suffix, Suffix);
		Utilsclass.sendKeys(secondemail, Secondmail);
		Utilsclass.sendKeys(countrycode, Countrycode);
		Utilsclass.sendKeys(phoneno, Phoneno);
		Utilsclass.sendKeys(phoneextension, Phextension);
		Selectclass.selectByIndex(securityQ, Securityq);
		//Utilsclass.sendKeys(securityQ, Securityq);
		Utilsclass.sendKeys(answer, Answer);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
