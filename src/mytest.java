import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mytest {

	WebDriver driver = new ChromeDriver();
	String URL = "https://global.almosafer.com/en";

	@BeforeTest

	public void MySetUp() {
		driver.manage().window().maximize();
		
		driver.get(URL);
		
		WebElement ButtonForTheCurrency = driver.findElement(By.cssSelector(".sc-jTzLTM.hQpNle.cta__button.cta__saudi.btn.btn-primary"));
		ButtonForTheCurrency.click();
		
	}

	@Test(priority = 1)

	public void CheckTheEnglishLanguageIsDefault() {
		String ActualLaguage = driver.findElement(By.tagName("html")).getAttribute("lang");
		String ExpectedLanguage = "en";

		Assert.assertEquals(ActualLaguage, ExpectedLanguage);
	}

	
		@Test ( priority = 2)
		public void CheckTheDefaultCurrencyIsSAR() {
			String ActualCurrency = driver.findElement(By.xpath("//Button[@data-testid='Header__CurrencySelector']")).getText();
			String ExcpectedCurrency = "SAR"; 
			Assert.assertEquals(ActualCurrency, ExcpectedCurrency);
		}
		@Test ( priority = 3)
		public void CheckTheContactNumber() {
			String ActualContactNumber = driver.findElement(By.cssSelector(".sc-hUfwpO.bWcsTG")).getText();
			String ExcpectedContactNumber = "+966554400000";
			Assert.assertEquals(ActualContactNumber, ExcpectedContactNumber);
			
		}
		@Test ( priority = 4)
		public void CheckQitafLogoIsThereInTheFooter () {
			Boolean ActualResult = driver.findElement(By.cssSelector(".sc-bdVaJa.bxRSiR.sc-ciodno.lkfeIG")).isDisplayed();
			Boolean ExcpectedResult = true; 
			Assert.assertEquals(ActualResult, ExcpectedResult); 
			
			
			
			
			
		} 

		
		
		
	
	
	
	}
	

