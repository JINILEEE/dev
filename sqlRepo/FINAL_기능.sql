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
    , DEL_YN            CHAR(1)         DEFAULT 'N' CHECK(DEL_YN IN('Y', 'N'))
    , WRITER_NO         NUMBER          NOT NULL
);



-- MEMBER
DROP SEQUENCE SEQ_MEMBER_NO;
CREATE SEQUENCE SEQ_MEMBER_NO NOCACHE NOCYCLE;
DROP TABLE MEMBER CASCADE CONSTRAINTS;
CREATE TABLE MEMBER(
    NO              NUMBER          PRIMARY KEY
    ,ID             VARCHAR2(100)   NOT NULL UNIQUE
    ,PWD            VARCHAR2(100)   NOT NULL
    ,NICK           VARCHAR2(100)   NOT NULL
    ,ENROLL_DATE    TIMESTAMP       DEFAULT SYSDATE
    , DEL_YN        CHAR(1)         DEFAULT 'N' CHECK(DEL_YN IN('Y', 'N'))
);


-- 외래키
ALTER TABLE BOARD ADD CONSTRAINT FK_BOARD_MEMBER FOREIGN KEY(WRITER_NO) REFERENCES MEMBER(NO);


---------------------------
-- 기능
---------------------------


--------------------------------- <MEMBER> ---------------------------------
-- 회원가입
INSERT INTO MEMBER 
(
    NO
    , ID
    , PWD
    , NICK
) 
VALUES 
(
    SEQ_MEMBER_NO.NEXTVAL
    , ?
    , ?
    , ?
)
;



-- 로그인
SELECT 
    NO
    , ID
    , PWD
    , NICK
    , ENROLL_DATE
    , DEL_YN
FROM MEMBER
WHERE ID = ?
AND PWD = ?
;

-- 회원 정보 수정 (비밀번호, 닉네임) <<<<<<<

-- 회원 탈퇴
UPDATE MEMBER
    SET
        DEL_YN = 'Y'
WHERE NO = ?
;

-- 전체 회원 목록 조회 (관리자 전용)
SELECT 
    NO
    , ID
    , PWD
    , NICK
    , ENROLL_DATE
    , DEL_YN
FROM MEMBER
WHERE DEL_YN = 'N'
;


--------------------------------- <BOARD> ---------------------------------
-- 게시글 작성
INSERT INTO BOARD
(
    NO
    , TITLE
    , CONTENT
    , WRITER_NO
)
VALUES
(
    SEQ_BOARD_NO.NEXTVAL
    , ?
    , ?
    , ?
)
;

-- 게시글 목록 조회
SELECT
    NO
    , TITLE
    , CONTENT
    , ENROLL_DATE
    , DEL_YN
    , WRITER_NO
FROM BOARD
AND DEL_YN = 'N'
;

-- 게시글 상세 조회 (글 번호)
SELECT
    NO
    , TITLE
    , CONTENT
    , ENROLL_DATE
    , DEL_YN
    , WRITER_NO
FROM BOARD
WHERE NO = ?
AND DEL_YN = 'N'
;

-- 게시글 수정 (제목,내용) <<<<<<<



-- 게시글 삭제 (글 번호)
UPDATE BOARD 
    SET 
        DEL_YN = 'Y'
WHERE NO = ?
;
    
    
-- 게시글 검색 (제목,내용,작성자) . <<<<<<



