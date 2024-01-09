package SeleniumEvening;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.netty.handler.timeout.TimeoutException;

public class FluentWaitExample 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//div[@id='start']/button")).click();
		
		//By msg=By.xpath("//div[@id='finish']/h4");
		final WebElement msg=driver.findElement(By.xpath("\"//div[@id='finish']/h4"));
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(4))
				.ignoring(NoSuchElementException.class)
				.ignoring(TimeoutException.class);
//		WebElement getResult=wait.until(ExpectedConditions.visibilityOfElementLocated(msg));

		WebElement getResult=wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver)
			{
				if(msg.isDisplayed())
				{
					return msg;
				}
				else
				{
					return null;
				}
			}
			
		});
		
		System.out.println(getResult.getText());
	}
}