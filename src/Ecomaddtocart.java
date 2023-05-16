import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecomaddtocart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List <WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++)
		{
			String name = products.get(i).getText();
			if(name.contains("cucumber"))
			{
				driver.findElements(By.xpath("//button[text()='Add to cart")).get(i).click();
			}
		}

	}

}
