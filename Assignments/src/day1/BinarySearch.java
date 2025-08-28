package day1;

public class BinarySearch {
	public static void main(String[] args) {
	
		int[] numbers = {1, 2, 3, 4, 5, 6, 7};
		int number = 0;
		
		int left = 0;
		int right = (numbers.length - 1);
		int mid = (left + right) / 2;
		boolean isFound = false;
		
		while (left <= right) {

			if (number == numbers[mid]) {
				isFound = true;
				break;
			}
			
			else if (number < numbers[mid]) {
				right = mid - 1;
				mid = (left + right) / 2;
			}
			
			else if (number > numbers[mid]) {
				left = mid + 1;
				mid = (left + right) / 2;
			}
		}
		
		if (isFound)
			System.out.println(number + " is found.");
		else
			System.out.println(number + " is not found.");
		
	}
}
