package SeleniumEvening;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Screenshot 
{
	public static void main(String[] args) throws Exception 
	{
		EdgeOptions options=new EdgeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new EdgeDriver(options);
		//Thread.sleep(2000);
		//driver.manage().window().maximize();
		driver.get("https://google.com");
		TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
		//ScreenShot
		
		File src=takesScreenshot.getScreenshotAs(OutputType.FILE);
		File file=new File("E://Screenshot.png");
		FileUtils.copyFile(src, file);
		
	}
}