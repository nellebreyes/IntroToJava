import java.util.Scanner;

public class Exercise_19_TriangleArea {

	public static void main(String[] args) {
		/*
		 * (Geometry: area of a triangle) Write a program that prompts the user
		 * to enter three points (x1, y1), (x2, y2), (x3, y3) of a triangle and
		 * displays its area.
		 * 
		 * Created by Marinelle Reyes on 05/02/2019
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three points for a triangle: ");
			
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		
		double d1 = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
		double d2 = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
		double d3 = (x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2);
		double side1 = Math.pow(d1, 0.5);
        double side2 = Math.pow(d2, 0.5);
        double side3 = Math.pow(d3, 0.5);
		
		double s = (side1 + side2 + side3)/2.0;
		double a=s*(s-side1)*(s-side2)*(s-side3);
		
		double area = Math.pow(a, 0.5);
		
		System.out.println("The area of the triangle is "+ area);
		sc.close();
	}

}
