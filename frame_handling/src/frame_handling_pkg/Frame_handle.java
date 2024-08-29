package frame_handling_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_handle {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","D:\\STC\\Selenium_Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		
		/*Switching by Index
		driver.switchTo().frame(0); 
		driver.findElement(By.name("fldLoginUserId")).sendKeys("prashant1992");*/
		
		/*Switching by Frame Name
		driver.switchTo().frame("login_page");
		driver.findElement(By.name("fldLoginUserId")).sendKeys("prashant1992");*/
		
		//Switching by WebElement
		WebElement frame1=driver.findElement(By.name("login_page"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("fldLoginUserId")).sendKeys("prashant1992");

	}

}
