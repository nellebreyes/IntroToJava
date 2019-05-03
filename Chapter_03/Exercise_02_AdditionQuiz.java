import java.util.Scanner;

public class Exercise_02_AdditionQuiz {

	public static void main(String[] args) {
		/*
		 * (Game: add three numbers) The program in Listing 3.1,
		 * AdditionQuiz.java, generates two integers and prompts the user to
		 * enter the sum of these two integers. Revise the program to generate
		 * three single-digit integers and prompt the user to enter the sum of
		 * these three integers.
		 * 
		 * Created by Marinelle Reyes on 05/02/2019
		 */

		double randomDblA = Math.random() * 9 + 1;
		int randomA = (int)randomDblA;
		double randomDblB = Math.random() * 9 + 1;
		int randomB = (int)randomDblB;
		double randomDblC = Math.random() * 9 + 1;
		int randomC = (int)randomDblC;
		Scanner sc = new Scanner(System.in);
		System.out.println(randomA +" + "+ randomB +" + " + randomC + " = ");
		int ans = sc.nextInt();
		
		if(randomA+randomB+randomC == ans){
			System.out.println("Your answer " + ans +" is correct.");
		}else{
			System.out.println("Incorrect answer");
		}
		
		sc.close();
	}

}
