import java.util.Scanner;

public class Exercise_07_FindTheNumberOfYears {

	public static void main(String[] args) {
		/*
		 * (Find the number of years) Write a program that prompts the user to
		 * enter the minutes (e.g., 1 billion), and displays the number of years
		 * and days for the minutes. For simplicity, assume a year has 365 days.
		 * 
		 * Created by Marinelle Reyes 05/02/2019
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of minutes");
		int mins = sc.nextInt();

		int year = (int)(mins * (1.0 / 60) * (1.0 / 24)*(1.0/365));
		
		int day = (int)(mins/60/24)%365;

		System.out.printf(year + " years and " + day + " days");
		sc.close();
	}

}
