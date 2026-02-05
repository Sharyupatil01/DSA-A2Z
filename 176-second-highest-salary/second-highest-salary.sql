-- # Write your MySQL query statement belo
-- limit knowledge 
-- select ifnull() as SecondHighestSalary 
-- from Employee 
-- order by Salary desc 
-- limit 1 offset 1; 

-- SubQuery 
select max(salary) as SecondHighestSalary 
from Employee 
where salary < (
    select max(salary)
    from Employee
);