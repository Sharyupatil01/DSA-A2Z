CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT

BEGIN
--   set  N = N-1;
--   RETURN (
       
--       select distinct salary 
--       from Employee 
--       order by salary desc 
--        limit 1 offset N 
--   );
     RETURN(
      select salary from (
         select * 
      , dense_rank() over(order by salary desc ) as rn
      from Employee ) x 
      where rn=N limit 1
     );

END