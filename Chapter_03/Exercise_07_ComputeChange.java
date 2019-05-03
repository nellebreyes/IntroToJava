import java.util.Scanner;

public class Exercise_07_ComputeChange {

	public static void main(String[] args) {
		/*
		 * (Financial application: monetary units) Modify Listing 2.10,
		 * ComputeChange .java, to display the nonzero denominations only, using
		 * singular words for single units such as 1 dollar and 1 penny, and
		 * plural words for more than one unit such as 2 dollars and 3 pennies.
		 * 
		 * Created by Marinelle Reyes on 05/02/2019
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter integer without decimal, the last 2 digits will be considered as the decimal part.");
		int input = sc.nextInt();
		int numOfDollars = input / 100;

		int remainingAmt = input % 100;

		int numOfQuarters = remainingAmt / 25;
		remainingAmt = remainingAmt % 25;

		int numOfDimes = remainingAmt / 10;
		remainingAmt = remainingAmt % 10;

		int numOfNickels = remainingAmt / 5;
		remainingAmt = remainingAmt % 5;

		int numOfPennies = remainingAmt / 1;

		System.out.println("Your change is consists of ");
		if (numOfDollars > 1) {
			System.out.println(numOfDollars + "   dollars");
		} else if (numOfDollars == 1) {
			System.out.println(numOfDollars + "   dollar");
		}

		if (numOfQuarters > 1) {
			System.out.println(numOfQuarters + " quarters");
		} else if (numOfQuarters == 1) {
			System.out.println(numOfQuarters + " quarter");
		}

		if (numOfDimes > 1) {
			System.out.println(numOfDimes + "    dimes");
		} else if (numOfDimes == 1) {
			System.out.println(numOfDimes + "    dime");
		}

		if (numOfNickels > 1) {
			System.out.println(numOfNickels + "  nickels");
		} else if (numOfNickels == 1) {
			System.out.println(numOfNickels + "  nickel");
		}

		if (numOfPennies > 1) {
			System.out.println(numOfPennies + "  pennies");
		} else if (numOfPennies == 1) {
			System.out.println(numOfPennies + "  penny");
		}
		
		sc.close();
	}

}
