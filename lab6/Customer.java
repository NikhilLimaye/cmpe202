package strategypattern;

import java.time.*;

public class Customer {

	public static void main(String[] args) {
		
		Order o1 = new Order("LBB" , LocalDate.now() , LocalTime.now() , 5.59 , 1);		
		o1.setMeat("Bacon");
		o1.setbottomBunToppings("G Onion" , "JALA Grilled");
		o1.settopBunToppings("Tomato","Lettuce","Mayo");		
		Order o2 = new Order("LTL CAJ" , LocalDate.now() , LocalTime.now() , 2.79 , 1);	
		
	
		Order.setStrategy(new OrderReceipt());
		Order.print();
		System.out.println("\n-------------------------------------------------\n");
		Order.setStrategy(new PackingSlip());
		Order.print();
	}
}
