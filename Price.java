package movies;
import java.util.*;
public class Price {
	static int fare;static float fare_gst;
	public static void main(String[] args) {
		
		
	}
	 public static boolean seatTypeCheck(String seatChoice) {
		 boolean check=false;
		 String[] seatType = new String[3];
			seatType[0]="Silver";
		    seatType[1]="Gold";
			seatType[2]="Platinum"; 
			
			for(String type : seatType) {
				if(type.equalsIgnoreCase(seatChoice)) {
					check=true;
				}
				else {
					check=false;
				}
			}
			return check;
			
	 }
	 
			public static int ticketFare(String seatChoice, int seat1) {
				if(seatChoice.equalsIgnoreCase("Silver")) {
					fare=500*seat1;
				}
				else if(seatChoice.equalsIgnoreCase("Gold")) {
					fare=1000*seat1;
				}
				
				else if(seatChoice.equalsIgnoreCase("Platinum")) {
					fare=1500*seat1;
				}
				return fare;
			}
			
			public static float gst() {
				System.out.println("The GST amount is 7%");
				fare_gst =(fare*7)/100 + fare;
				System.out.println(fare_gst);
				
				return fare_gst;
			}

	 }

