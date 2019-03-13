package strategypattern;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class PackingSlip implements PrintingStrategy {

	@Override
	public void print() {
		System.out.println("FIVE GUYS\n\nOrder number : 45");
		System.out.println("\n   PACKING SLIP  ");
		System.out.println(LocalDate.now()+"  "+LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"))+"\n");

		ArrayList<Order> all = Order.getAllOrders();
		
		for(Order o : all)
		{		
			System.out.println(o.getBasicOrder());
			
			ArrayList<String> topBunToppings = o.getTopBunToppings();
			for(String temp : topBunToppings)
			{
				System.out.println("      "+temp);
			}

		
			ArrayList<String> bottomBunToppings = o.getBottomBunToppings();
			for(String temp : bottomBunToppings)
			{
				System.out.println("      -> | "+temp);
			}

			if(o.getMeat()!=null)
				System.out.println("      {{{{ "+o.getMeat()+" }}}}");		
				
		}	
		

		
		
	}
}
