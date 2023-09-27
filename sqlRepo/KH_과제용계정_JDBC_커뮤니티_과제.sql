-- 테이블 생성
DROP TABLE MEMBER;
CREATE TABLE MEMBER (
    NO  NUMBER
    , ID VARCHAR2(100)
    , PWD VARCHAR2(100)
    , NICK VARCHAR2(100)
    , ENROLL_DATE TIMESTAMP
    , QUIT_YN CHAR(1));
    
DROP TABLE BOARD;
CREATE TABLE BOARD (
    NO NUMBER
    , TITLE VARCHAR2(100)
    , CONTENT VARCHAR2(4000)
    , WRITER_NO NUMBER
    , ENROLL_DATE TIMESTAMP
    , DEL_YN CHAR(1));
    
-- 회원가입
INSERT INTO MEMBER (
    NO
    , ID
    , PWD
    , NICK
    , ENROLL_DATE
    , QUIT_YN) 
    VALUES (
        1
        , 'USER01'
        , '1234'
        , 'NICK01'
        , SYSDATE
        , 'N');
-- 로그인
SELECT * 
FROM MEMBER 
WHERE ID='USER01' 
AND PWD = '1234';
-- 비번변경
UPDATE MEMBER 
    SET PWD = '4567' 
WHERE ID = 'USER01' 
AND PWD= '1234';
-- 닉네임 변경
UPDATE MEMBER 
    SET NICK = 'NICK02'
WHERE ID = 'USER01' 
AND PWD = '1234';
-- 탈퇴
UPDATE MEMBER
    SET QUIT_YN = 'Y'
    WHERE ID = 'USER01'
    AND PWD = '1234';
-- 마이페이지 조회
SELECT * 
FROM MEMBER 
WHERE ID = 'USER01' 
AND PWD = '1234';

-- 게시글 작성
INSERT INTO BOARD (
    NO
    , TITLE
    , CONTENT
    , WRITER_NO
    , ENROLL_DATE
    , DEL_YN) 
VALUES(
    1
    , 'TITLE01'
    , 'CONTENT01'
    ,1               -- 임의의 회원번호. 1번
    ,SYSDATE
    , 'N');          -- 삭세하면 Y 로 변경예정
-- 게시글 전체 목록 조회(게시글제목, 작성일시, 작성자) (최신순으로 정렬)
SELECT 
    TITLE
    , ENROLL_DATE
    , WRITER_NO
FROM BOARD 
ORDER BY ENROLL_DATE DESC;
-- 게시글 상세조회
SELECT *
FROM BOARD
WHERE NO = 1;     --게시글 번호를 이용하여 조회
-- 게시글 제목 및 내용 수정
UPDATE BOARD 
    SET TITLE = 'TITLE02' 
    ,CONTENT = 'CONTENT02'
WHERE NO = 1;  --1번 게시글 수정
-- 게시글 삭제
DELETE BOARD 
WHERE NO = 1;  --WRITER_NO 로 쿼리문구 작성하면 그 작성자가 만든 모든 글이 다 삭제가 되는 것이라....

