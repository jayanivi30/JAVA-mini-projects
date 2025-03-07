package Miniproj;
import java.util.*;
public class calculatorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1,num2,result=0;
		boolean isvalid=true;
		char operator;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		num1=sc.nextDouble();
		System.out.print("Enter operator (+, -, *, /, *): ");
		operator=sc.next().charAt(0);
		System.out.print("Enter second number: ");
		num2=sc.nextDouble();
		switch(operator) {
		case '+' -> result = num1+num2;
		case '-' -> result = num1-num2;
		case '*' -> result = num1*num2;
		case '/' -> {
			if(num2==0) {
				System.out.print("Cannot divide by zero.");
				isvalid=false;
			}
			else {
				result = num1/num2;
			}
			
		}
		case '^' -> result = Math.pow(num1, num2);
		default ->  {
			System.out.print("Invalid operator!");
			isvalid=false;
		}
		}
		if(isvalid) {
			System.out.print(result);
		}
		sc.close();

	}

}
