import java.util.Scanner;

public class Exercise_13_FinancialApplicationCompoundValue {

	public static void main(String[] args) {
		/*
		 * (Financial application: compound value) Suppose you save $100 each
		 * month into a savings account with the annual interest rate 5%. Thus,
		 * the monthly interest rate is 0.05/12 = 0.00417.
		 * 
		 * Created by Marinelle Reyes on 05/02/2019
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the monthly saving amount: ");
		double depAmt = sc.nextDouble();
		double intRate = 0.05 / 12;

		double monthlySavings = 100;
		double AmtEarned = depAmt * (1 + intRate);
		// adding event 100

		for (int i = 1; i < 6; i++) {
			AmtEarned = (AmtEarned + monthlySavings) * (1 + intRate);
		}
		System.out.printf("%s%.2f","$",AmtEarned);
		sc.close();
	}

}
