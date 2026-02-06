# Write your MySQL query statement below


-- Think Logically 

--  case 1 ) p_id is null -> Root Node ( Root Node is the one at top -> with no parent)
--  case 2)  id not in p_id -> Leaf Node (Leaf Node are the one at most bottom , hence no child node)
--  case 3) else they are inner node 

select id , 
    case 

    when p_id is null then "Root"
    when id not in(select p_id from Tree where p_id is not null) then "Leaf"
    else "Inner"
    end as Type 
from Tree;

