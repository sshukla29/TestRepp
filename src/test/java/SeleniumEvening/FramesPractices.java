package SeleniumEvening;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FramesPractices 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.testingbaba.com/old/newdemo.html#tab_3");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[@data-target='#alerts']")).click();
//		driver.findElement(By.xpath("//a[text()='frames']")).click();
//		WebElement BigFrame=driver.findElement(By.xpath("//iframe[@src='Framelink.html' and contains(@style,'200px')]"));
//		driver.switchTo().frame(BigFrame);
//		String BigFrameText=driver.findElement(By.tagName("h1")).getText();
//		System.out.println("Big Frame Text: "+BigFrameText);
//		driver.switchTo().defaultContent();//getting out of frame.
//		String PageTitle=driver.findElement(By.id("bannertitle")).getText();
//		System.out.println(PageTitle);
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='Framelink.html' and contains(@style,'80')]")));
//		String SmallFrameText=driver.findElement(By.tagName("h1")).getText();
//		System.out.println("Small Frame Text: "+SmallFrameText);
		
		//----------------Nested Frame------------
		driver.findElement(By.xpath("//a[text()='nested frames']")).click();
		WebElement FirstFrame=driver.findElement(By.xpath("//iframe[@src='target1.html']"));
		driver.switchTo().frame(FirstFrame);
		WebElement parent=driver.findElement(By.xpath("//iframe[@src='text.html']"));
		driver.switchTo().frame(parent);
		WebElement child=driver.findElement(By.xpath("//iframe[@src='example.html']"));
		driver.switchTo().frame(child);
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		String msg=driver.findElement(By.tagName("p")).getText();
		System.out.println(msg);
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		String PageTitle=driver.findElement(By.id("bannertitle")).getText();
		System.out.println(PageTitle);
		
		driver.close();
		
		
	}

}