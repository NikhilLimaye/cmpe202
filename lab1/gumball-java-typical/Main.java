

public class Main {

    public static void main(String[] args) {
        
        //Testing for Gumball Machine of type 1
        /*
        GumballMachine gumballMachine = new GumballMachine(1,1);
  
        gumballMachine.insertCoin( 25 ); 
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank(); //Successfully ejected with change returned
        
        gumballMachine.insertCoin(10); //Invalid Coin Type
        
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank(); // Insufficient gumballs
        
        gumballMachine.addGumballs(5);
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank();
        */

        //Testing for Gumball Machine Type 2
        GumballMachine gumballMachine = new GumballMachine(5,3);
        gumballMachine.insertCoin( 10 );
        gumballMachine.insertCoin( 5 );
        gumballMachine.insertCoin( 25 );
        gumballMachine.insertCoin( 10 );
        gumballMachine.turnCrank();
        
        System.out.println();
        
        gumballMachine.insertCoin(10);
        gumballMachine.insertCoin( 25 );
        gumballMachine.insertCoin( 25 );
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank();
    }
}
