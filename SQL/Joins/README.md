SQL JOIN Examples – Customer & Orders


Table Setup
Customers
CustomerID	CustomerName
1	Asha
2	Ravi
3	Meena
4	Karan
Orders
OrderID	CustomerID	Product
101	1	Laptop
102	1	Mouse
103	2	Keyboard
104	5	Monitor
1. INNER JOIN

Query:

SELECT c.CustomerName, o.Product
FROM Customers c
INNER JOIN Orders o
ON c.CustomerID = o.CustomerID;


Output:

CustomerName	Product
Asha	Laptop
Asha	Mouse
Ravi	Keyboard

Explanation:
Returns only customers who have placed at least one order. Customers without orders and orders with no matching customer are ignored.

Use Case: List of customers who made purchases.

2. LEFT JOIN

Query:

SELECT c.CustomerName, o.Product
FROM Customers c
LEFT JOIN Orders o
ON c.CustomerID = o.CustomerID;


Output:

CustomerName	Product
Asha	Laptop
Asha	Mouse
Ravi	Keyboard
Meena	NULL
Karan	NULL

Explanation:
Returns all customers. If a customer has no orders, the order column is NULL.

Use Case: Identify all customers, including those who haven’t placed orders.

3. RIGHT JOIN

Query:

SELECT c.CustomerName, o.Product
FROM Customers c
RIGHT JOIN Orders o
ON c.CustomerID = o.CustomerID;


Output:

CustomerName	Product
Asha	Laptop
Asha	Mouse
Ravi	Keyboard
NULL	Monitor

Explanation:
Returns all orders. If an order has no matching customer, customer columns are NULL.

Use Case: Find orders from unknown or deleted customers.

4. FULL OUTER JOIN

Query:

SELECT c.CustomerName, o.Product
FROM Customers c
FULL OUTER JOIN Orders o
ON c.CustomerID = o.CustomerID;


Output:

CustomerName	Product
Asha	Laptop
Asha	Mouse
Ravi	Keyboard
Meena	NULL
Karan	NULL
NULL	Monitor

Explanation:
Returns all customers and all orders, whether matched or not.

Use Case: Complete audit for missing orders or customers.

5. CROSS JOIN

Query:

SELECT c.CustomerName, o.Product
FROM Customers c
CROSS JOIN Orders o;


Output:
All possible customer-product pairs (4 × 4 = 16 rows).

Explanation:
Pairs every customer with every order.

Use Case: Marketing: create all possible combinations of customers and products.

6. SELF JOIN

Modified Customers Table (with ReferrerID):

CustomerID	CustomerName	ReferrerID
1	Asha	NULL
2	Ravi	1
3	Meena	2
4	Karan	1

Query:

SELECT c1.CustomerName AS Customer, c2.CustomerName AS ReferredBy
FROM Customers c1
LEFT JOIN Customers c2
ON c1.ReferrerID = c2.CustomerID;


Output:

Customer	ReferredBy
Asha	NULL
Ravi	Asha
Meena	Ravi
Karan	Asha

Explanation:
Joins a table with itself to find hierarchical relationships (e.g., referrals).

Use Case: Referral systems, hierarchy mapping.

Memory Tricks

 LEFT JOIN → Keep all rows from left table

 RIGHT JOIN → Keep all rows from right table

LEFT/RIGHT JOIN mirror:

Query	Guaranteed Rows
A LEFT JOIN B	A
B LEFT JOIN A	B
A RIGHT JOIN B	B
B RIGHT JOIN A	A

Tip: Swapping tables flips which side is guaranteed. LEFT JOIN from one side = RIGHT JOIN from the other.