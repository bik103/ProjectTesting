package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LogInPage extends Base {
	
	WebDriver driver;
	public void login_site_url() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.vuse.com/gb/en/");
	}
	
	public void accept_all_cookies() {
		WebElement cookies=driver.findElement(By.xpath("//button[@id=\"onetrust-accept-btn-handler\"]"));
		cookies.click();
	}
	
//	public void select_country() {
//		WebElement country_dd=driver.findElement(By.xpath("//select"));
//		selectByVisibleText(country_dd ,"United Kingdom");
//	}
	
	
	public void age_ver() {
		WebElement age_rest_btn=driver.findElement(By.xpath("//button[@id=\"btn-entry-age-allow\"]"));
		age_rest_btn.click();
	}
	
	public void go_to_accounts() {
		WebElement account=driver.findElement(By.xpath("//span[@class=\"icon-account\"]"));
		Actions a = new Actions(driver);
		a.moveToElement(account).build().perform();
	}
	
	public void go_to_login() {
		WebElement signIn_register=driver.findElement(By.xpath("//a[@href=\"https://www.vuse.com/gb/en/customer/account\"]"));
		Actions a = new Actions(driver);
		a.moveToElement(signIn_register);
		a.click().build().perform();
	}
	
	public void enter_valid_email_and_password() {
	    WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
	    email.sendKeys("yuvrajk103@gmail.com");
	    
	    WebElement password = driver.findElement(By.xpath("(//input[@id=\"pass\"])[1]"));
	    password.sendKeys("@Bikash123");
	    
	}
	
	public void click_login() {
		WebElement login_btn=driver.findElement(By.xpath("(//button[@id=\"send2\"])[1]"));
		login_btn.click();
	}
	
//	public void validate_login() {
//		
//		   WebElement ele= driver.findElement(By.xpath("//h2[@class=\"account-info__heading\"]"));
//		   boolean s = ele.isDisplayed();
//		 
//		  // assertTrue(ele.isDisplayed());
//	}
	
//	public void close_browser() {
//		driver.quit();
//	}
//	
}
