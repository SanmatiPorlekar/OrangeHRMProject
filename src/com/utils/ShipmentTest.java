package utils;

import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

	
public class ShipmentTest {
	String[][] data ;
	public static WebDriver driver;
    	ReadExcel readex = new ReadExcel();
    	public static Sheet sh;
    	
    	
    	public String[][] getData() throws InvalidFormatException, IOException {
    	String filePath="C:\\Users\\sai_chavatapalli\\eclipse-workspace\\com.orangeHRMMiniProject\\Resources";
    	 String fileName="miniProject.xlsx";
    	 String sheetName="Sheet1";
    	 
    	 sh= readex.readExcel(filePath, fileName, sheetName);
    	 
    	 int totalRows= sh.getLastRowNum();
    	 Row firstRow = sh.getRow(0);
    	 int totalCols =firstRow.getLastCellNum();
    	 
    	 data = new String[14][9];
    	 DataFormatter format=new DataFormatter();
    	 for(int i=1;i<totalRows+1;i++) {
    	 for(int j=0;j<totalCols;j++) {
    	 data[i-1][j]=format.formatCellValue(sh.getRow(i).getCell(j));  
    	 }
    	 }
    	 //System.out.println(Arrays.deepToString(data));
    	 return data;
		}
    
}