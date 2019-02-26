Lab 4 Solution --  
Design Patterns used --  
1. Chain of Responsibility   
Multiple classes or "handlers" can handle a request for assigning a table. 
The appropriate client could be at the top of the list or somewhere down the queue.   
Table Helper - Hanlder Interface  
AssignCurrent - Concrete Handler 1  
FindAndAssign - Concrete Handler 2  

2. Singleton  
Only a single instance of the waitlist needs to be existing  
The Class WaitlistManager is a Singleton class for this purpose.  


CRC Cards  

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









