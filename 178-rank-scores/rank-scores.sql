# Write your MySQL query statement below
-- select score , dense_rank() over(order by score desc )  as 'rank' 
-- from Scores 
-- order by score desc;


select s1.score ,( select count(distinct s2.score)  from Scores s2 where s1.score<score ) + 1 as 'rank' 
from Scores s1 
order by s1.score desc;