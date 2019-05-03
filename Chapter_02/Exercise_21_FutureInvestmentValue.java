import java.util.Scanner;

public class Exercise_21_FutureInvestmentValue {

	public static void main(String[] args) {
		/*
		 * (Financial application: calculate future investment value)
		 * Created by Marinelle Reyes on 05/02/2019
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter investment amount: ");
		double invAmt = sc.nextDouble();
		System.out.println("Enter annual interest rate: ");
		double intRateInPerc = sc.nextDouble();
		System.out.println("Enter number of years: ");
		int numYrs = sc.nextInt();
		double monIR = intRateInPerc/1200;
		
		double futureIV = invAmt * Math.pow((1+monIR), (numYrs*12)); 
		
		System.out.printf("%s%.2f","Accumulated value is $",futureIV);
		sc.close();
	}

}
