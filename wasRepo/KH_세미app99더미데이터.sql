/*
--아래는 system 계정에서 실행한 내용
CREATE USER C##SEMI IDENTIFIED BY 1234;
GRANT CONNECT , RESOURCE TO C##SEMI;
ALTER USER C##SEMI DEFAULT TABLESPACE USERS QUOTA UNLIMITED ON USERS;
*/

SET DEFINE OFF;
-- MEMBER
DROP SEQUENCE SEQ_MEMBER_NO;
CREATE SEQUENCE SEQ_MEMBER_NO NOCACHE NOCYCLE;
DROP TABLE MEMBER CASCADE CONSTRAINTS;
CREATE TABLE MEMBER(
    NO              NUMBER          PRIMARY KEY
    ,ID             VARCHAR2(100)   NOT NULL UNIQUE
    ,PWD            VARCHAR2(100)   NOT NULL
    ,NICK           VARCHAR2(100)   NOT NULL
    ,PHONE          CHAR(13)        
    ,EMAIL          VARCHAR2(100)
    ,ADDRESS        VARCHAR2(100)
    ,HOBBYS         VARCHAR2(100)
    ,ENROLL_DATE    TIMESTAMP       DEFAULT SYSDATE
    ,MODIFY_DATE    TIMESTAMP       DEFAULT SYSDATE
    ,STATUS         CHAR(1)         DEFAULT 'O'     CHECK (STATUS IN ('O' , 'X')) 
);
-- BOARD
DROP SEQUENCE SEQ_BOARD_NO;
CREATE SEQUENCE SEQ_BOARD_NO NOCACHE NOCYCLE;
DROP TABLE BOARD;
CREATE TABLE BOARD(
    NO                  NUMBER          PRIMARY KEY
    , CATEGORY_NO       NUMBER          NOT NULL
    , TITLE             VARCHAR2(100)   NOT NULL
    , CONTENT           VARCHAR2(4000)  NOT NULL
    , WRITER_NO         NUMBER          NOT NULL
    , HIT               NUMBER          DEFAULT 0
    , ENROLL_DATE       TIMESTAMP       DEFAULT SYSDATE
    , MODIFY_DATE       TIMESTAMP       DEFAULT SYSDATE
    , STATUS            CHAR(1)         DEFAULT 'O' CHECK( STATUS IN ('O', 'X') )
);
-- GALLERY
DROP SEQUENCE SEQ_GALLERY_NO;
CREATE SEQUENCE SEQ_GALLERY_NO NOCACHE NOCYCLE;
DROP TABLE GALLERY CASCADE CONSTRAINTS;
CREATE TABLE GALLERY(
    NO                  NUMBER          PRIMARY KEY
    , TITLE             VARCHAR2(100)   NOT NULL
    , WRITER_NO         NUMBER          NOT NULL
    , HIT               NUMBER          DEFAULT 0
    , ENROLL_DATE       TIMESTAMP       DEFAULT SYSDATE
    , MODIFY_DATE       TIMESTAMP       DEFAULT SYSDATE
    , STATUS            CHAR(1)         DEFAULT 'O' CHECK( STATUS IN ('O', 'X') )
);
-- ATTACHMENT
DROP SEQUENCE SEQ_ATTACHMENT_NO;
CREATE SEQUENCE SEQ_ATTACHMENT_NO NOCACHE NOCYCLE;
DROP TABLE ATTACHMENT;
CREATE TABLE ATTACHMENT(
    NO              NUMBER          PRIMARY KEY
    , REF_NO        NUMBER          NOT NULL
    , ORIGIN_NAME   VARCHAR2(1000)
    , CHANGE_NAME   VARCHAR2(1000)  NOT NULL
    , FILE_PATH     VARCHAR2(1000)  NOT NULL
    , THUMBNAIL_YN  CHAR(1)         DEFAULT 'N' CHECK (THUMBNAIL_YN IN ('Y','N'))
);


-- COMMENT
DROP SEQUENCE SEQ_REPLY_NO;
CREATE SEQUENCE SEQ_REPLY_NO NOCACHE NOCYCLE;
DROP TABLE REPLY CASCADE CONSTRAINTS;
CREATE TABLE REPLY(
    NO              NUMBER          PRIMARY KEY
    , REF_NO        NUMBER          NOT NULL
    , CONTENT       VARCHAR2(1000)  NOT NULL
    , WRITER_NO     NUMBER          NOT NULL
    , ENROLL_DATE   TIMESTAMP       DEFAULT SYSDATE
    , STATUS        CHAR(1)         DEFAULT 'O' CHECK( STATUS IN ('O','X') )
);


-- 카테고리
DROP TABLE CATEGORY;
CREATE TABLE CATEGORY(
    NO          NUMBER              PRIMARY KEY
    , NAME      VARCHAR2(100)       NOT NULL
);

