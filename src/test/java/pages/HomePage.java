package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
	}

	By fromCity = By.name("fromPort");

	By toCity = By.name("toPort");

	By findFlightsBtn = By.xpath("//input[@value='Find Flights']");

	public void selectDepartureCity(String city) {

		Select select = new Select(driver.findElement(fromCity));

		select.selectByVisibleText(city);
	}

	public void selectDestinationCity(String city) {

		Select select = new Select(driver.findElement(toCity));

		select.selectByVisibleText(city);
	}

	public void clickFindFlights() {

		driver.findElement(findFlightsBtn).click();
	}
}