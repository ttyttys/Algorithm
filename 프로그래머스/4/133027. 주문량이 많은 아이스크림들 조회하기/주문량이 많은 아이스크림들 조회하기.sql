-- 코드를 입력하세요
select f.flavor
from first_half f, (select flavor, sum(total_order) total from july group by flavor) as t
where f.flavor = t.flavor
order by (f.total_order + t.total) desc
limit 3
