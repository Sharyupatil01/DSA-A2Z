# SQL JOINs Practice Repository

## Overview
This repository contains practical examples and exercises for understanding **SQL JOINs** using real-world scenarios.  
The main goal is to strengthen both **theoretical knowledge** and **practical application** of SQL joins, including:

- INNER JOIN
- LEFT JOIN
- RIGHT JOIN
- FULL OUTER JOIN
- CROSS JOIN
- SELF JOIN

All examples use a consistent dataset to make the concepts easy to understand and memorize.

---

## Tables Used

### Customers Table
| CustomerID | CustomerName | ReferrerID |
|------------|--------------|------------|
| 1 | Asha | NULL |
| 2 | Ravi | 1 |
| 3 | Meena | 2 |
| 4 | Karan | 1 |

### Orders Table
| OrderID | CustomerID | Product |
|---------|------------|---------|
| 101 | 1 | Laptop |
| 102 | 1 | Mouse |
| 103 | 2 | Keyboard |
| 104 | 5 | Monitor |

---

## Example Queries

### 1. INNER JOIN
```sql
SELECT c.CustomerName, o.Product
FROM Customers c
INNER JOIN Orders o
ON c.CustomerID = o.CustomerID;

Result: Only customers who placed an order.
2. LEFT JOIN

SELECT c.CustomerName, o.Product
FROM Customers c
LEFT JOIN Orders o
ON c.CustomerID = o.CustomerID;

Result: All customers, including those with no orders.

3. RIGHT JOIN
SELECT c.CustomerName, o.Product
FROM Customers c
RIGHT JOIN Orders o
ON c.CustomerID = o.CustomerID;


Result: All orders, including those without valid customers.

4. FULL OUTER JOIN
SELECT c.CustomerName, o.Product
FROM Customers c
FULL OUTER JOIN Orders o
ON c.CustomerID = o.CustomerID;


Result: All customers and all orders, matched or unmatched.

5. CROSS JOIN
SELECT c.CustomerName, o.Product
FROM Customers c
CROSS JOIN Orders o;


Result: Every possible combination of customers and orders (Cartesian product).

6. SELF JOIN
SELECT c1.CustomerName AS Customer, c2.CustomerName AS ReferredBy
FROM Customers c1
LEFT JOIN Customers c2
ON c1.ReferrerID = c2.CustomerID;


Result: Shows hierarchical relationships (like customer referrals).

LEFT JOIN vs RIGHT JOIN (Swap Concept)
Query	Guaranteed Rows From
A LEFT JOIN B	A (left table)
B LEFT JOIN A	B (left table)
A RIGHT JOIN B	B (right table)
B RIGHT JOIN A	A (right table)

Rule:

LEFT JOIN preserves all rows from the left table.

RIGHT JOIN preserves all rows from the right table.

Swapping the tables swaps which rows are preserved.

Memory Tip:

LEFT JOIN = Keep all rows on your left hand
RIGHT JOIN = Keep all rows on your right hand