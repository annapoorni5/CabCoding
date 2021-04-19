package movies;
import java.util.*;

public class Seat {
	public static void main(String[] args) {
		
	}
	
	public static  void seatType() {
		String[] seatType = new String[3];
		seatType[0]= "Silver";
	    seatType[1]= "Gold";
		seatType[2] = "Platinum"; 
		
		Arrays.toString(seatType);
		
		System.out.println("Number of seats is : " +seatType.length);
		for(int i=0;i<seatType.length;i++) {
			String s=seatType[i];
			System.out.println(s);
			
		}
		
		
		
		
		
	}

}
