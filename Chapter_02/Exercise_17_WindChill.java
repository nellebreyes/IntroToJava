import java.util.Scanner;

public class Exercise_17_WindChill {

	public static void main(String[] args) {
		/*
		 * (Science: wind-chill temperature) How cold is it outside?
		 * 
		 * Created by Marinelle Reyes on May/02/2019
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit between -58 °F and 41 °F: ");
		double ta = sc.nextDouble();

		System.out.println("Enter the wind speed (>=2) in miles per hour: ");
		double v = sc.nextDouble();

		double twc = 35.74 + (0.6215 * ta) - (35.75 * (Math.pow(v, 0.16))) + (0.4275 * ta * (Math.pow(v, 0.16)));

		System.out.printf("%s%.5f", "The wind chill index is ", twc);
		sc.close();
	}

}
