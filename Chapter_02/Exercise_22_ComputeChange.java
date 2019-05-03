import java.util.Scanner;

public class Exercise_22_ComputeChange {

	public static void main(String[] args) {
		/*
		 * (Financial application: monetary units) Rewrite Listing 2.10,
		 * ComputeChange .java, to fix the possible loss of accuracy when
		 * converting a double value to an int value. Enter the input as an
		 * integer whose last two digits represent the cents. For example, the
		 * input 1156 represents 11 dollars and 56 cents.
		 * 
		 * Created by Marinelle Reyes on 05/02/2019
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter integer without decimal, the last 2 digits will be considered as the decimal part.");
		int input = sc.nextInt();
		int numOfDollars = input/100;
			
		int remainingAmt = input%100;
		
		int numOfQuarters = remainingAmt/25;
		remainingAmt = remainingAmt%25;
		
		int numOfDimes = remainingAmt/10;
		remainingAmt = remainingAmt%10;
		
		int numOfNickels = remainingAmt/5;
		remainingAmt = remainingAmt%5;
		
		int numOfPennies = remainingAmt/1;
		
		System.out.println("Dollars: "+ numOfDollars);
		System.out.println("Quarters: "+ numOfQuarters);
		System.out.println("Dimes: "+ numOfDimes);
		System.out.println("Nickels: "+ numOfNickels);
		System.out.println("Pennies: "+ numOfPennies);
		
		sc.close();
		
	}

}
