-- VIEW

/*
    <VIEW>
        SELECT 문을 저장할 수 있는 객체이다.(논리적인 가상 테이블)
        데이터를 저장하고 있지 않으며 테이블에 대한 SQL만 저장되어 있어 VIEW 접근할 때 SQL을 수행하면서 결과값을 가져온다.
        
        [문법]
            CREATE [OR REPLACE] VIEW 뷰명
            AS 서브 쿼리;
*/

SELECT EMP_NAME, DEPT_CODE
FROM EMPLOYEE;

--DROP VIEW V_EMPLOYEE;
CREATE OR REPLACE VIEW V_EMPLOYEE
AS 
SELECT E.EMP_NAME, D.DEPT_TITLE
FROM EMPLOYEE E
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID;

GRANT CREATE VIEW TO C##KH;

SELECT * FROM V_EMPLOYEE;

/*
    <뷰 칼럼에 별칭 부여>
        서브 쿼리의 SELECT 절에 함수나 산술연산이 기술되어 있는 경우 반드시 별칭을 지정해야 한다.
*/

/*
    <VIEW를 이용해서 DML(INSERT, UPDATE, DELETE) 사용>
        뷰를 통해 데이터를 변경하게 되면 실제 데이터가 담겨있는 기본 테이블에도 적용된다.
*/

/*
    <DML 구문으로 VIEW 조작이 불가능한 경우>
    --  1) 뷰 정의에 포함되지 않는 칼럼을 조작하는 경우
    --  2) 뷰에 포함되지 않은 칼럼 중에 기본 테이블 상에 NOT NULL 제약조건이 지정된 경우
    --  3) 산술 표현식으로 정의된 경우
    --  4) 그룹 함수나 GROUP BY 절을 포함한 경우
    --  5) DISTINCT를 포함한 경우
    --  6) JOIN을 이용해 여러 테이블을 연결한 경우 
*/




