package browseroperations;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
	
	//String driverPath3= System.getProperty("user.dir")+"\\driver\\chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	ChromeDriver ch = new ChromeDriver();


	}

}
