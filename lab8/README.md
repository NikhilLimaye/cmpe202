# Lab #8 Design Notes

Design Pattern implemented - Decorator Pattern

The solution to the problem here is additional display functionality dynamically depending on the number of digits entered and the field currently active. 
the Decorator pattern is suitable in this scenario. 

Component interface has 2 operations:  
 - addDoubleSpace()
 - addSeparator()

The concrete Decorator class will implement these operations. 

The already implemented classes CreditCardExp and CreditCardNum will extend these decorator methods. 
