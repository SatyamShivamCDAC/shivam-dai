package day1;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Number: ");
		int number = scanner.nextInt();
		
		int result = 1;
		for (int i = 2; i <= number; i++)
			result *= i;
			
		System.out.println("day1.Factorial of " + number + " is " + result + ".");
		
	}
}
