# Design Patterns:
## 1. Chain of Responsibility   
Multiple classes or "handlers" can handle a request for assigning a table. 
The suitable client can either be at the top of the queue or somewhere down the queue if the first one is not suitable 
Table Helper - Parent handler Interface  
Class AssignCurrent - Concrete Handler 1  
Class FindAndAssign - Concrete Handler 2  

## 2. Singleton  
Only a single instance of the Class WaitlistManager needs to be present.  
The Class WaitlistManager is a Singleton class for this purpose.  


CRC Cards  

### Class <i>Client</i>  
Responsibilities:   
+ Sign up for a table   
+ Accept an available table
+ Deny an available table
+ Provide details - name, phone number and party size 

Collaborators:   
+ WaitListMananger 
+ AssignCurrent  
+ FindAndAssign
	

### Class <i>WaitlistManager</i>  
Responsibilities:   
+ Provide a single instance of Class WaitlistManager  
+ Add a Client to the back of the waiting list  
+ Remove particular client from the top of the waiting list  
+ Provide size of next available table  

Collaborators:   
+ AssignCurrent  
+ FindAndAssign  
+ Client  


### Class <i>AssignCurrent</i>  
Responsibilities:  
+ Assign table to client at the top of the waitlist  
+ Call next handler in the chain  

Collaborators:     
+ WaitlistManager  
+ Client  

### Class <i>FindAndAssign</i>  
Responsibilities:  
+ Find appropriate client for the table by parsing the waitlist
+ Assign table to the appropriate client    
+ Print status message if the available table is not suitable for any client

Collaborators:       
+ WaitlistManager    
+ Client    









