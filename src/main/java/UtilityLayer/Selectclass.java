package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Baselayer.Baseclass;

public class Selectclass extends Baseclass
{
static Select sel;
	
	public static  void selectByIndex(WebElement wb, int index)
	{
		if(wb.isDisplayed()&&wb.isEnabled())
		{
			sel=new Select(wb);
					sel.selectByIndex(index);
		}
	}
	
	
	public static  void selectByvisibletext(WebElement wb, String value)
	{
		if(wb.isDisplayed()&&wb.isEnabled())
		{
			sel=new Select(wb);
					sel.selectByVisibleText(value);
		}
	}
	public static  void selectByvlaue(WebElement wb, String value)
	{
		if(wb.isDisplayed()&&wb.isEnabled())
		{
			sel=new Select(wb);
					sel.selectByValue(value);;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
