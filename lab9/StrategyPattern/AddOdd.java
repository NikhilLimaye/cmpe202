package strategypattern_basic;

import java.util.*;

public class AddOdd implements Strategy {

	public int totalValues(List<Integer> numbers) {
		
		int result = 0; 
		
		for(int x : numbers)
			if(x%2 != 0)
			 result += x;
		
		return result;
	}

}