package Demo;

public class ElectricityBill {
	

	public static void main(String[] args) {

	
	
		        int unitsConsumed = 110; 

		        // Rate list
		        int rate0to100 = 2;
		        int rate101to150 = 3;
		        int rate151to200 = 4;
		        int rate201to250 = 5;
		        int rate251to300 = 6;
		        int rate301to500 = 7;
		        int rateAbove500 = 8;

		  
		        double bill = unitsConsumed <= 100 ? unitsConsumed * rate0to100 :
		                     unitsConsumed <= 150 ? 100 * rate0to100 + (unitsConsumed - 100) * rate101to150 :
		                     unitsConsumed <= 200 ? 100 * rate0to100 + 50 * rate101to150 + (unitsConsumed - 150) * rate151to200 :
		                     unitsConsumed <= 250 ? 100 * rate0to100 + 50 * rate101to150 + 50 * rate151to200 + (unitsConsumed - 200) * rate201to250 :
		                     unitsConsumed <= 300 ? 100 * rate0to100 + 50 * rate101to150 + 50 * rate151to200 + 50 * rate201to250 + (unitsConsumed - 250) * rate251to300 :
		                     unitsConsumed <= 500 ? 100 * rate0to100 + 50 * rate101to150 + 50 * rate151to200 + 50 * rate201to250 + 50 * rate251to300 + (unitsConsumed - 300) * rate301to500 :
		                     100 * rate0to100 + 50 * rate101to150 + 50 * rate151to200 + 50 * rate201to250 + 50 * rate251to300 + 200 * rate301to500 + (unitsConsumed - 500) * rateAbove500;

		        System.out.println("Electricity bill for " + unitsConsumed + " units: $" + bill);
		    }
		

	
}
