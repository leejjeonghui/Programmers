-- 코드를 입력하세요
SELECT fh.FLAVOR
from FIRST_HALF fh
left join ICECREAM_INFO i on fh.FLAVOR = i.FLAVOR
where fh.TOTAL_ORDER > 3000 and i.INGREDIENT_TYPE = 'fruit_based'
order by fh.TOTAL_ORDER desc;