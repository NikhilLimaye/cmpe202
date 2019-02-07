

public class InsufficientMoneyState implements State {
    GumballMachine gumballMachine;
 
    public InsufficientMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertCoin(int value) {
		//System.out.println("You inserted a quarter");
		//gumballMachine.setState(gumballMachine.getHasQuarterState());

		//Check coin validity
		System.out.println("Inserting coin");
		if(gumballMachine.checkCoinValidity(value) == true)
		{
			System.out.println("You inserted "+value+" cents");
			//this.moneyInserted += value;
			gumballMachine.updateMoneyInserted(value);

			if( gumballMachine.getMoneyInserted() >= gumballMachine.getGumballCost() )			
				gumballMachine.setState(gumballMachine.getSufficientMoneyState());	
		}
		else
			System.out.println("Invalid Coin type");
	}
 
	public void ejectCoin() {
		//System.out.println("You haven't inserted a quarter");
		if(gumballMachine.getMoneyInserted() > 0)
		{
			System.out.println("Ejecting "+gumballMachine.getMoneyInserted()+" cents");
			gumballMachine.setMoneyInserted(0);
		}
	}
 
	public void turnCrank() {
		System.out.println("Please insert "+( gumballMachine.getGumballCost() - gumballMachine.getMoneyInserted() )+" cents more.");
	 }
 
	public void dispense() {
		System.out.println("You need to pay the full amount");
	} 
 
	public String toString() {
		return "waiting for the full amount";
	}
}
