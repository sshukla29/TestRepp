package SeleniumEvening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class chromeOptions 
{
	public static void main(String[] args) 
	{
		EdgeOptions options=new EdgeOptions();
		options.setAcceptInsecureCerts(false);
//		String path="C://user//downloads//extension.crx"
//		options.addExtensions(path);//crx
//		Proxy proxy=new Proxy();
//		proxy.setHttpProxy("198.12.32.23:4444");
//		options.setCapability("proxy", proxy);
		
//		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
//		options.addArguments("start-maximized");
		
//		Map<String, Object> prefs = new HashMap<String, Object>();
//		prefs.put("download.default_directory", "C:\\Users\\Tariq\\eclipse-workspace\\com.Selenium0815Project");
//		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--incognito");
		options.addArguments("start-maximized");
		
				
		WebDriver driver=new EdgeDriver(options);
		driver.get("https://untrusted-root.badssl.com/");
	}

}