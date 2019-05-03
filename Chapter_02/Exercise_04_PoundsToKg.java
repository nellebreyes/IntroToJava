import java.util.Scanner;

public class Exercise_04_PoundsToKg {

	public static void main(String[] args) {
		
		/*
		 * (Convert pounds into kilograms) Write a program that converts pounds
		 * into kilograms. The program prompts the user to enter a number in
		 * pounds, converts it to kilograms, and displays the result. One pound
		 * is 0.454 kilograms.
		 * 
		 * Created by Marinelle Reyes on 05/02/2019
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number in pounds: ");
		double pounds = sc.nextDouble();
		
		double kg = pounds*0.454;
		
		System.out.printf("%.2f%s%.2f%s",pounds," pounds is ", kg ," kilograms");
		
		sc.close();

	}

}
