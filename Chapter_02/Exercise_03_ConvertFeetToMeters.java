import java.util.Scanner;

public class Exercise_03_ConvertFeetToMeters {

	public static void main(String[] args) {
		/*
		 * (Convert feet into meters) Write a program that reads a number in
		 * feet, converts it to meters, and displays the result. One foot is
		 * 0.305 meter.
		 * 
		 * Created by Marinelle Reyes on 05/02/2019
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value for feet :");
		double feet = sc.nextDouble();
		//1 foot = 0.305meter
		double meter = 0.305*feet;
		
		System.out.printf("%.2f%s%.2f%s",feet," feet is ", meter, " meters ");
		sc.close();
	}

}
