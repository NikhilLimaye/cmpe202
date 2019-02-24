Lab4 : CRC Cards

Class Client
Responsibilities : 
	Sign up for a table
	Accept or deny when table is ready
	Maintain client details - name, phone, party size

Collaborators : 
	WaitListMananger
	AssignTable



Class WaitlistManager
Responsibilities: 
	Add a Client to the back of the waiting list
	Remove particular client from the waiting list
	Provide size of next available table

Collaborators: 
	AssignCurrent
	FindAndAssign
	Client


Class AssignCurrent
Responsibilities:
	Check if Client is accepting or denying available table
	Get size of currently available table
	Remove Client from waitlist 
	Go to the next request Handler

Collaborators: 
	WaitlistManager
	Client



Class FindAndAssign
Responsibilities:
	Check if Client is accepting or denying available table
	Find appropriate contender for currently available table
	Get size of currently available table
	Remove Client from waitlist 
	Go to the next request Handler

Collaborators: 
	WaitlistManager
	Client









