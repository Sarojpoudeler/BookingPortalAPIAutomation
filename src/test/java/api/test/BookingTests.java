package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.BookingEndPoints;

import api.payload.Booking;
import api.payload.Booking.PrimaryClientCodeDTO;
import api.payload.Booking.PrimaryProductCodeDTO;
import io.restassured.response.Response;

public class BookingTests {
	
	Faker faker;
	Booking bookingPayload;
	
	public Logger logger;
	
	@BeforeClass
	public void setupData()
	{
		faker = new Faker();
		bookingPayload = new Booking();
		
		bookingPayload.setIsExternal(false);
		bookingPayload.setAdvertiserId(41);
		bookingPayload.setPrimaryClientCode(new PrimaryClientCodeDTO(1310, "ADELAIDE FOOTBALL CLUB LIMITED [ADEBAL]"));
		bookingPayload.setPrimaryProductCode(new PrimaryProductCodeDTO(42713, "GENERAL [GEN]"));
		bookingPayload.setCampaign("Sample Campaign using restassured");
		bookingPayload.setPurchaseOrder("PO123");
		bookingPayload.setAgencyId(7);
		bookingPayload.setBusinessDirector("TONY MCKAY");
		bookingPayload.setCurrencyId(1);
		bookingPayload.setAccountDirectorId(1058);
		bookingPayload.setStartDate("07/19/2023");
		bookingPayload.setEndDate("07/19/2023");
		bookingPayload.setAdditionalCommentary("Additional comments here");
		bookingPayload.setFinancialCode("FC456");
		
		
		logger = LogManager.getLogger(this.getClass());
		
		
	}
	@Test(priority = 1)
	public void testCreateBooking()
	{
		logger.info("*********Creating Booking ***************");
		
		Response response = BookingEndPoints.createBooking(bookingPayload);
		
		response.then().log().all();
	
		Assert.assertEquals(response.getStatusCode(), 200);
		
		logger.info("*********Booking Created successfully ***************");
	}

}
