package com.chainsys;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.*;
public class Login {
	public static void main(String[] Args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Login Page");
		System.out.println("Enter your mobile number : ");
		Long mobileNo=in.nextLong();
		String mobileNoString = String.valueOf(mobileNo);
		if(mobileNoString.length()==10) {
			System.out.println("correct");
		}
		else {
			System.out.println("wrong");
		}
		System.out.println("Enter your password : ");
		int password=in.nextInt();
		if(password>=0 || password<=8) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		
		System.out.println();
		System.out.println("Enter journey date : ");
		String dt=in.next();
		LocalDate date=LocalDate.parse(dt);
		if(date.isAfter(LocalDate.now())|| date.isEqual(LocalDate.now())) {
			System.out.println("correct");
		}else {
			System.out.println("error");
		}
		System.out.println();
		System.out.println("Enter your journey time : ");
		String time=in.next();
		LocalTime local=LocalTime.parse(time);
		int hour=local.getHour();
		if(hour>15 && hour<19) {
		System.out.println("You are peak time");
		} else {
			System.out.println("Not peak");
		}		
		
		System.out.println("All set..!!");
		System.out.println();
		System.out.println("Enter your date of birth : ");
		String dob=in.next();
		LocalDate pdate=LocalDate.parse(dob);
		LocalDate now=LocalDate.now();
		Period d=Period.between(pdate, now);
		
		System.out.print(d.getYears());
		System.out.println();
		if(d.getYears()>=60) {
			System.out.println("You will get 50% discount..!!!");
		}
		System.out.println("Select any one : \n 1.Micro\n 2.Mini\n 3.Prime\n");
		System.out.println("Enter the number to be selected");
		int n=in.nextInt();
		if(n==1) {
			System.out.println("For micro RS.10 per kilometer");
		}
		else if(n==2) {
			System.out.println("For mini RS.15 per kilometer");
		}
		else if(n==3) {
			System.out.println("For prime RS.20 per kilometer");
		}
		System.out.println();
		System.out.println("-------Proceed further------");
		System.out.println("Enter your kilometer : ");
		int kilometer=in.nextInt();
		if(n==1) {
			double a=kilometer*10;
			double a1=a+(a*(7.0/100.0));
			System.out.println("Your total bill amount for micro is Rs : "+a);
			System.out.println("Your amount added with GST is : "+a1);
			if(d.getYears()>=60) {
				double a2=a1/2;
				System.out.println("Here is your amount : Rs:"+a2);
			}
			else {
				System.out.println("Here is your total amount to be paid : Rs:"+a1);
			}
		}
		else if(n==2) {
			double b=kilometer*15;
			double b1=b+(b*(7.0/100.0));
			System.out.println("Your total bill amount for mini is Rs : "+b);
			System.out.println("Your amount added with GST is : "+b1);
			if(d.getYears()>=60) {
				double b2=b1/2;
				System.out.println("Here is your amount : Rs:"+b2);
			}
			else {
				System.out.println("Here is your total amount to be paid : Rs:"+b1);
			}
		}
		else if(n==3) {
			double c=kilometer*20;
			double c1=c+(c*(7.0/100.0));
			System.out.println("Your total bill amount for prime is Rs : "+c);
			System.out.println("Your amount added with GST is Rs : "+c1);
			if(d.getYears()>=60) {
				double c2=c1/2;
				System.out.println("Here is your discount amount : Rs:"+c2);
			}
			else {
				System.out.println("Here is your total amount to be paid : Rs:"+c1);
			}
		}
		
	}

}
