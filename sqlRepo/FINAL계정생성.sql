--아래는 system 계정에서 실행한 내용
CREATE USER C##FINAL IDENTIFIED BY 1234;
GRANT CONNECT , RESOURCE TO C##FINAL;
ALTER USER C##FINAL DEFAULT TABLESPACE USERS QUOTA UNLIMITED ON USERS;

--------------------------------여기부턴 final 계정으로 진행----------------------------------------

-- BOARD
DROP SEQUENCE SEQ_BOARD_NO;
CREATE SEQUENCE SEQ_BOARD_NO NOCACHE NOCYCLE;
DROP TABLE BOARD;
CREATE TABLE BOARD(
    NO                  NUMBER          PRIMARY KEY
    , TITLE             VARCHAR2(100)   NOT NULL
    , CONTENT           VARCHAR2(4000)  NOT NULL
    , ENROLL_DATE       TIMESTAMP       DEFAULT SYSDATE
);



-- 게시글 작성
INSERT INTO BOARD
(
    NO
    , TITLE
    , CONTENT
)
VALUES
(
    SEQ_BOARD_NO.NEXTVAL
    , 'TTTTTT'
    , 'CCCCCC'
)
;

rollback;


-- 게시글 목록 조회
SELECT * 
FROM BOARD
;


--게시글 상세조회
SELECT * 
FROM BOARD
WHERE NO=?
;



--게시글 삭제
DELETE FROM BOARD
WHERE NO=?
;



--게시글 수정
UPDATE BOARD 
    SET TITLE=?
    , CONTENT=?
WHERE NO=?
;















