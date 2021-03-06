/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum extends Decorator implements IDisplayComponent, IKeyEventHandler
{
	private IKeyEventHandler nextHandler ;
	private String number = "" ;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( number.equals("") )
			return "[4444 4444 4444 4444]" + "  " ;
		else
			return number;
	}	

	public void key(String ch, int cnt) {
		
		if(ch.equals("X") || ch.equals("x"))
		{
			number = number.trim();
			if(number.length() > 1)
				number = number.substring(0, number.length()-1);
			else
				number = "";
		}		
		else if ( cnt <= 16 )
		{
			number += ch ;
			if(cnt == 16)
				number+=addDoubleSpace();
			else if(cnt % 4 == 0)
				number += addSeparator();
		}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}