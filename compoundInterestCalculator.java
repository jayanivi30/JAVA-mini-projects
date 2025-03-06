package Miniproj;
import java.util.*;
public class compoundInterestCalculator {
	public static void main(String args[]) {
	double principal;
	double interest;
	int years;
	int timecompound;
	double amount;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the principal amount: ");
	principal=sc.nextDouble();
	System.out.print("Enter the interest rate: ");
	interest = sc.nextDouble()/100;
	System.out.println("Enter the no. of times compounded per year: ");
	timecompound=sc.nextInt();
	System.out.print("Enter the no. of years: ");
	years=sc.nextInt();
	amount = principal * Math.pow(1+interest/timecompound, timecompound*years);
	System.out.printf("The amount after %d years is Rs.%,.2f",years,amount);
	sc.close();

	}
}
