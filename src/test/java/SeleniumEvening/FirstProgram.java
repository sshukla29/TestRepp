package SeleniumEvening;


import org.openqa.selenium.edge.EdgeDriver;

public class FirstProgram 
{
	public static void main(String[] args)
	{
		EdgeDriver driver=new EdgeDriver();
		//Launch broswer
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//Maximize window
		String title=driver.getTitle();
		//Get title of the landed page
		System.out.println("Website title: "+title);
		String url=driver.getCurrentUrl();
		System.out.println("Website URL:  "+url);
		//close browser
		driver.close();
		
	}

}
