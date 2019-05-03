import java.util.Scanner;

public class Exercise_23_DrivingDistance {

	public static void main(String[] args) {
		/*
		 * (Cost of driving) Write a program that prompts the user to enter the
		 * distance to drive, the fuel efficiency of the car in miles per
		 * gallon, and the price per gallon, and displays the cost of the trip.
		 * 
		 * Created by Marinelle Reyes on 05/02/2019
		 */
		
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the driving distance");
		double drivingDistance = sc.nextDouble();
		System.out.println("Enter miles per gallon");
		double milesPerGallon = sc.nextDouble();
		System.out.println("Enter price per gallon");
		double pricePerGallon = sc.nextDouble();
		
		double price = drivingDistance*(1/milesPerGallon)*pricePerGallon;
		
		System.out.printf("%s%.2f","The cost of driving is $", price);
		
		sc.close();
	}

}
