package co.mywayoflearning.eduraka11july;

public class HDFCCreditCardUsageAnalysis {

	public static void main(String[] args) {
		// MODEL VIEW CONTROLLER 

		  // Model is Data -> We need storage containers to store data
		  // Storage Container Creation Statements
		  // We are creating storage containers in RAM for our Program to store the data
		  // Data for Apple iPhone
		  int iPhoneDay1 = 150;
		  int iPhoneDay2 = 250;
		  int iPhoneDay3 = 100;
		  
		  int iPhoneProfitsToFK = 1000;
		  int iPhoneHdfcOffer = 500;
		  
		  // Data for Home Appliances
		  int homeAppDay1 = 120;
		  int homeAppDay2 = 220;
		  int homeAppDay3 = 180;
		  
		  int homeAppProfitsToFK = 200;
		  int homeAppHdfcOffer = 100;
		  
		  // Controller is Computation or Logic
		  // Computational Expression Statement
		  int totalSalesForIPhone = iPhoneDay1 + iPhoneDay2 + iPhoneDay3;
		  int totalSalesForhomeApp = homeAppDay1 + homeAppDay2 + homeAppDay3;
		  
		  // View is either showing the data or reading the data to and from user
		  // As of now, we will show the data and its a Textual Interface
		  // Printing Statements
		  System.out.println("3 day total Sales For IPhone is: "+totalSalesForIPhone);
		  System.out.println("3 day total Sales For Home App is: "+totalSalesForhomeApp);
		  
		  // Controller is Computation or Logic
		  // Logical Statement, check where we have more customers either in iPhone sales or in Home App
		  if(totalSalesForIPhone > totalSalesForhomeApp) {
		   System.out.println("More Customers for iPhone Sales were found on 3 Day Sale");
		  }else {
		   System.out.println("More Customers "+totalSalesForhomeApp+" for Home App Sales were found on 3 Day Sale by "+(totalSalesForhomeApp-totalSalesForIPhone));
		  }
		  
		  int avgIphoneSale = totalSalesForIPhone/3;
		  int avgHomeSale = totalSalesForhomeApp/3;

		  if(iPhoneHdfcOffer>homeAppHdfcOffer) {
			  System.out.println("HDFC Bank Spent More in IPhone sale!");
		  } else {
			  System.out.println("HDFC Bank Spent More in Home app sale!");
		  }
		  if(iPhoneProfitsToFK>homeAppProfitsToFK) {
			  System.out.println("FK will make more money in IPhone");
		  } else {
			  System.out.println("FK will make more money in Home App");
		  }

		 }
		 
		 // Assignments: 
		 // 1. Where did HDFC Bank Spent More in giving offers as in amount spent more
		 // 2. How much profits were made by Flipkart. Will FK make more money in selling iphones or home appliances
		 // 3. Create an Account on Github and explore how to install and link Github account with Eclipse :)

	}