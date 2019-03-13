package strategypattern;
import java.util.ArrayList;


public class Order {
	
	String orderMain;
	OrderItems items;
	double price;
	static PrintingStrategy ps;
	ArrayList<String> orderRequests;
	int quantity;
	static ArrayList<Order> orders_all = new ArrayList<Order>();
	
	public Order(String order, double price, int quantity )
	{		
		this.quantity = quantity;
		orderMain = order;
		this.price = price;
		items = new OrderItems();
		orderRequests = new ArrayList<String>();	
		orders_all.add(this);
	}
	
	public static ArrayList<Order> getAllOrders()
	{
		return orders_all;
	}
	
	public void addOrder(Order o)
	{
		orders_all.add(this);
	}
	
	
	public String getComplexOrder()
	{
		return quantity+"   "+orderMain+"\t\t\t"+price;
	}
	
	public String getBasicOrder()
	{
		return quantity+"   "+orderMain;
	}
	
	public double getPrice()
	{
		return price;
	}

	//setMeat	
	public void setMeat(String meat)
	{
		orderRequests.add("Meat");
		items.setMeat(meat);		
	}
	
	/**set top bun toppings */
	public void settopBunToppings(String ...topBun)
	{
		orderRequests.add("TopBunToppings");
		items.settopBunToppings(topBun);		
	}
		
	/** set bottom bun toppings */
	public void setbottomBunToppings(String ...bottomBun)
	{
		orderRequests.add("BottomBunToppings");
		items.setbottomBunToppings(bottomBun);			
	}
	
	public ArrayList<String> getBottomBunToppings()
	{
		return items.getBottomBunToppings();
	}
	
	public ArrayList<String> getTopBunToppings()
	{
		return items.getTopBunToppings();
	}
		
	public static void setStrategy(PrintingStrategy p)
	{
		ps = p;
	}
	
	public ArrayList<String> getOrderRequests()
	{
		return orderRequests;
	}
	
	public String getMeat()
	{
		return items.getMeat();
	}

	public static void print()
	{
		ps.print();
	}
}
