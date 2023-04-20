package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	WebDriver driver;
	
//	public void launch_url() {
//	
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//	    driver = new ChromeDriver(options);
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		}
	public void selectByVisibleText(WebElement ele, String str) {
		Select s=new Select(ele);
		s.selectByVisibleText(str);
	}
	
	public void pressEnterKeyboard(WebDriver driver) {
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void mouseHover(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).build().perform();;
	}
	
	public void scrollToElement(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.scrollToElement(ele).build().perform();;
	}
	public void getScreenshot() {
		TakesScreenshot src = ((TakesScreenshot)driver);
		File srcfile=src.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File("Screenshots/test.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public void screenshotOnFailure(Scenario s) {
		if(s.isFailed()) {
			getScreenshot();
		}
	}
}
