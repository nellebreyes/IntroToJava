import java.util.Scanner;

public class Exercise_20_InterestRate {

	public static void main(String[] args) {
		/*
		 * (Financial application: calculate interest)
		 * Created by Marinelle Reyes on 05/02/2019
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter balance and interest rate: ");
		double balance = sc.nextDouble();
		double intRate = sc.nextDouble();
		
		double interest = balance * (intRate/1200);
		
		System.out.printf("%s%.2f", "The interest is " ,interest);
		sc.close();
	}

}
