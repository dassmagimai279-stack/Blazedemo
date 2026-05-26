package tests;

import java.io.FileWriter;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.ConfirmationPage;
import pages.HomePage;
import pages.PurchasePage;
import pages.ReservePage;

public class PurchaseFlightTest extends BaseClass {

	@Test
	public void bookFlightTest() throws Exception {

		HomePage home = new HomePage(driver);

		home.selectDepartureCity("Paris");

		home.selectDestinationCity("Buenos Aires");

		home.clickFindFlights();

		ReservePage reserve = new ReservePage(driver);

		reserve.chooseFlight();

		PurchasePage purchase = new PurchasePage(driver);

		purchase.enterPassengerDetails();

		purchase.clickPurchaseFlight();

		ConfirmationPage confirm = new ConfirmationPage(driver);

		String message = confirm.getSuccessMessage();

		String bookingId = confirm.getBookingId();

		String status = confirm.getStatus();

		String amount = confirm.getAmount();

		System.out.println("Message : " + message);

		System.out.println("Booking ID : " + bookingId);

		System.out.println("Status : " + status);

		System.out.println("Amount : " + amount);

		FileWriter writer = new FileWriter("BookingDetails.txt");

		writer.write("Message : " + message + "\n");

		writer.write("Booking ID : " + bookingId + "\n");

		writer.write("Status : " + status + "\n");

		writer.write("Amount : " + amount);

		writer.close();

		Assert.assertEquals(message, "Thank you for your purchase today!");
	}
}