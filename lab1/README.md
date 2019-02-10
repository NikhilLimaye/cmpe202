LAB #1 - Code Maintainability

Three types of gumball machines - 

Type 1 - Accepts only quarters. Gumball costs 25 cents.

Type 2 - Accepts only quarters. Gumball costs 50 cents.

Type 3 - Accepts nickels, dimes and quarters. Gumball costs 50 cents.

Approaches -
1. Code First
2. Design First

Working - 
The user can initialize a gumball machine of any type by specifying it in the constructor - GumballMachine(int gumballCount, int machineType)
If the customer calls turnCrank before the full amount is inserted  - An error will be displayed
If the customer calls turnCrank with sufficient money inserted, any change remaining will be ejected along with the gumball
