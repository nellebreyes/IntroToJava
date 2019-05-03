import java.util.Scanner;

public class Exercise_15_Distance {

	public static void main(String[] args) {
		/*
		 * (Geometry: distance of two points)
		 * Created by Marinelle Reyes on 05/02/2019
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x1 and y1:");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		System.out.println("Enter x2 and y2:");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double b=x2-x1;
		double c=y2-y1;
		double a = Math.pow(b, 2)+Math.pow(c,2);
		double distance = Math.pow(a, 0.5);
		
		System.out.println("The distance between the two poinsts is "+distance);
		sc.close();
	}

}
