import java.util.Scanner;

public class Exercise_08_SortIntegersAscending {

	public static void main(String[] args) {
		/*
		 * (Sort three integers) Write a program that prompts the user to enter
		 * three integers and display the integers in non-decreasing order.
		 * 
		 * Created by Marinelle Reyes on 05/02/2019
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 3 different integers: ");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = 0;
		int y = 0;
		int z = 0;

		if (a < b && a < c) {
			x = a;
		} else if (b < a && b < c) {
			x = b;
		} else if (c < a && c < b) {
			x = c;
		}

		if (a < b && a > c) {
			y = a;
		} else if (b < a && b > c) {
			y = b;
		} else if (c < a && c > b) {
			y = c;
		} else if (b < c && b > a) {
			y = b;
		} else if (c < b && c > a) {
			y = c;
		} else if (a < c && a > b) {
			y = a;
		}

		if (a > b && a > c) {
			z = a;
		} else if (b > a && b > c) {
			z = b;
		} else if (c > a && c > b) {
			z = c;
		}

		System.out.println("The numbers are: " + x + "," + y + "," + z);
		sc.close();
	}

}
