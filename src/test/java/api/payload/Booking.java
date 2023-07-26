package api.payload;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.util.List;

public class Booking {
	
	 boolean IsExternal;
	 
	 int AdvertiserId;
     PrimaryClientCodeDTO PrimaryClientCode;
     

	PrimaryProductCodeDTO PrimaryProductCode;
     String Campaign;
     String PurchaseOrder;
     int AgencyId;
     String BusinessDirector;
     int CurrencyId;
     int AccountDirectorId;
     String StartDate;
     String EndDate;
     String AdditionalCommentary;
     String FinancialCode;
     
	
	
	
     public static class PrimaryClientCodeDTO {
          int Id;
          String Name;

         // Constructor
         public PrimaryClientCodeDTO(int id, String name) {
             this.Id = id;
             this.Name = name;
         }
         public int getId() {
             return Id;
         }

         public String getName() {
             return Name;
         }
         
     }

     public static class PrimaryProductCodeDTO {
          int Id;
          String Name;

         // Constructor
         public PrimaryProductCodeDTO(int id, String name) {
             this.Id = id;
             this.Name = name;
         }
         public int getId() {
             return Id;
         }

         public String getName() {
             return Name;
         }
         
     }
     
     public PrimaryClientCodeDTO getPrimaryClientCode() {
         return PrimaryClientCode;
     }

     public void setPrimaryClientCode(PrimaryClientCodeDTO primaryclientcode) {
         this.PrimaryClientCode = primaryclientcode;
     }

     public PrimaryProductCodeDTO getPrimaryProductCode() {
         return PrimaryProductCode;
     }

     public void setPrimaryProductCode(PrimaryProductCodeDTO primaryProductCode) {
         this.PrimaryProductCode = primaryProductCode;
     }
    
    public static File[] getFileArray(String[] filePaths) {
        File[] files = new File[filePaths.length];
        for (int i = 0; i < filePaths.length; i++) {
            files[i] = new File(filePaths[i]);
        }
        return files;
    }
	 
     public boolean getIsExternal() {
		return IsExternal;
	}

	public void setIsExternal(boolean isExternal) {
		IsExternal = isExternal;
	}

	public int getAdvertiserId() {
		return AdvertiserId;
	}

	public void setAdvertiserId(int advertiserId) {
		AdvertiserId = advertiserId;
	}

	

	public String getCampaign() {
		return Campaign;
	}

	public void setCampaign(String campaign) {
		Campaign = campaign;
	}

	public String getPurchaseOrder() {
		return PurchaseOrder;
	}

	public void setPurchaseOrder(String purchaseOrder) {
		PurchaseOrder = purchaseOrder;
	}

	public int getAgencyId() {
		return AgencyId;
	}

	public void setAgencyId(int agencyId) {
		AgencyId = agencyId;
	}

	public String getBusinessDirector() {
		return BusinessDirector;
	}

	public void setBusinessDirector(String businessDirector) {
		BusinessDirector = businessDirector;
	}

	public int getCurrencyId() {
		return CurrencyId;
	}

	public void setCurrencyId(int currencyId) {
		CurrencyId = currencyId;
	}

	public int getAccountDirectorId() {
		return AccountDirectorId;
	}

	public void setAccountDirectorId(int accountDirectorId) {
		AccountDirectorId = accountDirectorId;
	}

	public String getStartDate() {
		return StartDate;
	}

	public void setStartDate(String startDate) {
		StartDate = startDate;
	}

	public String getEndDate() {
		return EndDate;
	}

	public void setEndDate(String endDate) {
		EndDate = endDate;
	}

	public String getAdditionalCommentary() {
		return AdditionalCommentary;
	}

	public void setAdditionalCommentary(String additionalCommentary) {
		AdditionalCommentary = additionalCommentary;
	}

	public String getFinancialCode() {
		return FinancialCode;
	}

	public void setFinancialCode(String financialCode) {
		FinancialCode = financialCode;
	}

	

	

	

	

	
	

}
