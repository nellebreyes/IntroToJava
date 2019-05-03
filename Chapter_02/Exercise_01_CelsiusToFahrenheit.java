import java.util.Scanner;

public class Exercise_01_CelsiusToFahrenheit {

	public static void main(String[] args) {
		/*
		 * (Convert Celsius to Fahrenheit) Write a program that reads a Celsius
		 * degree in a double value from the console, then converts it to
		 * Fahrenheit and displays the result.
		 * 
		 * Created by Marinelle Reyes on 05/02/2019
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the degree in Celsius: ");
		double celcius = sc.nextDouble();

		double fahrenheit = (9.0 / 5) * celcius + 32;

		System.out.printf("%.2f%s%.2f%s", celcius, " Celsius is ", fahrenheit, " Fahrenheit");
		sc.close();
	}

}
