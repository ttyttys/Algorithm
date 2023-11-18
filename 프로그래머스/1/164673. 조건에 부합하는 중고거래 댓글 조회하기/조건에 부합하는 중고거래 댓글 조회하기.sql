-- 코드를 입력하세요
SELECT  b.title, b.board_id, r.reply_id, r.writer_id, r.contents, substr(r.created_date, 1, 10)
from used_goods_board as b join used_goods_reply as r on b.board_id = r.board_id
where substr(b.created_date, 1, 7) = '2022-10'
order by r.created_date, b.title