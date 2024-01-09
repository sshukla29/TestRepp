package SeleniumEvening;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LogScreenShot 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		WebElement logo=driver.findElement(By.xpath("//img[contains(@src,'logo')]"));
		File src=logo.getScreenshotAs(OutputType.FILE);	
		File target=new File("E://LogoScreenshot.jpg");
		FileUtils.copyFile(src, target);
		driver.close();
		
	}
}
