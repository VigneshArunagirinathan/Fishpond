package Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.formula.functions.Value;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;
	public static void launch(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vignesh\\eclipse-workspace\\MavenProj\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
		driver.get(url);
	}
	public static void write(WebElement loc,String text) throws Throwable
	{
		loc.sendKeys(text);
		
	}
	public static void button(WebElement loc)
	{
		loc.click();
	}
	public  static String getdata(int rw,int cellno) throws Throwable
	{
		String value=null;
		File loc=new File("C:\\Users\\vignesh\\eclipse-workspace\\MavenProj\\Excel\\fishpond.xlsx");
		FileInputStream fis=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(fis);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(rw);
		Cell c = r.getCell(cellno);
		int type = c.getCellType();
		if(type==1)
		{
			value = c.getStringCellValue();
		}
		else if(type==0)
		{
			if(DateUtil.isCellDateFormatted(c))
			{
				Date dateCellValue = c.getDateCellValue();
				SimpleDateFormat sim=new SimpleDateFormat("dd-MMM-yy");
				 value = sim.format(dateCellValue);
			}
			else
			{
				double numericCellValue = c.getNumericCellValue();
				long l=(long)numericCellValue;
				 value = String.valueOf(l);
			}
		}
		return value;
	}
}
