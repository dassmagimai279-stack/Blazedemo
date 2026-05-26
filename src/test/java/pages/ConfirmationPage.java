package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage {

	WebDriver driver;

	public ConfirmationPage(WebDriver driver) {

		this.driver = driver;
	}

	By successMsg = By.xpath("//h1");

	By bookingId = By.xpath("//td[text()='Id']/following-sibling::td");

	By status = By.xpath("//td[text()='Status']/following-sibling::td");

	By amount = By.xpath("//td[text()='Amount']/following-sibling::td");

	public String getSuccessMessage() {

		return driver.findElement(successMsg).getText();
	}

	public String getBookingId() {

		return driver.findElement(bookingId).getText();
	}

	public String getStatus() {

		return driver.findElement(status).getText();
	}

	public String getAmount() {

		return driver.findElement(amount).getText();
	}
}