# Write your MySQL query statement belows

select distinct p1.num as ConsecutiveNums from Logs p1 , Logs p2 , Logs p3 
where 
p1.id=p2.id+1 and 
p2.id=p3.id+1 and 
p1.num=p2.num and 
p2.num=p3.num;