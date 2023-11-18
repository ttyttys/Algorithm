-- 코드를 입력하세요
SELECT member_id, member_name, gender, substr(date_of_birth, 1, 10) 
from member_profile
where tlno is not null and gender = 'W' and substr(date_of_birth, 6, 7) = 03
order by member_id asc
