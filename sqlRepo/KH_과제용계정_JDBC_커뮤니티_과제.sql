-- ���̺� ����
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
    
-- ȸ������
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
-- �α���
SELECT * 
FROM MEMBER 
WHERE ID='USER01' 
AND PWD = '1234';
-- �������
UPDATE MEMBER 
    SET PWD = '4567' 
WHERE ID = 'USER01' 
AND PWD= '1234';
-- �г��� ����
UPDATE MEMBER 
    SET NICK = 'NICK02'
WHERE ID = 'USER01' 
AND PWD = '1234';
-- Ż��
UPDATE MEMBER
    SET QUIT_YN = 'Y'
    WHERE ID = 'USER01'
    AND PWD = '1234';
-- ���������� ��ȸ
SELECT * 
FROM MEMBER 
WHERE ID = 'USER01' 
AND PWD = '1234';

-- �Խñ� �ۼ�
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
    ,1               -- ������ ȸ����ȣ. 1��
    ,SYSDATE
    , 'N');          -- �輼�ϸ� Y �� ���濹��
-- �Խñ� ��ü ��� ��ȸ(�Խñ�����, �ۼ��Ͻ�, �ۼ���) (�ֽż����� ����)
SELECT 
    TITLE
    , ENROLL_DATE
    , WRITER_NO
FROM BOARD 
ORDER BY ENROLL_DATE DESC;
-- �Խñ� ����ȸ
SELECT *
FROM BOARD
WHERE NO = 1;     --�Խñ� ��ȣ�� �̿��Ͽ� ��ȸ
-- �Խñ� ���� �� ���� ����
UPDATE BOARD 
    SET TITLE = 'TITLE02' 
    ,CONTENT = 'CONTENT02'
WHERE NO = 1;  --1�� �Խñ� ����
-- �Խñ� ����
DELETE BOARD 
WHERE NO = 1;  --WRITER_NO �� �������� �ۼ��ϸ� �� �ۼ��ڰ� ���� ��� ���� �� ������ �Ǵ� ���̶�....

