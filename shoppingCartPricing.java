package Basics;
import java.util.*;
public class shoppingCartPricing{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("What item did you buy? ");
		String item;
		item=sc.next();
		System.out.println("What is the price of the item? ");
		double price;
		price=sc.nextDouble();
		System.out.println("How many did you buy? ");
		int num;
		num=sc.nextInt();
		double total;
		total = price*num;
		System.out.println("Your total bill amount for "+num+" "+item+"/s is Rs."+total);
		sc.close();
		
	}
	
}
