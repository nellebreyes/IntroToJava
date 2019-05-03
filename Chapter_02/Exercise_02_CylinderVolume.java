import java.util.Scanner;

public class Exercise_02_CylinderVolume {

	public static void main(String[] args) {
		/*
		 * (Compute the volume of a cylinder)
		 * 
		 * Created by Marinelle Reyes on 05/02/2019
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the radius and length of a cylinder : ");
		double radius = sc.nextDouble();
		double length = sc.nextDouble();
		double pi = 3.1416;
		double area = radius * radius * pi;
		double volume = area * length;
		System.out.println("The area is: " + area);
		System.out.println("The area is: " + volume);
		sc.close();
	}

}
