package day1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
	System.out.print("Number: ");
	int number = scanner.nextInt();
	
        boolean isPrime = true;
        
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                isPrime = false;
        }
        
        if (isPrime && number > 1)
            System.out.println(number + " is a prime number.");
        else
	    System.out.println(number + " is not a prime number.");
    }
}
