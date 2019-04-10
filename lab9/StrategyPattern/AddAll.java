package strategypattern_basic;

import java.util.*;

public class AddAll implements Strategy {

	public int totalValues(List<Integer> numbers) {
		
		int result = 0; 
		
		for(int x : numbers)
			result += x;
		
		return result;
	}

}
