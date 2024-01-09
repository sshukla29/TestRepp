package SeleniumEvening;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FramesPractiesThree 
{
	public static void main(String[] args)
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//frame[@src=\"/frame_left\"]")).click();
		driver.findElement(By.xpath("//frame[@src=\"/frame_middle\"]")).click();
		driver.findElement(By.xpath("//frame[@src=\"/frame_right\"]")).click();
		driver.findElement(By.xpath("//frame[@src=\"/frame_bottom\"]"));
		WebElement TopFrame=driver.findElement(By.xpath("//frame[@src=\"/frame_top\"]"));
	
		
		
		
	}
	
	

}
