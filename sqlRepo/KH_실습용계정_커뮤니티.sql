-- Ŀ�´�Ƽ

-- MEMBER
DROP TABLE MEMBER;
CREATE TABLE MEMBER (
    NO NUMBER
    , ID VARCHAR2(100)
    , PWD VARCHAR2(100)
    , NICK VARCHAR2(100)
    , ENROLL_DATE TIMESTAMP
    , QUIT_YN CHAR(1));

-- ȸ������
INSERT INTO MEMBER (NO, ID, PWD, NICK, ENROLL_DATE,QUIT_YN) VALUES (1, '���̵�', 100000, '�г���', SYSDATE,'N');
-- �α���
SELECT * FROM MEMBER WHERE ID = '���̵�' AND PWD = '���';
-- �������
UPDATE MEMBER SET PWD = '�űԺ��'
WHERE ID = '���̵�' AND PWD = '���';
-- �г��� ����
UPDATE MEMBER SET NICK = '�űԴг���'
WHERE ID = '���̵�' AND PWD = '���';
-- Ż�� --���� ���� QUIT_YN Į���� Y �� ����
UPDATE MEMBER
    SET QUIT_YN = 'Y'
    WHERE ID = '���̵�'
    AND PWD = '���';
-- ���������� ��ȸ
SELECT *
FROM MEMBER
WHERE ID = '���̵�' 
AND PWD = '���'; 

-- BOARD
DROP TABLE BOARD;
CREATE TABLE BOARD (
    NO NUMBER
    , TITLE VARCHAR2 (100)
    , CONTENT VARCHAR2(4000)
    , WRITER_NO NUMBER
    , ENROLL_DATE TIMESTAMP
    , DEL_YN CHAR(1));
    
-- �Խñ� �ۼ�
INSERT INTO BOARD(NO, TITLE, CONTENT, WRITER_NO, ENROLL_DATE, DEL_YN) VALUES (1, '����', '����', 1, SYSDATE, 'Y');
-- �Խñ� ��ü ��� ��ȸ (�Խñ�����, �ۼ��Ͻ�, �ۼ���)
SELECT TITLE, ENROLL_DATE, WRITER_NO
FROM BOARD;
-- �Խñ� ����ȸ
SELECT * 
FROM BOARD
WHERE NO = 1;
-- �Խñ� ���� �� ���� ����
UPDATE BOARD SET TITLE = '������'
WHERE WRITER_NO = 777 AND TITLE = '����';

UPDATE BOARD SET CONTENT = '������'
WHERE CONTENT = '����' AND WRITER_NO = 777;
-- �Խñ� ����
DELETE BOARD 
WHERE TITLE = '����' AND WRITER_NO = 777;
