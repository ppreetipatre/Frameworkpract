package UtilityLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Baselayer.Baseclass3;

public class Extentreportsetup extends Baseclass3
{

		public static  ExtentReports Extentreport (String reports)
		{
			String path= System.getProperty("user.dir") + "\\Extentreport\\"+reports +date()+".html";
			ExtentSparkReporter extreport = new ExtentSparkReporter(path);
			ExtentReports ext = new  ExtentReports();
			ext.attachReporter(extreport);
			return ext;		
		}

		public static String date()
		{
			return new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
		}
		
		public static String Screenshot(String foldername, String screenshotname) throws IOException 
		{
			String path=null;
			TakesScreenshot tks= (TakesScreenshot)driver;
			
			File f =tks.getScreenshotAs(OutputType.FILE);
			if(foldername.equals("pass"))
			{
				path=System.getProperty("user.dir")+"\\pass\\"+screenshotname+ date() +".png"; 
				
			}
			else if(foldername.equals("fail"))
			{
				path=System.getProperty("user.dir")+"\\fail\\"+screenshotname+ date() +".png"; 
			}
				FileUtils.copyFile(f, new File (path));
			return path;
			 
		}

		
}
