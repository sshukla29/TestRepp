package SeleniumEvening;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class SelectPassenger 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000);
		WebElement AddAdult=driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));
		WebElement AddChild=driver.findElement(By.id("hrefIncChd"));
		WebElement AddInfant=driver.findElement(By.id("hrefIncInf"));
//		AddAdult.click();
//		AddAdult.click();
//		AddAdult.click();
//		AddAdult.click();
		for(int i=1;i<5;i++)
		{
			AddAdult.click();
		}
		for(int i=0;i<2;i++)
		{
			AddChild.click();
		}
		for (int i=0; i<1;i++)
		{
			AddInfant.click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();

		
	}

}


