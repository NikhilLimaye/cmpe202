

public class Main {

	public static void main(String[] args) {
		

		//System.out.println(gumballMachine);
		
		System.out.println("\n****Testing for gumball machine type 1****");
		GumballMachine gumballMachine = new GumballMachine(5,1);
		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();
		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();
		gumballMachine.insertCoin(4);
		

		System.out.println("\n****Testing for gumball machine type 2****");
		GumballMachine gumballMachine2 = new GumballMachine(5,2);
		gumballMachine2.insertCoin(10);
		gumballMachine2.insertCoin(25);
		gumballMachine2.turnCrank();
		gumballMachine2.insertCoin(25);
		gumballMachine2.turnCrank();

		
		System.out.println("\n****Testing for gumball machine type 3****");
		GumballMachine gumballMachine3 = new GumballMachine(5,3);
		gumballMachine3.insertCoin(10);
		gumballMachine3.insertCoin(25);
		gumballMachine3.turnCrank();
		gumballMachine3.insertCoin(25);
		gumballMachine3.turnCrank();
		//System.out.println(gumballMachine);
	}
}
