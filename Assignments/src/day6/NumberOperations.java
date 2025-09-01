package day6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NumberOperations {
    public static List<Integer> operateOnNumbers(Predicate<Integer> method, List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            if (method.test(number))
                result.add(number);
        }
        return result;
    }

    public static boolean isPrime(int n) {
        if (n == 0 || n == 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Predicate<Integer> isPositive = (n) -> n > 0;
        //System.out.println(isPositive.test(3));
        //System.out.println(isPositive.test(-3));

//        Predicate<Integer> isPrime = (n) -> {
//            if (n == 0 || n == 1)
//                return false;
//            for (int i = 2; i <= n / 2; i++) {
//                if (n % i == 0)
//                    return false;
//            }
//            return true;
//        };

        Predicate<Integer> isPrime = NumberOperations::isPrime;

//        System.out.println(isPrime.test(8));

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evens = operateOnNumbers(n -> n % 2 == 0, numbers);
        System.out.println(evens);

        List<Integer> divBys = operateOnNumbers((n) -> (n % 2 == 0 || n % 3 == 0 || n % 5 == 0), numbers);
        System.out.println(divBys);

    }
}
