# Lab #6 Design Notes

## Design Pattern used : Strategy Pattern

Two classes implement the PrintingStrategy interface -  PackingSlip and OrderReceipt  
The PrintingStrategy interface contains the "print()" method. 

### For Class OrderReceipt: 
The Receipt is printed in the order in which the customer requests different items.  
Items have been divided into - Meat, Top bun toppings and Bottom bun toppings.   
This order is maintained by the "orderRequests" ArrayList. Items are added to this list in their respective contructors.  
This list is parsed from index 0 to print the receipt in the order in which items were requested.

## For Class Packing Slip:  
The Slip is printed in a predetermined manner -  
 - Top bun toppings  
 - Bottom bun toppings  
 - Meat 
The algorithm does not any extra processing

Following is the class diagram for the solution
![Class Diagram](/lab6/output/five-guys-strategy-pattern.jpg)

![Receipt console output](/lab6/output/Receipt_output.JPG)

![Packing slip console output](/lab6/output/PackingSlip_output.JPG)
