import java.util.Scanner;

public class Exercise_05_FutureDates {

	public static void main(String[] args) {
		/*
		 * (Find future dates) Write a program that prompts the user to enter an
		 * integer for today’s day of the week (Sunday is 0, Monday is 1, …, and
		 * Saturday is 6). Also prompt the user to enter the number of days
		 * after today for a future day and display the future day of the week.
		 * 
		 * Created by Marinelle Reyes on 05/02/2019
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter today's day:");
		int day = sc.nextInt();
		System.out.println("Enter the number of days elapsed since today: ");
		int elapsed = sc.nextInt();

		String today = dateToday(day);
		String futureDay = dateToday((day + elapsed) % 7);

		System.out.println("Today is " + today + " and the future day is " + futureDay);
		sc.close();
	}

	public static String dateToday(int input) {

		String today;

		switch (input) {

		case 0:
			today = "Sunday";
			break;

		case 1:
			today = "Monday";
			break;

		case 2:
			today = "Tuesday";
			break;

		case 3:
			today = "Wednesday";
			break;

		case 4:
			today = "Thursday";
			break;

		case 5:
			today = "Friday";
			break;

		case 6:
			today = "Saturday";
			break;

		case 7:
			today = "Sunday";
			break;

		default:
			today = "Invalid day";
		}

		return today;

	}

}
