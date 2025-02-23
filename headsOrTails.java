package Miniproj;
import java.util.*;
public class headsOrTails {
	public static void main(String args[]) {
		Random random = new Random();
		boolean isHead;
		isHead = random.nextBoolean();
		System.out.println("Head or Tails? Let's see...");
		if(isHead) {
			System.out.print("Heads");
		}
		else {
			System.out.print("Tails");
		}
	}

}
