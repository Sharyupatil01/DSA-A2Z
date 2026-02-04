# Write your MySQL query statement below
select e.id from Weather as e join Weather as t 
on datediff(e.recordDate,t.recordDate)=1
where e.temperature> t.temperature;