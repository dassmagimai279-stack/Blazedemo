package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PurchasePage {

	WebDriver driver;

	public PurchasePage(WebDriver driver) {

		this.driver = driver;
	}

	By name = By.id("inputName");

	By address = By.id("address");

	By city = By.id("city");

	By state = By.id("state");

	By zipCode = By.id("zipCode");

	By cardType = By.id("cardType");

	By cardNumber = By.id("creditCardNumber");

	By cardMonth = By.id("creditCardMonth");

	By cardYear = By.id("creditCardYear");

	By nameOnCard = By.id("nameOnCard");

	By rememberMe = By.id("rememberMe");

	By purchaseBtn = By.xpath("//input[@value='Purchase Flight']");

	public void enterPassengerDetails() {

		driver.findElement(name).sendKeys("Magimai Dass");

		driver.findElement(address).sendKeys("Chennai");

		driver.findElement(city).sendKeys("Chennai");

		driver.findElement(state).sendKeys("Tamil Nadu");

		driver.findElement(zipCode).sendKeys("600001");

		Select select = new Select(driver.findElement(cardType));

		select.selectByVisibleText("Visa");

		driver.findElement(cardNumber).sendKeys("1234567890123456");

		driver.findElement(cardMonth).clear();

		driver.findElement(cardMonth).sendKeys("12");

		driver.findElement(cardYear).clear();

		driver.findElement(cardYear).sendKeys("2028");

		driver.findElement(nameOnCard).sendKeys("Magimai Dass");

		driver.findElement(rememberMe).click();
	}

	public void clickPurchaseFlight() {

		driver.findElement(purchaseBtn).click();
	}
}