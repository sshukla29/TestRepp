package SeleniumEvening;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandles {

	public static void main(String[] args) 
	{
		WebDriver driver =new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//selenium 3//deprecated method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//selenium 4
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		//String HomePage=driver.getWindowHandle();//get the current/active window ID
		Set<String> windows=driver.getWindowHandles();//2 window id
		Iterator<String> it=windows.iterator();
		String parentID=it.next();
		String childID=it.next();
		driver.switchTo().window(childID);
		String userNameMsg=driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
		String username=userNameMsg.split(" ")[4];
		System.out.println(userNameMsg);
		//driver.close();
		driver.switchTo().window(parentID);
		driver.findElement(By.id("username")).sendKeys(username);
		//driver.quit();
				
	}
}
