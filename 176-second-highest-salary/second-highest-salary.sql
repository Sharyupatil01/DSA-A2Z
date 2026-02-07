-- # Write your MySQL query statement belo
-- limit knowledge 
-- select ifnull() as SecondHighestSalary 
-- from Employee 
-- order by Salary desc 
-- limit 1 offset 1; 

-- SubQuery 
-- select max(salary) as SecondHighestSalary 
-- from Employee 
-- where salary < (
--     select max(salary)
--     from Employee
-- );



-- This query naturally handles the "no second highest" case by returning NULL. Here's why:

-- The inner subquery (SELECT MAX(salary) FROM Employee) returns the highest salary.
-- The outer query filters for salaries strictly less than that value.
-- If no rows satisfy salary < max_salary (e.g., all salaries are equal, or only one row exists), the outer MAX(salary) has no rows to evaluate.
-- In SQL, aggregate functions like MAX() return NULL when applied to an empty set.
-- Try this thought experiment:
-- What would happen if the Employee table had only one row with salary = 5000?

-- Inner query → 5000
-- Outer query → WHERE salary < 5000 → no matching rows
-- Result → MAX() on empty set → NULL


-- Test this yourself:
-- If Employee has [(1, 5000)] (one employee), the query returns NULL as the result.
-- If Employee has [(1, 5000), (2, 5000)] (all salaries equal), it also returns NULL.



-- Window functions 
-- Row Function()

-- select max(salary) as SecondHighestSalary 
-- from ( 
--     select salary ,
--      over(order by salary desc) as rn   from  (
--         select distinct salary from Employee) d 
-- ) x 
-- where x.rn=2;


select max(salary) as SecondHighestSalary 
from ( 
    select salary ,
     dense_rank() over (order by salary desc) as rn   
     from Employee e 
) x 
where x.rn=2;