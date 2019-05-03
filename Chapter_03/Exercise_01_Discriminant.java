import java.util.Scanner;

public class Exercise_01_Discriminant {

	public static void main(String[] args) {
		/* 
		 * (Algebra: solve quadratic equations)
		 * Created by Marinelle Reyes on 05/02/2019
		 */

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a, b, c: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double n = Math.pow(b, 2) - (4*a*c);
		double disc = Math.pow(n, 0.5);
		double r1 = (-1*b + disc)/(2*a);
		double r2 = (-1*b - disc)/(2*a);
		
		if(disc > 0){
			System.out.println("The equation has two roots " + r1 + " and " +r2);
		}else if(disc == 0){
			System.out.println("The equation has 1 root "+ r1);
		}else{
			System.out.println("The ewuation has no real roots");
		}
		sc.close();
	}

}
