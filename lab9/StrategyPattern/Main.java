package strategypattern_basic;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		System.out.println("Adding all numbers");
		Context c = new Context(new AddAll());
		System.out.println(c.add(numbers));
		
		System.out.println("Adding all even numbers");
		c = new Context(new AddEven());
		System.out.println(c.add(numbers));
		
		System.out.println("Adding all odd numbers");
		c = new Context(new AddOdd());
		System.out.println(c.add(numbers));
		
		
	}

}
