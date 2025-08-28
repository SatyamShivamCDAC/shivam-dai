package day1;

public class BubbleSort {
	public static void main(String[] args) {
	
		int[] numbers = {5, 4, 3, 2, 1};
		
		System.out.println("Given Array:");
		for (int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i]);
		
		for (int i = (numbers.length - 1); i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}	
		
		System.out.println("Sorted Array:");
		for (int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i]);
	}
}
