import java.util.Scanner;

public class Exercise_14_BMI {

	public static void main(String[] args) {
		/*
		 * (Health application: computing BMI)
		 * 
		 * Created by Marinelle Reyes on May/02/2019
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight in pounds: ");
		double wtPnds = sc.nextDouble();
		System.out.println("Enter height in inches: ");
		double htInch = sc.nextDouble();
		// 1lb = 0.45359237kg 1inch=0.0254meters
		double wkg = wtPnds*0.45359237;
		double htMeters = htInch*0.0254;
		
		double BMI = wkg/(htMeters*htMeters);
		
		System.out.println("BMI is: " + BMI);
		sc.close();
	}

}
