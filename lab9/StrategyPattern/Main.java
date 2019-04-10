package strategypattern_basic;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		Strategy s = new AddAll();
		System.out.println(s.totalValues(numbers));
		
		s = new AddEven();
		System.out.println(s.totalValues(numbers));
		
		s = new AddOdd();
		System.out.println(s.totalValues(numbers));
	}

}
