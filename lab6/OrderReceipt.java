package strategypattern;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class OrderReceipt implements PrintingStrategy {

	@Override
	public void print() {
		System.out.println("\n\n  RECEIPT  ");
		System.out.println(LocalDate.now()+"  "+LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"))+"\n");
		System.out.println("FIVE GUYS");
		System.out.println("BURGER FRIES");
		System.out.println("STORE # CA-1294");
		System.out.println("5353 ALMADEN EXP N60");
		System.out.println("SAN JOSE, CA 95118");
		System.out.println("(P) 408-264-9300");
		
		System.out.println("FIVE GUYS\n\nOrder number : 45");
		
		ArrayList<Order> all = Order.getAllOrders();
		double total = 0;
		for(Order o : all)
		{		
			System.out.println(o.getComplexOrder());
			ArrayList<String> orderRequests = o.getOrderRequests();
			total = total + o.getPrice();
			for(int i = 0 ; i < orderRequests.size() ; i++)
			{
				String currentItem = orderRequests.get(i);
				
				switch(currentItem)
				{
				
				case "BottomBunToppings" : 
					ArrayList<String> bottomBunToppings = o.getBottomBunToppings();
					for(String temp : bottomBunToppings)
					{
						System.out.println("      -> | "+temp);
					}
					break;
					
				case "TopBunToppings" : 
					ArrayList<String> topBunToppings = o.getTopBunToppings();
					for(String temp : topBunToppings)
					{
						System.out.println("      "+temp);
					}
					break;
					
				case "Meat" : 
					System.out.println("      {{{{ "+o.getMeat()+" }}}}");
					break;				
				
				}				
			}
			
			
		}
		total = total + 0.09*total;
		System.out.println("Total:\t\t\t"+String.format("%.2f", total));
	
	}

}
