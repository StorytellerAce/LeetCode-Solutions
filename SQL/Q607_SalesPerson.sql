select distinct s.name
from SalesPerson s
left join Orders o on s.sales_id = o.sales_id
left join Company c on o.com_id = c.com_id
group by s.name
HAVING COALESCE(SUM(c.name = 'RED'), 0) = 0;

# where not exist solution
select s.name 
from SalesPerson s
where not exists (
select 1
from Orders o 
left join Company c on o.com_id = c.com_id
where o.sales_id = s.sales_id and c.name = "RED"
)