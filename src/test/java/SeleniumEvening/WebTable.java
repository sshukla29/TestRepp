package SeleniumEvening;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;

import dev.failsafe.internal.util.Assert;


public class WebTable 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement Table=driver.findElement(By.id("product"));
		Javascript jv=new JavaScript();
		jv.ScrollIntoView(driver, Table);
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=1000");
		
		List<WebElement>Amount=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;//28
		for(WebElement amt:Amount)
		{
			int x=Integer.parseInt(amt.getText().trim());//28,23
			sum=sum+x;//0+28=28+23=51
		}
		System.out.println(sum);
		String CollectedAmount=driver.findElement(By.cssSelector("div.totalAmount")).getText();
		String ExpectedSum=CollectedAmount.split(":")[1].trim();
		String CalculatedSum= String.valueOf(sum);
		Assert.assertEquals(CalculatedSum, ExpectedSum);
		
		
	}
}