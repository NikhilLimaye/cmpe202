Design Pattern used - Chain of Responsibility Design and Singleton patterns

Lab4 : CRC Cards

Class <i>Client</i>  
Responsibilities:   
	Sign up for a table   
	Accept or deny when table is ready  
	Maintain client details - name, phone, party size  

Collaborators:   
	WaitListMananger 

Class <i>WaitlistManager</i>  
Responsibilities:   
	Maintain single instance of WaitlistManager  
	Add a Client to the back of the waiting list  
	Remove particular client from the waiting list  
	Provide size of next available table  

Collaborators: 
	AssignCurrent
	FindAndAssign
	Client


Class <i>AssignCurrent</i>  
Responsibilities:  
	Assign table to client at the top of the waitlist  
	Call next handler in the chain  

Collaborators:     
	WaitlistManager  
	Client  



Class <i>FindAndAssign</i>  
Responsibilities:  
	Find appropriate client for the table
	Assign table to that client  

Collaborators:     
	WaitlistManager  
	Client  









