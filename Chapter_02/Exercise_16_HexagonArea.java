import java.util.Scanner;

public class Exercise_16_HexagonArea {

	public static void main(String[] args) {
		/*
		 * (Geometry: area of a hexagon)
		 * 
		 * Created by Marinelle Reyes on 05/02/2019
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side");
		double s = sc.nextDouble();
		double area = (3*(Math.pow(3, 0.5))/2)*(Math.pow(s, 2));
		
		System.out.println("The area of the hexagon is " + area);
		sc.close();
	}

}
