

public class Main {

    public static void main(String[] args) {
        
        System.out.println("\n**************Testing for Gumball Machine Type 1**************\n");
        GumballMachine gumballMachine = new GumballMachine(1,1);
  
        gumballMachine.insertCoin( 25 ); 
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank(); //Successfully ejected with change returned
        
        gumballMachine.insertCoin(10); //Invalid Coin Type
        
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank(); // Insufficient gumballs
        
        gumballMachine.addGumballs(5); 
        gumballMachine.turnCrank(); //Successfully ejected
        
        System.out.println("\n**************Testing for Gumball Machine Type 2**************\n");
        
        GumballMachine gumballMachine2 = new GumballMachine(2,2);
  
        gumballMachine2.insertCoin( 25 );        
        gumballMachine2.turnCrank(); //Insufficient money inserted
        
        gumballMachine2.insertCoin( 25 );
        gumballMachine2.turnCrank(); // Successfully ejected
        
        gumballMachine2.insertCoin(5); // Invalid coin type
        
        

        System.out.println("\n**************Testing for Gumball Machine Type 3**************\n");
        GumballMachine gumballMachine3 = new GumballMachine(5,3);
        gumballMachine3.insertCoin( 10 );
        gumballMachine3.insertCoin( 5 );
        gumballMachine3.insertCoin( 25 );
        gumballMachine3.insertCoin( 10 );
        gumballMachine3.turnCrank();  //Successfully ejected
        
        System.out.println();
        
        gumballMachine3.insertCoin(10);
        gumballMachine3.insertCoin( 25 );
        gumballMachine3.turnCrank();  //Falling short of 15 cents

        gumballMachine3.insertCoin( 25 );
        gumballMachine3.turnCrank(); //Successfully ejected with change returned 10 cents
        

    }
}
