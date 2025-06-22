# Pizza Customization System – Decorator Pattern Requirement
You're building a backend system for a pizza ordering app that supports custom pizza creation. 
The restaurant offers a base set of pizza types, and customers can customize them with multiple 
toppings and sauces.

## Requirements
### 1.The system must support the following pizza bases:

Margherita ($8.00)

Pepperoni ($9.50)

Veggie ($9.00)

### 2.Customers can choose from toppings, each with its own additional cost:

Cheese (+$1.00)

Olives (+$0.75)

Mushrooms (+$0.85)


### 3.Customers can:

Add any number of toppings

See a full description of their pizza (e.g., "Pepperoni with Cheese, Olives, and Bacon")

Get the total price

### 4.The system should be extensible:

New toppings and pizza types should be easy to add without modifying existing code

Each topping should add to the price and alter the description
