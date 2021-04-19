package movies;
import java.util.*;

public class Dispaly {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your phone number : ");
		Long mob_no=in.nextLong();
		System.out.println("Enter your passwprd : ");
		String pwd=in.next();
		
		
		
		//level 1
		if(Login.checkMobileNo(mob_no,10)==true  &&  Login.checkPassword(pwd, 8)) {
			System.out.println("Loggedin successfully!!!");
		}
		else {
			System.out.println("Check correctly");
			System.exit(0);
		}
		
		
		//level 2
		System.out.println("Select seat type");
		Seat.seatType();
		
		//level 3
		System.out.println("Enter your choice : ");
		String seat=in.next();
		if(Price.seatTypeCheck(seat)==true) {
			System.out.println("Your choice is : "+seat);
		}
		/*else {
			System.out.println("Your choice is incorrect");
			System.exit(0);
		}
		*/
		
		//level 4
		
		System.out.println("Enter number of seats you needed : ");
		int seat1 =in.nextInt();
		System.out.println("Please confirm your seat choise ");
		String seatChoice=in.next();
		Price.ticketFare(seatChoice,seat1);
		Price p=new Price();
		System.out.println("Your price for seat "+seatChoice+" Rs: "+p.fare);
		
		
		
	//level 4
		
		Price.gst();
		System.out.println("Your total amount  added with gst is : ");
		System.out.println(p.fare_gst+" Rs : ");
		
		System.out.println("Thank you...!!!");

		
		
			
	}
}
