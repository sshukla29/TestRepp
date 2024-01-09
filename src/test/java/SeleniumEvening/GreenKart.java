package SeleniumEvening;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GreenKart 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//		String veg="Tomato";
        driver.manage().window().maximize();
//		WebElement AddToCart=driver.findElement(By.xpath("//h4[contains(.,'"+veg+"')]/following-sibling::div[@class='product-action']/button[text()='ADD TO CART']"));
//		AddToCart.click();
		
		String veggies[]= {"Cucumber","Beetroot","Beans","Potato"};
		List<WebElement> productName=driver.findElements(By.xpath("//h4[@class='product-name']"));
		List<WebElement> addToCart=driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
		List<String> items=Arrays.asList(veggies);
		
		for(int i=0;i<productName.size();i++)
		{	
			String name=productName.get(i).getText();//- 1 Kg
			String trimmedName=name.substring(0, name.indexOf("-")-1);//Brocolli
			//name.split("-")[0].trim();
			if(items.contains(trimmedName))
			{
				addToCart.get(i).click();
			}
		}
	}

}