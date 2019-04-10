# **Implementation of Strategy Pattern using Lambda expressions in Java8**

## Comparison of the 2 implementations - 

### Strategy Pattern Implementation
------------------------------------------------------------------------------------------------------------------------------
Strategy Pattern is used to change the behavior of an algorithm at runtime. Three strategies have been implemented to add particular numbers from an input List of integers  

- AddAll.java
- AddEven.java
- AddOdd.java

Then a Context class is used to set the desired strategy and execute the totalValues() operation in the Strategy interface. 

From the Main method, the desired strategy is passed and the total value is calculated according the set addition Strategy. We can get our desired answer according to the set strategy

### Using Lambda Expressions
------------------------------------------------------------------------------------------------------------------------------
The implementation using lambda expressions is much less verbose and makes use of lesser number of classes. The Strategy Pattern can be easily implemented using A Predicate as an argument to the totalValues() method  
The Main method is used to call the totalValues method with a different Function Predicate to add all/even/odd numbers. 
This simplistic method does not need extra classes and interfaces to get the same output as the previous implementation. 
