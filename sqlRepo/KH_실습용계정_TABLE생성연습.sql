-- ���̺� ����
CREATE TABLE DONUT_MENU (
      NAME VARCHAR2(1000)
    , PRICE VARCHAR2(1000)
    , TASTE VARCHAR2(4000));

--INSERT
INSERT INTO DONUT_MENU(NAME, PRICE, TASTE) VALUES('��Ʈ�κ��� ���� ������', '3300', '��ŭ�� ���� ���� �������� ��������� ��ũ ���� ������'); 
INSERT INTO DONUT_MENU(NAME, PRICE, TASTE) VALUES('���� ���� ũ�� ����', '3900', '���� ���� ������ ũ���� ������ ���� ������ �������� �ö� ����');
INSERT INTO DONUT_MENU(NAME, PRICE, TASTE) VALUES('���� ��ũ�� ����', '3900', '��Ƽ�� �ñ״��� ũ���� �ٴҶ�ũ���� ��췯�� ��Ƽ�� ��ǥ ����');
INSERT INTO DONUT_MENU(NAME, PRICE, TASTE) VALUES('��׷��� ����', '3500', '��Ƽ�常�� �����Ƿ� ������� ��׷��� ũ������ £�� ������������ ���� �� �ִ� ����');
INSERT INTO DONUT_MENU(NAME, PRICE, TASTE) VALUES('�쵵 ����ũ�� ����', '4200', '�����ϰ� ����� �쵵 ����ũ���� �� �� ���� �������� ����, û�� ���� ����');
INSERT INTO DONUT_MENU(NAME, PRICE, TASTE) VALUES('Ȳġ�� ũ�� ������', '3300', '����� ġ���� ���� ��� ���� �� �ִ� Ȳġ�� ũ�� ������');
INSERT INTO DONUT_MENU(NAME, PRICE, TASTE) VALUES('������ ũ��ƻ�', '5400', '���� ũ��ƻ� ������ ��Ű�� ���� �־� ���� ũ���� ä��� ȭ��Ʈ ���ݸ����� ���� �� ������ ���ڸ� �����Ͽ� ���� ��ǰ');

--UPDATE
UPDATE DONUT_MENU 
    SET PRICE = '4500'; 
    
--DELETE
DELETE DONUT_MENU
WHERE NAME = 'Ȳġ�� ũ�� ������';

--SELECT
SELECT *
FROM DONUT_MENU;

DROP TABLE DONUT_MENU;

---------------------------------------------------
CREATE TABLE MOVIE_RESERVATION(
      TITLE VARCHAR2(1000)
    , GENRE VARCHAR2(100)
    , RESERV_DATE VARCHAR2 (100)
    , ROOM_NUM VARCHAR2(100)); 
    
INSERT INTO MOVIE_RESERVATION(TITLE, GENRE, RESERV_DATE, ROOM_NUM) VALUES ('��', '�̽��׸�', '2023/09/25', '1��');
INSERT INTO MOVIE_RESERVATION(TITLE, GENRE, RESERV_DATE, ROOM_NUM) VALUES ('������Ż', '�ִϸ��̼�', '2023/09/13', '5��');
INSERT INTO MOVIE_RESERVATION(TITLE, GENRE, RESERV_DATE, ROOM_NUM) VALUES ('�� ��4', '�׼�/������', '2023/09/18', '2��');
INSERT INTO MOVIE_RESERVATION(TITLE, GENRE, RESERV_DATE, ROOM_NUM) VALUES ('�ƹ�Ÿ2', 'SF/�׼�', '2023/09/13', '3��');
INSERT INTO MOVIE_RESERVATION(TITLE, GENRE, RESERV_DATE, ROOM_NUM) VALUES ('ȭ��ƮĢ��', '�ڹ̵�', '2023/09/20', '1��');

SELECT *
FROM MOVIE_RESERVATION;

DROP TABLE MOVIE_RESERVATION;
