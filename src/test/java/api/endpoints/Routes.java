package api.endpoints;

public class Routes {
	
	
	public static String base_url = "https://dev-bp-api.omgskynet.io";
	
	//Booking model
	public static String create_booking_url = base_url+"/api/bookings/booking";
	public static String client_configuration_url = base_url+"/api/bookings/client/{clientid}/configuration";
	public static String advertiser_configuration_url=base_url+"/api/bookings/advertiser/{advertiserId}/configuration";
	
	

}
