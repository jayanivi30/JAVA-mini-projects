package Miniproj;
import java.util.*;
public class weightconverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Weight convert program");
		System.out.println("Option 1: lbs to kgs");
		System.out.println("Option 2: kgs to lbs");
		double weight;
		double newweight;
		int choice;
		System.out.print("Enter your option: ");
		choice=sc.nextInt();
		if(choice==1) {
			System.out.print("Enter weight in lbs: ");
			weight=sc.nextDouble();
			newweight=weight*0.453592;
			System.out.printf("Weight in kgs is %.2f",newweight);
		}
		else if(choice==2){
			System.out.print("Enter weight in kgs: ");
			weight=sc.nextDouble();
			newweight=weight*2.20462;
			System.out.printf("Weight in lbs is %.2f",newweight);
		}
		else {
			System.out.println("Invalid choice!");
		}
		
		
		
		
		sc.close();

	}

}
