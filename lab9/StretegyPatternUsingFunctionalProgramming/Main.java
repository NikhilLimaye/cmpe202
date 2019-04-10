package strategypattern_lambda;

import java.util.*;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		System.out.println("Adding all numbers");
		System.out.println(totalValues(numbers , e -> true));
		
		System.out.println("Adding all even numbers");
		System.out.println(totalValues(numbers , e -> e%2==0));
		
		System.out.println("Adding all odd numbers");
		System.out.println(totalValues(numbers , e -> e%2!=0));
	
	}

	private static int totalValues(List<Integer> numbers , Predicate<Integer> selector) {
	
		return numbers.stream().filter(selector).reduce(0, Integer :: sum);
		
	}
	
}
