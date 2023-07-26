package api.endpoints;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import api.payload.Booking;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

//Created to perform Create, Read , Update , Delete requests to the user API

public class BookingEndPoints {
	
	public static Response createBooking(Booking bookingPayload)
	{
		String bearerToken = "eyJhbGciOiJSUzI1NiIsImtpZCI6IkE3MzJCNEUwQjg5QjQzODJFMDM2NTM4ODVCMzAzQzdCMkU3MUNDMzBSUzI1NiIsInR5cCI6ImF0K2p3dCIsIng1dCI6InB6SzA0TGliUTRMZ05sT0lXekE4ZXk1eHpEQSJ9.eyJuYmYiOjE2OTAzNDYzNjQsImV4cCI6MTY5MDM4OTU2NCwiaXNzIjoiaHR0cHM6Ly9kZXYtbG9naW4ub21nc2t5bmV0LmlvIiwiYXVkIjpbInNreW5ldGFwaSIsImh0dHBzOi8vZGV2LWxvZ2luLm9tZ3NreW5ldC5pby9yZXNvdXJjZXMiXSwiY2xpZW50X2lkIjoic2t5bmV0LWJwLWFwaS1zd2FnZ2VyIiwic3ViIjoiNDMyMiIsImF1dGhfdGltZSI6MTY5MDMzOTQwMSwiaWRwIjoibG9jYWwiLCJuYW1lIjoic2t5bmV0LWFkbWluLWF1QHlvcG1haWwuY29tIiwic3VidCI6IkV4dGVybmFsIiwicm9sZSI6IjQiLCJlbnR0IjoiQVUiLCJlbnR0aWQiOiIxIiwianRpIjoiNUQxQzNFNDZBMEFEMzU5MUIzMzAyMUFFRTJEMTBDQzYiLCJzaWQiOiIwNEU0MTZENkIyNzk0MEQ4NUMyMTBDNTAyM0FDQjEyRSIsImlhdCI6MTY5MDM0NjM2NCwic2NvcGUiOlsic2t5bmV0LmZ1bGxhY2Nlc3MiLCJjdXN0b21pZGVudGl0eS50cmFkZXJzIiwib3BlbmlkIl0sImFtciI6WyJwd2QiXX0.c4-IiMdHLZfx-ir9Nv8-OZdui_rjoS2Spq5MCt5e9esWLABywrCxFl5c2KWTemNi8mGMu1qTbdJxZwxYDbIomLWHGBDKa0feNw6kFUZ71d9vLd0Z7pgdadsqDvc1hAYgTiJmKq3s8UqE3NTQBK6NXMWSAk5CO3Kv6iwqWzMXk1zeZK3PSXvJKk5yr_7qfL2RjRKnfy2qx3PnHraRTazIaW1ZH7XQ1swRoszL93cL_RUMY1ArVU_48fbXqsydNLkqec8c125gMq2vNc94P144Pw8-YgGOLOr-mWWDTHwuULoKWK-Pe8a4mvaDzVXfPIa4ukzpO9N_FbSCso6ha3lVFz8fE9rLqIPrDw4kI0CpluT3AqDIWmi6oIczKNdIChYcmPyoOx280V8J3QXUg8zKnxQ5ehqeB3Zd1G9IH-jP0u_aeYqBDwhiDsHrTHP7dRhFMKgb8L13-3asjR7Zh-KWq9Lu3RSZRmjW4yMvdcWbe02JLHSPEnwsDObK_RYEiPFkYg9-aqRGX1fEFbtUZVT6Ju6j1fLufc-C2ioikXwSKkieKtccrszsauJFX35Th74vua_ynSaPD5svS4yQ-87q0QJtJkk6gLAHL9FvuUrknfk-OI5qHtXPjbKXGUlq3yIHyzrdlCjr9YMWsYCj4vHkzbS-a_A6OvECLoovYlls8T8";
		
		File myfile1 = new File("C:\\Users\\saroj.poudel\\Documents\\sample.pdf");
		File myfile2 = new File("C:\\Users\\saroj.poudel\\Documents\\dummy.pdf");
		
		
		Response response = given()
			.headers("Authorization","Bearer "+bearerToken)
			
			.accept(ContentType.MULTIPART)
			.contentType(ContentType.MULTIPART) // Set content type to multi-part
            .multiPart("IsExternal", bookingPayload.getIsExternal())
            .multiPart("AdvertiserId", bookingPayload.getAdvertiserId())
            .multiPart("PrimaryClientCode.Id", bookingPayload.getPrimaryClientCode().getId())
            .multiPart("PrimaryClientCode.Name", bookingPayload.getPrimaryClientCode().getName())
            .multiPart("PrimaryProductCode.Id", bookingPayload.getPrimaryProductCode().getId())
            .multiPart("PrimaryProductCode.Name", bookingPayload.getPrimaryProductCode().getName())
            .multiPart("Campaign", bookingPayload.getCampaign())
            .multiPart("PurchaseOrder", bookingPayload.getPurchaseOrder())
            .multiPart("AgencyId", bookingPayload.getAgencyId())
            .multiPart("BusinessDirector", bookingPayload.getBusinessDirector())
            .multiPart("CurrencyId", bookingPayload.getCurrencyId())
            .multiPart("AccountDirectorId", bookingPayload.getAccountDirectorId())
            .multiPart("StartDate", bookingPayload.getStartDate())
            .multiPart("EndDate", bookingPayload.getEndDate())
            .multiPart("AdditionalCommentary", bookingPayload.getAdditionalCommentary())
            .multiPart("FinancialCode", bookingPayload.getFinancialCode())
            .multiPart("files",myfile1)  //form data
			.multiPart("files",myfile2)
		
			.when()
			  .post(Routes.create_booking_url);
		
		
		return response;
	
	}

}
 