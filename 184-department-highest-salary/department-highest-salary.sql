# Write your MySQL query statement below
-- select d.name as Department , e.name as Employee , e.salary as Salary 
-- from Employee as e   join Department as d 
-- on e.departmentId=d.id 
-- where e.salary=(
--     select max(salary)
--     from Employee 
--     where departmentId=e.departmentId
-- );
with highest_salary as (
select d.name as Department , e.name as Employee , e.salary as Salary 
, dense_rank() over(PARTITION BY d.name order by salary desc) as rnk
from Employee as e 
join Department as d 
on e.departmentId=d.id
) 
select Department , Employee , Salary from highest_salary 
where rnk=1;



