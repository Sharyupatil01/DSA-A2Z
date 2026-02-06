# Write your MySQL query statement below
with FirstLogin as(
    select player_id , 
    min(event_date)
    as firstlogin 
    from Activity 
    group by player_id 
) 

select round( count(distinct a.player_id)/count(distinct f.player_id),2) as fraction 

from FirstLogin as f 
left join Activity as a 
on f.player_id=a.player_id  and datediff(a.event_date,f.firstlogin)=1;