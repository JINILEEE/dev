-- 테이블 설계
CREATE TABLE DONUT_MENU (
      NAME VARCHAR2(1000)
    , PRICE VARCHAR2(1000)
    , TASTE VARCHAR2(4000));

--INSERT
INSERT INTO DONUT_MENU(NAME, PRICE, TASTE) VALUES('스트로베리 잼잼 링도넛', '3300', '상큼한 딸기 맛이 느껴지는 사랑스러운 핑크 빛의 링도넛'); 
INSERT INTO DONUT_MENU(NAME, PRICE, TASTE) VALUES('고구마 맛탕 크림 도넛', '3900', '고구마 향이 가득한 크림과 달콤한 고구마 맛탕이 토핑으로 올라간 도넛');
INSERT INTO DONUT_MENU(NAME, PRICE, TASTE) VALUES('우유 생크림 도넛', '3900', '노티드 시그니쳐 크림과 바닐라크림이 어우러진 노티드 대표 도넛');
INSERT INTO DONUT_MENU(NAME, PRICE, TASTE) VALUES('얼그레이 도넛', '3500', '노티드만의 레시피로 만들어진 얼그레이 크림으로 짙은 베르가못향을 느낄 수 있는 도넛');
INSERT INTO DONUT_MENU(NAME, PRICE, TASTE) VALUES('우도 땅콩크림 도넛', '4200', '달콤하고 고소한 우도 땅콩크림이 입 안 가득 느껴지는 제주, 청담 한정 도넛');
INSERT INTO DONUT_MENU(NAME, PRICE, TASTE) VALUES('황치즈 크림 링도넛', '3300', '고소한 치즈의 맛을 듬뿍 느낄 수 있는 황치즈 크림 링도넛');
INSERT INTO DONUT_MENU(NAME, PRICE, TASTE) VALUES('오레오 크루아상', '5400', '초코 크루아상에 오레오 쿠키를 갈아 넣어 만든 크림을 채우고 화이트 초콜릿으로 코팅 후 오레오 과자를 데코하여 만든 제품');

--UPDATE
UPDATE DONUT_MENU 
    SET PRICE = '4500'; 
    
--DELETE
DELETE DONUT_MENU
WHERE NAME = '황치즈 크림 링도넛';

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
    
INSERT INTO MOVIE_RESERVATION(TITLE, GENRE, RESERV_DATE, ROOM_NUM) VALUES ('잠', '미스테리', '2023/09/25', '1관');
INSERT INTO MOVIE_RESERVATION(TITLE, GENRE, RESERV_DATE, ROOM_NUM) VALUES ('엘리멘탈', '애니메이션', '2023/09/13', '5관');
INSERT INTO MOVIE_RESERVATION(TITLE, GENRE, RESERV_DATE, ROOM_NUM) VALUES ('존 윅4', '액션/스릴러', '2023/09/18', '2관');
INSERT INTO MOVIE_RESERVATION(TITLE, GENRE, RESERV_DATE, ROOM_NUM) VALUES ('아바타2', 'SF/액션', '2023/09/13', '3관');
INSERT INTO MOVIE_RESERVATION(TITLE, GENRE, RESERV_DATE, ROOM_NUM) VALUES ('화이트칙스', '코미디', '2023/09/20', '1관');

SELECT *
FROM MOVIE_RESERVATION;

DROP TABLE MOVIE_RESERVATION;
