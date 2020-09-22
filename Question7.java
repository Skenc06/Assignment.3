package assignment3;

public class Question7 {

	public static void main(String[] args) {
		
		int change, quarters, dimes, nickles;
		int price = 95;
		
		quarters = (100 - price) / 25;
		dimes =((100 - price ) % 25) / 10;
		nickles = (100 - price - quarters * 25 - dimes * 10) / 5;
		
		System.out.println("Your change is " + 	quarters + " quarters, " + dimes + " dimes, and " + nickles + " nickels");

	}

}
