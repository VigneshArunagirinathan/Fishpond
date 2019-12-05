package Maven;

import java.sql.Date;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
public class fishpnd extends BaseClass
{
@BeforeClass
public static void launch() {
	launch("https://www.fishpond.com/logoff?done");
	}
	@Before
	public void starttime() {
		Date d=new Date(0);
		System.out.println(d);
	}
	@Test
	public void tc1() throws Throwable {
		WebElement sign = driver.findElement(By.xpath( "(//a[text()='Sign in'])[3]"));
		button(sign);
		WebElement userid = driver.findElement(By.id("email_address"));
		//write(userid, "vignesh A");
		//userid.sendKeys(getdata(0,2));
		write(userid, getdata(0,2));
		WebElement pass = driver.findElement(By.id("password"));
		//write(pass,"sivaamuthan");
		//pass.sendKeys(getdata(1,2));
		write(pass, getdata(1,2));
		WebElement btn = driver.findElement(By.xpath("//button[@title='Search']"));
		button(btn);
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		write(search, "books");
		WebElement buttn = driver.findElement(By.xpath("//button[@title='Search']"));
		button(buttn);
		WebElement bok = driver.findElement(By.xpath("(//a[@class='item-middle__image-wrapper'])[1]"));
		button(bok);
		WebElement cart = driver.findElement(By.xpath("//button[text()='Add to Cart']"));
		button(cart);
		WebElement chkout = driver.findElement(By.xpath("//span[text()='Checkout']"));
		button(chkout);
		WebElement home = driver.findElement(By.xpath("//div[@class='fp-header__logo']"));
		button(home);
		WebElement search1 = driver.findElement(By.xpath("//input[@type='text']"));
		search1.sendKeys(getdata(0,0));
		//write(search1, "Watches");
		WebElement buttn1 = driver.findElement(By.xpath("//button[@title='Search']"));
		button(buttn1);
		WebElement srch1 = driver.findElement(By.xpath("(//a[@class='item-middle__image-wrapper'])[9]"));
		button(srch1);
		WebElement cart1 = driver.findElement(By.xpath("//button[text()='Add to Cart']"));
		button(cart1);
		WebElement chkout1 = driver.findElement(By.xpath("//span[text()='Checkout']"));
		button(chkout1);
	}
	
	
	
	
	
	
	
}

