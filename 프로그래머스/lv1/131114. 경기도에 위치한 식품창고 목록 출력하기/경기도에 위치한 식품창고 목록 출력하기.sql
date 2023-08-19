-- 코드를 입력하세요

-- 경기도의 위치
-- 냉동 시설 여부 NULL
-- 창고 ID 오름차순 정렬

SELECT WAREHOUSE_ID,WAREHOUSE_NAME,ADDRESS, case when (FREEZER_YN is null) then 'N' else FREEZER_YN end as FREEZER_YN
from FOOD_WAREHOUSE
where ADDRESS like "경기도%"
order by WAREHOUSE_ID ASC;