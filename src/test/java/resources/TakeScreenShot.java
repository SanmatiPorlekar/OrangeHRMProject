package resources;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShot {
	public  void takeSnapShot(WebDriver webdriver,String fileName) throws Exception{
		
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File("C:\\Users\\sai_chavatapalli\\eclipse-workspace\\com.orangeHRMMiniProject\\src\\test\\outputFiles\\screenshots\\"+fileName);
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
		}
}

