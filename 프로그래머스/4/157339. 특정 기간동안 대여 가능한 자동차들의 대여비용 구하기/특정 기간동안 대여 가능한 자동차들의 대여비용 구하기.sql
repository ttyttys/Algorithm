-- 코드를 입력하세요
SELECT a.car_id, a.car_type, round(a.daily_fee * (100 - c.discount_rate) / 100 * 30, 0) as fee
from car_rental_company_car a join car_rental_company_discount_plan c on a.car_type = c.car_type
where a.car_type in ('세단', 'suv') and 
a.daily_fee * (100 - c.discount_rate) / 100 * 30 between '500000' and '2000000' and
c.duration_type = '30일 이상' and
A.CAR_ID NOT IN (
        SELECT CAR_ID
        FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
        WHERE END_DATE >= '2022-11-01' AND START_DATE < '2022-12-01'
)
ORDER BY FEE DESC, a.CAR_TYPE, a.CAR_ID DESC