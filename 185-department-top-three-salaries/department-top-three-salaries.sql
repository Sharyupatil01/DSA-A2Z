# Write your MySQL query statement below

-- select Department , Employee , Salary 
-- from(
--     select d.name as Department , 
--            e.name as Employee,
--            e.salary as Salary ,
--            dense_rank() over(
--             PARTITION  by e.departmentId 
--             order by e.salary desc 
--            ) as rankk 
--            from Employee as e 
--            join Department as d 
--            on e.departmentId=d.id 
-- ) t 
-- where rankk<=3;


select d.name as Department , 
       e.name as Employee ,
       e.salary as Salary 
from Employee as e 
join Department as d 
on e.departmentId = d.id 
where 3 >(
    select count(distinct e1.salary)
    from Employee as e1 
    where e1.departmentId=e.departmentId 
    and  e1.salary > e.salary
);
