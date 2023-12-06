SELECT * 
FROM BOARD 
WHERE STATUS = 'O' 
ORDER BY NO DESC
;


SELECT
    B.NO
    ,B.CATEGORY_NO
    ,B.TITLE
    ,B.CONTENT
    ,B.WRITER_NO
    ,B.HIT
    ,B.ENROLL_DATE
    ,B.MODIFY_DATE
    ,B.STATUS
    ,M.NICK
FROM BOARD B
JOIN MEMBER M ON (B.WRITER_NO = M.NO)
WHERE B.STATUS = 'O'
ORDER BY B.NO DESC
;


INSERT INTO BOARD(NO, CATEGORY_NO, TITLE, CONTENT, WRITER_NO) 
VALUES (SEQ_BOARD_NO.NEXTVAL , ?, ?, ?, ?);

SELECT * FROM BOARD;


-- 게시글 상세조회
SELECT 
    B.NO
    ,B.CATEGORY_NO
    ,B.TITLE
    ,B.CONTENT
    ,B.WRITER_NO
    ,B.HIT
    ,B.ENROLL_DATE
    ,B.MODIFY_DATE
    ,B.STATUS
    ,M.NICK AS WRITER_NICK
    ,C.NAME AS CATEGORY_NAME
FROM BOARD B
JOIN MEMBER M ON B.WRITER_NO = M.NO
JOIN CATEGORY C ON B.CATEGORY_NO = C.NO
WHERE B.NO = 5
AND B.STATUS = 'O'
;


-- 조회수 증가
UPDATE BOARD
SET HIT = HIT +1
WHERE NO = 5
AND STATUS = 'O'
;

ROLLBACK;



SELECT 
    B.NO 
    ,B.CATEGORY_NO 
    ,B.TITLE 
    ,B.CONTENT 
    ,B.WRITER_NO 
    ,B.HIT 
    ,B.ENROLL_DATE 
    ,B.MODIFY_DATE 
    ,B.STATUS 
    ,M.NICK AS WRITER_NICK
    ,C.NAME AS CATEGORY_NAME
FROM BOARD B 
JOIN MEMBER M ON (B.WRITER_NO = M.NO) 
JOIN CATEGORY C ON B.CATEGORY_NO = C.NO
WHERE B.STATUS = 'O' 
ORDER BY B.NO DESC
;


--게시글 목록 조회
SELECT *
FROM (
        SELECT ROWNUM RNUM, T.*
        FROM (
                SELECT 
                    B.NO
                    ,B.CATEGORY_NO
                    ,B.TITLE
                    ,B.CONTENT
                    ,B.WRITER_NO
                    ,B.HIT
                    ,B.ENROLL_DATE
                    ,B.MODIFY_DATE
                    ,B.STATUS
                    ,M.NICK AS WRITER_NICK
                    ,C.NAME AS CATEGORY_NAME
                FROM BOARD B
                JOIN MEMBER M ON B.WRITER_NO = M.NO
                JOIN CATEGORY C ON B.CATEGORY_NO = C.NO
                WHERE B.STATUS = 'O'
                ORDER BY B.NO DESC
            ) T
    )
WHERE RNUM BETWEEN ? AND ?
;






        









