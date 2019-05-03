import java.util.Scanner;

public class Exercise_03_CramersRule {

	public static void main(String[] args) {
		/*
		 * (Algebra: solve 2 * 2 linear equations) A linear equation can be
		 * solved using Cramer’s rule given in Programming Exercise 1.13. Write
		 * a program that prompts the user to enter a, b, c, d, e, and f and
		 * displays the result. If ad - bc is 0, report that “The equation has
		 * no solution.”
		 * 
		 * Created by Marinelle Reyes on 05/02/2019
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a,b,c,d,e,f: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double f = sc.nextDouble();
		
		double den = (a*d - b*c);
		double x = (e*d - b*f)/den;
		double y = (a*f - e*c)/den;
		
		if(den == 0 ){
			System.out.println("The equation has no solution.");
		}else{
			System.out.println("x is " + x + " and y is "+y);
		}
		
		sc.close();
		
	}

}
