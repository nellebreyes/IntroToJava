import java.util.Scanner;

public class Exercise_06_ComputeAndInterpretBMI {

	public static void main(String[] args) {
		/*
		 * (Health application: BMI) Revise Listing 3.4,
		 * ComputeAndInterpretBMI.java, to let the user enter weight, feet, and
		 * inches. For example, if a person is 5 feet and 10 inches, you will
		 * enter 5 for feet and 10 for inches.
		 * 
		 * Created by Marinelle Reyes on 05/02/2019
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds");
		double lbs = sc.nextDouble();
		System.out.println("Enter feet");
		double feet = sc.nextDouble();
		System.out.println("Enter inches");
		double inches = sc.nextDouble();
		 double height = (feet * 12) + inches;

	        final double kgPerlb = 0.45359237; 
	        final double metersPerInch = 0.0254; 

	       
	        double weightInKg = lbs * kgPerlb;
	        double heightInM = height * metersPerInch;
	        double BMI = weightInKg /(heightInM * heightInM);

	        System.out.printf("%s%.2f","BMI is ",BMI);
	        System.out.println();
	        if (BMI < 18.5) {
	            System.out.println("Underweight");
	        } else if (BMI < 25) {
	            System.out.println("Normal");
	        } else if (BMI < 30) {
	            System.out.println("Overweight");
	        } else {
	            System.out.println("Obese");
	        }
	        sc.close();
	}

}
