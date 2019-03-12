package strategypattern;

import java.util.ArrayList;

public class OrderItems {
	
	String meat;
	ArrayList<String> topBunToppings;
	ArrayList<String> bottomBunToppings;
	
	public OrderItems()
	{
		topBunToppings = new ArrayList<String>();
		bottomBunToppings =  new ArrayList<String>();		
	}
	
	public void settopBunToppings(String ...topBunToppings)
	{
		for(String x : topBunToppings)
		{
			this.topBunToppings.add(x);
		}		
	}
	
	public ArrayList<String> getTopBunToppings()
	{
		return topBunToppings;
	}
	
	/** set bottom bun toppings */
	public void setbottomBunToppings(String ...bottomBunToppings)
	{
		for(String x : bottomBunToppings)
		{
			this.bottomBunToppings.add(x);
		}		
	}
	
	public ArrayList<String> getBottomBunToppings()
	{
		return bottomBunToppings;
	}
	
	public void setMeat(String meat)
	{
		this.meat = meat;
	}
	
	public String getMeat()
	{

		return this.meat;
	}

}
