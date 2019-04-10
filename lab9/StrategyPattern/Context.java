package strategypattern_basic;

import java.util.*;

public class Context {

	private Strategy addStrategy; 
	
	public Context(Strategy s)
	{
		addStrategy = s;
	}
	
	public int add(List<Integer> numbers)
	{
		return addStrategy.totalValues(numbers);		
	}
	 
	
}
