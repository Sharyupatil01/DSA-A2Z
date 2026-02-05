# Write your MySQL query statement below
-- select e.name as Employee from Employee as e 
-- join Employee as m 
-- on e.managerId=m.id 
-- where e.salary> m.salary;

-- Coorelated SubQuery Use 

select name as Employee from Employee 
as e 
where salary >(
    select salary 
    from Employee 
    where id = e.managerId
);