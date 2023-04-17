package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpPage extends Base {
	Base b = new Base();
	WebDriver driver;
	
	public void launchURL() {
		
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vuse.com/gb/en/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	}
	
	public void acceptCookies() {
		WebElement acceptCookie = driver.findElement(By.xpath("//button[@id=\"onetrust-accept-btn-handler\"]"));
		acceptCookie.click();
	}
	public void ageVerification() {
		WebElement ageVeri = driver.findElement(By.xpath("//button[@id=\"btn-entry-age-allow\"]"));
		ageVeri.click();
	}
	public void cursorHover() {
		WebElement mouseHoverToSignIn = driver.findElement(By.xpath("//span[@class=\"icon-account\"]"));
		Actions a= new Actions(driver);
		a.moveToElement(mouseHoverToSignIn).build().perform();
		
		WebElement signInButton = driver.findElement(By.xpath("//li[@class=\"view-favorite switcher-option\"]//a[@href=\"https://www.vuse.com/gb/en/customer/account\"]"));
		signInButton.click();
	}
	    
	
	public void create_account() {
		WebElement create_account=driver.findElement(By.xpath("//a[@class=\"action create primary\"]"));
		create_account.click();
	}
	public void enteringCredentials() {
		WebElement f_name=driver.findElement(By.xpath("(//input[@id=\"firstname\"])[1]"));
		f_name.sendKeys("Rahul");
		
		WebElement l_name=driver.findElement(By.xpath("(//input[@id=\"lastname\"])[1]"));
		l_name.sendKeys("Dubey");
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"email_address\"]"));
		email.sendKeys("rahul_dubey@gmail.com");
		
		WebElement dob=driver.findElement(By.xpath("//*[@id=\"dob\"]"));
		dob.sendKeys("18/08/1998");
		
		WebElement gender=driver.findElement(By.xpath("//select[@id=\"gender\"]"));
		//we will use select class if the dropdown tag is <select> else we will use bootstrap method
		Select dd=new Select(gender);
		dd.selectByValue("1"); 
//		dd.selectByIndex(0);
//		dd.selectByVisibleText("Male");
		WebElement addr=driver.findElement(By.xpath("//*[@id=\"address-search\"]"));
		addr.sendKeys("Dwarka nagar, Bangalore");
		
//		WebElement phone=driver.findElement(By.xpath("(//*[@id=\"telephone\"])[1]"));
//		phone.sendKeys("+918638337625");
		WebElement mobile_not_uk_checkBox = driver.findElement(By.xpath("//label[@for=\"mobile_text_required\"]"));
		mobile_not_uk_checkBox.click();
//		WebElement terms_cond_cb=driver.findElement(By.xpath("//label[@for=\"mobile_text_required\"]"));
//		terms_cond_cb.click();
		
		WebElement create_pass=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		create_pass.sendKeys("Password@1");
		
		WebElement confirm_pass=driver.findElement(By.xpath("//input[@id=\"password-confirmation\"]"));
		confirm_pass.sendKeys("Password@1");
		
		WebElement accept_terms=driver.findElement(By.xpath("(//label[@class=\"label choice-box__label\"])[1]"));
		accept_terms.click();		
		
//		WebElement submit_btn=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
//		submit_btn.click();

	}
	
}
