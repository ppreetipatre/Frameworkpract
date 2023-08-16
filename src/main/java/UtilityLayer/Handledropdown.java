package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import Baselayer.Baseclass3;

public class Handledropdown extends Baseclass3
{

		public static void selectByVisibletext(WebElement wb, String value)
		{
			selectByVisibletext(wb, value);
		}
	
//
//	public static void findElements(List<WebElement> wb, String value)
//	{
//		for(WebElement a:wb)
//		{
//			String b= a.getText();
//			System.out.println();
//			if(a.getText().equalsIgnoreCase(value))
//			{
//				a.click();
//				break;
//			}
//		}
//	
//	}
		
		public static void findelement(List<WebElement> wb, String value)
		{
			for(WebElement abc:wb)
			{
				if(abc.getText().equalsIgnoreCase(value))
						{
					
					abc.click();
					break;
						}
			}
		}
		
		
		
		
		public static void  findradiobutton(List<WebElement> wb, String value1)
		{
			for(WebElement a:wb)
			{
				String text= a.getAttribute("value");
				if(text.equalsIgnoreCase(value1))
				{
					a.click();
				}
			}
			
			
		}
		
		public static void Handle(List<WebElement> wb, String value)
		{
			for(WebElement a:wb)
			{
				if(a.getText().contains(value))
				{
					a.click();
					break;
				}
			}
		}
		
//	public void handleapp(List<WebElement>wb , String location)
//	{
//		
//		for(WebElement abc:wb)
//		{
//			String a=null;
//			String str=abc.getAttribute("value");
//			if(location.equalsIgnoreCase("")) {
//				a="";
//			}
//			else
//			{
//				a="";
//				
//			}
//		if(a.equalsIgnoreCase(str)){
//		abc.click();
//		break;
//		}
//		}
	

	
	
}