-- 외래키
ALTER TABLE BOARD ADD CONSTRAINT FK_BOARD_MEMBER FOREIGN KEY(WRITER_NO) REFERENCES MEMBER(NO);
ALTER TABLE BOARD ADD CONSTRAINT FK_BOARD_CATEGORY FOREIGN KEY(CATEGORY_NO) REFERENCES CATEGORY(NO);
ALTER TABLE ATTACHMENT ADD CONSTRAINT FK_ATTACHMENT_REF_NO FOREIGN KEY(REF_NO) REFERENCES GALLERY(NO);
ALTER TABLE REPLY ADD CONSTRAINT FK_REPLY_REF_NO FOREIGN KEY(REF_NO) REFERENCES BOARD(NO);

-- 데이터 (MEMBER)
INSERT INTO MEMBER (NO, ID, PWD, NICK) VALUES( 0, 'admin' , '1234', '관리자' );
COMMIT;

-- 데이터 (CATEGORY)
INSERT INTO CATEGORY (NO, NAME) VALUES(1, '자유');
INSERT INTO CATEGORY (NO, NAME) VALUES(2, '게임');
INSERT INTO CATEGORY (NO, NAME) VALUES(3, '요리');
INSERT INTO CATEGORY (NO, NAME) VALUES(4, '운동');
INSERT INTO CATEGORY (NO, NAME) VALUES(5, '자바');
INSERT INTO CATEGORY (NO, NAME) VALUES(6, '자바스크립트');
INSERT INTO CATEGORY (NO, NAME) VALUES(7, '쿼리');
INSERT INTO CATEGORY (NO, NAME) VALUES(8, '기타');
COMMIT;

-- 데이터 (BOARD)
INSERT INTO BOARD (NO, CATEGORY_NO, TITLE, CONTENT, WRITER_NO) VALUES ( SEQ_BOARD_NO.NEXTVAL , 1, '제목01', '내용01', 0 );
INSERT INTO BOARD (NO, CATEGORY_NO, TITLE, CONTENT, WRITER_NO) VALUES ( SEQ_BOARD_NO.NEXTVAL , 5, '제목02', '내용02', 0 );
INSERT INTO BOARD (NO, CATEGORY_NO, TITLE, CONTENT, WRITER_NO) VALUES ( SEQ_BOARD_NO.NEXTVAL , 7, '제목03', '내용03', 0 );
COMMIT;


-- 데이터 (GALLERY)
INSERT INTO GALLERY ( NO ,TITLE ,WRITER_NO ) VALUES ( SEQ_GALLERY_NO.NEXTVAL , '갤러리제목01' , 0 );
INSERT INTO GALLERY ( NO ,TITLE ,WRITER_NO ) VALUES ( SEQ_GALLERY_NO.NEXTVAL , '갤러리제목02' , 0 );
INSERT INTO GALLERY ( NO ,TITLE ,WRITER_NO ) VALUES ( SEQ_GALLERY_NO.NEXTVAL , '갤러리제목03' , 0 );
INSERT INTO GALLERY ( NO ,TITLE ,WRITER_NO ) VALUES ( SEQ_GALLERY_NO.NEXTVAL , '갤러리제목04' , 0 );
INSERT INTO GALLERY ( NO ,TITLE ,WRITER_NO ) VALUES ( SEQ_GALLERY_NO.NEXTVAL , '갤러리제목05' , 0 );
INSERT INTO GALLERY ( NO ,TITLE ,WRITER_NO ) VALUES ( SEQ_GALLERY_NO.NEXTVAL , '갤러리제목06' , 0 );
COMMIT;


