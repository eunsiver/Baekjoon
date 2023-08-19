-- 코드를 입력하세요
-- 리뷰를 가장 많이 작성한 회원들의 리뷰 조회



SELECT MEMBER_NAME,REVIEW_TEXT,DATE_FORMAT(REVIEW_DATE,'%Y-%m-%d') as REVIEW_DATE
from (select MEMBER_NAME,REVIEW_TEXT,DATE_FORMAT(REST_REVIEW.REVIEW_DATE,'%Y-%m-%d') as REVIEW_DATE
    from MEMBER_PROFILE join REST_REVIEW on MEMBER_PROFILE.MEMBER_ID = REST_REVIEW.MEMBER_ID) tables
where tables.MEMBER_NAME = (select MEMBER_PROFILE.MEMBER_NAME
    from MEMBER_PROFILE join REST_REVIEW on MEMBER_PROFILE.MEMBER_ID = REST_REVIEW.MEMBER_ID 
    group by MEMBER_PROFILE.MEMBER_ID
    order by  count(*) desc
    limit 1)
order by REVIEW_DATE asc,REVIEW_TEXT asc;


