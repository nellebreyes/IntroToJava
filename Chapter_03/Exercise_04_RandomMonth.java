
public class Exercise_04_RandomMonth {

	public static void main(String[] args) {
		/*
		 * (Random month) Write a program that randomly generates an integer
		 * between 1 and 12 and displays the English month name January,
		 * February, …, December for the number 1, 2, …, 12, accordingly.
		 * 
		 * Created by Marinelle Reyes on 05/02/2019
		 */
		
		double randomMonth = Math.random() * 12 +1;
		int monthInt = (int)randomMonth;
		
		System.out.println(monthInt);
		
		switch(monthInt){
		
		case 1:
			System.out.println("Random number is "+monthInt+ " , which is equivalent to January");
			break;
			
		case 2:
			System.out.println("Random number is "+monthInt+ " , which is equivalent to February");
			break;
			
		case 3:
			System.out.println("Random number is "+monthInt+ " , which is equivalent to March");
			break;
			
		case 4:
			System.out.println("Random number is "+monthInt+ " , which is equivalent to April");
			break;
			
		case 5:
			System.out.println("Random number is "+monthInt+ " , which is equivalent to May");
			break;
			
		case 6:
			System.out.println("Random number is "+monthInt+ " , which is equivalent to June");
			break;
			
		case 7:
			System.out.println("Random number is "+monthInt+ " , which is equivalent to July");
			break;
			
		case 8:
			System.out.println("Random number is "+monthInt+ " , which is equivalent to August");
			break;
			
		case 9:
			System.out.println("Random number is "+monthInt+ " , which is equivalent to September");
			break;
			
		case 10:
			System.out.println("Random number is "+monthInt+ " , which is equivalent to October");
			break;
			
		case 11:
			System.out.println("Random number is "+monthInt+ " , which is equivalent to November");
			break;
			
		case 12:
			System.out.println("Random number is "+monthInt+ " , which is equivalent to December");
			break;		
			
		}

	}

}
