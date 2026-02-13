package Avg_With;
import java.util.Scanner;


public class Calc {

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your weekly income: ");
		double userIncome = input.nextDouble();
		double taxWith = 0.0;
		
		if (userIncome < 500) {
			taxWith = userIncome * 0.10;
		}
		else if (userIncome >= 500 && userIncome < 1500) {
			taxWith = userIncome * 0.15;
		}

		else if (userIncome >= 1500 && userIncome < 2500) {
			taxWith = userIncome * 0.20;

		}
		else if (userIncome >= 2500) {
			taxWith = userIncome * 0.30;
		}
		System.out.printf("Weekly Income: $%.2f\n " , + userIncome );
		System.out.printf("Tax witholding: $%.2f\n ",  + taxWith );
	}

}