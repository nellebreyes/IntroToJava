
public class Exercise_18_CastFloatingTable {

	public static void main(String[] args) {
		/*
		 * (Print a table) Write a program that displays the following table.
		 * Cast floating-point numbers into integers.
		 * 
		 * Created by Marinelle Reyes on 05/02/2019
		 */

		System.out.println("a\tb\tpow(a,b)");
		for (int i = 1, x = 2; i <= 5; i++) {
			System.out.println(i + "\t" + x + "\t" + (int) (Math.pow(i, x)));
			x++;
		}

	}

}
