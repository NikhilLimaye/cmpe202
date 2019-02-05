
public class GumballMachine
{

    private int num_gumballs;
    //private boolean has_quarter;
    private int value_inserted;
    private int gumball_cost;
    private int machine_type;

    public GumballMachine( int size, int type )
    {
        // initialise instance variables
        this.num_gumballs = size;
        //this.has_quarter = false;
        this.value_inserted = 0;
        switch(type)
        {
            case 1: gumball_cost = 25; machine_type = 1; break;
            case 2: gumball_cost = 50; machine_type = 2; break;
            case 3: gumball_cost = 50; machine_type = 3; break;
            default : System.out.println("Please enter a valid machine type (1,2 or 3)");
        }

    }

    public void addGumballs(int size)
    {
        if(size>0)
        {
            this.num_gumballs +=size;
            System.out.println("Added "+size+" gumballs. Now the size is = "+this.num_gumballs);
        }
        else
        {
            System.out.println("Please enter a positive number");
        }
    }
    
    public void insertCoin(int coin)
    {
        if ( machine_type == 3 && (isQuarter(coin) || isNickel(coin) || isDime(coin) ) )
        {
            this.value_inserted+=coin;
        }
        else if(machine_type == 1 && isQuarter(coin) )
        {
            this.value_inserted+=coin;
        }
        else if(machine_type == 2 && isQuarter(coin) )
        {
            this.value_inserted+=coin;
        }
        else 
            System.out.println("Coin of value "+coin+" is invalid for machine type "+machine_type);         
    }

    private boolean isQuarter(int coin)
    {
        return coin == 25;   
    }

    private boolean isNickel(int coin)
    {
        return coin == 5;   
    }

    private boolean isDime(int coin)
    {
        return coin == 10;   
    }

    public void turnCrank()
    {
        if(this.num_gumballs > 0 && this.value_inserted >= gumball_cost)
        {
            //System.out.println("For Gumball Machine Type "+machine_type);
            System.out.println("Value inserted "+value_inserted);
            this.num_gumballs--;
            this.value_inserted = this.value_inserted - this.gumball_cost;
            //System.out.println("Value remaining "+value_inserted);
            System.out.println(this.gumball_cost+" cents received. Gumball ejected");
            if(this.value_inserted > 0)
            {
                System.out.println("Ejecting change - "+this.value_inserted+" cents");
                this.value_inserted = 0;
                System.out.println(this.num_gumballs+" gumballs remaining");
            }  
        }
       
        else if (this.num_gumballs == 0)
            System.out.println("No gumballs remaining. Be right back");
        else if (this.value_inserted < gumball_cost)
            System.out.println("Falling short. Please insert "+(gumball_cost - value_inserted)+" cents more");
     
    }
}
