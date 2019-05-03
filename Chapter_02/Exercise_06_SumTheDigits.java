import java.util.Scanner;

public class Exercise_06_SumTheDigits {

	public static void main(String[] args) {
		/*
		 * Sum the digits in an integer) Write a program that reads an integer
		 * between 0 and 1000 and adds all the digits in the integer. For
		 * example, if an integer is 932, the sum of all its digits is 14. Hint:
		 * Use the % operator to extract digits, and use the / operator to
		 * remove the extracted digit. For instance, 932 % 10 = 2 and 932 / 10 =
		 * 93.
		 * 
		 * Created by Marinelle Reyes on 05/02/2019
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = sc.nextInt();
		
		
		if(input<1000 && input>0){
			
			int firstdigit = input%10;
			int remaining = input/10;
			int seconddigit = remaining%10;
			 remaining = remaining/10;
			int thirddigit = remaining%10;
			
			int sum = firstdigit+seconddigit+thirddigit;
			
			System.out.printf("%s%d","The sum of the digits are: ",sum);
			
		}else{
			System.out.println("Invalid input, number must be between 0 to 1000");
		}
		
		sc.close();

	}

}
