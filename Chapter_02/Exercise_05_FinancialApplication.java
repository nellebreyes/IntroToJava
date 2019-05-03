import java.util.Scanner;

public class Exercise_05_FinancialApplication {

	public static void main(String[] args) {
		/*
		 * (Financial application: calculate tips) Write a program that reads
		 * the subtotal and the gratuity rate, then computes the gratuity and
		 * total. For example, if the user enters 10 for subtotal and 15% for
		 * gratuity rate, the program displays $1.5 as gratuity and $11.5 as
		 * total.
		 * 
		 * Created by Marinelle Reyes on 05/02/2019
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the subtotal and a gratuity rate");
		double subtotal = sc.nextDouble();
		double gratuity = sc.nextDouble();
		
		double gt = subtotal*(gratuity/100);
		
		System.out.printf("%s%.2f%s%.2f","The gratuity is $",gt," and the total is $", subtotal+gt );
		
		sc.close();
	}

}
