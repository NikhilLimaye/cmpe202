/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp extends Decorator implements  IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String date = "" ;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( date.equals("") )
			return "[MM/YY]" + "  " ;
		else
			return date;
	}	

	public void key(String ch, int cnt) {
		if ( cnt >= 17 && cnt <= 20  )
		{
			if(ch.equals("X") || ch.equals("x"))
			{
				if(cnt == 19)
					date = date.substring(0, date.length()-2);
				else
					date = date.substring(0, date.length()-1);
			}
			else
			{
				date += ch ;
				if(cnt == 18)
					date += addSeparator();		
				else if(cnt == 20)
					date+=addDoubleSpace();
			}				
		}
			
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}
	
	@Override
	public String addSeparator()
	{
		return "/";
	}

}