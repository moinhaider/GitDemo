package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launcapp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\CHD\\chromedriver");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://aiforevery1.com/demo/");

	}

}
