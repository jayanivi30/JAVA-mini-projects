package Miniproj;
import java.util.*;
public class temperatureCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		double temp,newtemp;
		String choice;
		System.out.print("Enter the temperature: ");
		temp=sc.nextDouble();
		System.out.print("Do you want to convert it into celcius or fahrenheit?(c or f)? ");
		choice=sc.next().toUpperCase();
		newtemp=(choice.equals("C")) ? (temp-32)*5/9 : (temp*5/9)+32;
		System.out.printf("%.1f°%s",newtemp,choice);
		sc.close();

	}

}
