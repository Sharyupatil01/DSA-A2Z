# Write your MySQL query statement below

-- find the ids of product that are both low fat and recyclable 
-- that means , both should be marked 'y'
-- hence use AND 

select product_id from Products where low_fats='Y' AND recyclable='Y';