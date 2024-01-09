package SeleniumEvening;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDownPractice 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Ctrl+Shit+o - package import
		driver.get("https://myudyogaadhar.org/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement GenderDropdown =driver.findElement(By.id("gender"));
		Select dd=new Select(GenderDropdown);  //It is used for drop down
		//dd.selectByIndex(2);
		//dd.selectByVisibleText("Female");
		dd.selectByValue("Female");
		System.out.println(dd.getFirstSelectedOption().getText()+" is selected.");
		WebElement TypeOfOrg=driver.findElement(By.id("Organisation_type"));
		Select TOO=new Select(TypeOfOrg);
		TOO.selectByIndex(2);
		System.out.println(TOO.getFirstSelectedOption());
		List<WebElement>OrgOptions=TOO.getOptions();
		for(WebElement x:OrgOptions)
		{
			System.out.println(x.getText());
		}
		Thread.sleep(5000);
		if(TOO.getFirstSelectedOption().getText().equals("Hindu Undivided Family"))
		{
			TOO.selectByIndex(3);
		}
	}

}