-- 데이터 (ATTACHEMNT)
INSERT INTO ATTACHMENT ( NO ,REF_NO ,ORIGIN_NAME ,CHANGE_NAME ,FILE_PATH ,THUMBNAIL_YN ) VALUES ( SEQ_ATTACHMENT_NO.NEXTVAL , 1 , '첨부파일1.PNG' , 'fff.png&textsample' , 'dummyimage.com/100x100/000/' , 'Y' );
INSERT INTO ATTACHMENT ( NO ,REF_NO ,ORIGIN_NAME ,CHANGE_NAME ,FILE_PATH ,THUMBNAIL_YN ) VALUES ( SEQ_ATTACHMENT_NO.NEXTVAL , 1 , '첨부파일2.PNG' , 'fff.png&text=sample' , 'dummyimage.com/100x100/000/' , 'N' );
INSERT INTO ATTACHMENT ( NO ,REF_NO ,ORIGIN_NAME ,CHANGE_NAME ,FILE_PATH ,THUMBNAIL_YN ) VALUES ( SEQ_ATTACHMENT_NO.NEXTVAL , 2 , '첨부파일3.PNG' , 'fff.png&text=sample' , 'dummyimage.com/100x100/000/' , 'Y' );
INSERT INTO ATTACHMENT ( NO ,REF_NO ,ORIGIN_NAME ,CHANGE_NAME ,FILE_PATH ,THUMBNAIL_YN ) VALUES ( SEQ_ATTACHMENT_NO.NEXTVAL , 2 , '첨부파일4.PNG' , 'fff.png&text=sample' , 'dummyimage.com/100x100/000/' , 'N' );
INSERT INTO ATTACHMENT ( NO ,REF_NO ,ORIGIN_NAME ,CHANGE_NAME ,FILE_PATH ,THUMBNAIL_YN ) VALUES ( SEQ_ATTACHMENT_NO.NEXTVAL , 3 , '첨부파일5.PNG' , 'fff.png&text=sample' , 'dummyimage.com/100x100/000/' , 'Y' );
INSERT INTO ATTACHMENT ( NO ,REF_NO ,ORIGIN_NAME ,CHANGE_NAME ,FILE_PATH ,THUMBNAIL_YN ) VALUES ( SEQ_ATTACHMENT_NO.NEXTVAL , 3 , '첨부파일6.PNG' , 'fff.png&text=sample' , 'dummyimage.com/100x100/000/' , 'N' );
INSERT INTO ATTACHMENT ( NO ,REF_NO ,ORIGIN_NAME ,CHANGE_NAME ,FILE_PATH ,THUMBNAIL_YN ) VALUES ( SEQ_ATTACHMENT_NO.NEXTVAL , 4 , '첨부파일7.PNG' , 'fff.png&text=sample' , 'dummyimage.com/100x100/000/' , 'Y' );
INSERT INTO ATTACHMENT ( NO ,REF_NO ,ORIGIN_NAME ,CHANGE_NAME ,FILE_PATH ,THUMBNAIL_YN ) VALUES ( SEQ_ATTACHMENT_NO.NEXTVAL , 4 , '첨부파일8.PNG' , 'fff.png&text=sample' , 'dummyimage.com/100x100/000/' , 'N' );
INSERT INTO ATTACHMENT ( NO ,REF_NO ,ORIGIN_NAME ,CHANGE_NAME ,FILE_PATH ,THUMBNAIL_YN ) VALUES ( SEQ_ATTACHMENT_NO.NEXTVAL , 5 , '첨부파일9.PNG' , 'fff.png&text=sample' , 'dummyimage.com/100x100/000/' , 'Y' );
INSERT INTO ATTACHMENT ( NO ,REF_NO ,ORIGIN_NAME ,CHANGE_NAME ,FILE_PATH ,THUMBNAIL_YN ) VALUES ( SEQ_ATTACHMENT_NO.NEXTVAL , 5 , '첨부파일10.PNG' , 'fff.png&text=sample' , 'dummyimage.com/100x100/000/' , 'N' );
INSERT INTO ATTACHMENT ( NO ,REF_NO ,ORIGIN_NAME ,CHANGE_NAME ,FILE_PATH ,THUMBNAIL_YN ) VALUES ( SEQ_ATTACHMENT_NO.NEXTVAL , 6 , '첨부파일11.PNG' , 'fff.png&text=sample' , 'dummyimage.com/100x100/000/' , 'Y' );
INSERT INTO ATTACHMENT ( NO ,REF_NO ,ORIGIN_NAME ,CHANGE_NAME ,FILE_PATH ,THUMBNAIL_YN ) VALUES ( SEQ_ATTACHMENT_NO.NEXTVAL , 6 , '첨부파일12.PNG' , 'fff.png&text=sample' , 'dummyimage.com/100x100/000/' , 'N' );
COMMIT;


-- 데이터 (REPLY)
INSERT INTO REPLY(NO, REF_NO, CONTENT, WRITER_NO) VALUES(SEQ_REPLY_NO.NEXTVAL, 1, '댓글내용ㅋㅋㅋ1', 0);
INSERT INTO REPLY(NO, REF_NO, CONTENT, WRITER_NO) VALUES(SEQ_REPLY_NO.NEXTVAL, 1, '댓글내용ㅋㅋㅋ2', 0);
INSERT INTO REPLY(NO, REF_NO, CONTENT, WRITER_NO) VALUES(SEQ_REPLY_NO.NEXTVAL, 1, '댓글내용ㅋㅋㅋ3', 0);
INSERT INTO REPLY(NO, REF_NO, CONTENT, WRITER_NO) VALUES(SEQ_REPLY_NO.NEXTVAL, 1, '댓글내용ㅋㅋㅋ4', 0);
INSERT INTO REPLY(NO, REF_NO, CONTENT, WRITER_NO) VALUES(SEQ_REPLY_NO.NEXTVAL, 1, '댓글내용ㅋㅋㅋ5', 0);
COMMIT;


SELECT 
    G.NO AS GALLERY_NO 
    , G.TITLE 
    , G.WRITER_NO 
    , G.HIT 
    , G.ENROLL_DATE 
    , G.MODIFY_DATE 
    , G.STATUS 
    , A.NO              AS ATTACHMENT_NO 
    , A.REF_NO 
    , A.ORIGIN_NAME 
    , A.CHANGE_NAME 
    , A.FILE_PATH 
    , M.NICK AS WRITER_NICK 
FROM GALLERY G JOIN MEMBER M ON G.WRITER_NO = M.NO 
JOIN ATTACHMENT A ON G.NO = A.REF_NO 
WHERE G.STATUS = 'O' ORDER BY G.NO DESC;
