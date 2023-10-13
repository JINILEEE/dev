/*
- 접속권한 (grant로 부여해주는 것)
- 일반 사용자로는 권한부여 안됨!!!!! 권한이 있는 마스터계정으로 권한부여해야함
- resource: 테이블을 만들 수 있게 해줌
- connect : 접속권한 부여
- 에러코드 보고 검색해서 해결 가능해야함
- 보너스를 받는 사원 조회
- 이메일 주소 앞에 _ 가 3개 있는 사원 조회
- 남자만 조회 (주민번호 뒷자리 1)
- 부서 평균 급여가 300만원 이상인 부서 조회
- 월급이 높은 상위 5명 조회 *ROWNUM 사용
- 사원명, 직급코드, 직급명 조회
*/

-- 새로운 계정 만들기
CREATE USER 계정이름 IDENTIFIED BY 비번;

-- 접속권한 
GRANT 권한1, 권한2, ... TO 계정이름;

--RESOURCE : 테이블을 만들 수 있게 해줌
--CONNECT : 접속권한 부여
-- 에러코드 보고 검색해서 해결 가능해야함

-- 보너스를 받는 사원 조회
SELECT *
FROM EMPLOYEE
WHERE BONUS IS NOT NULL;

-- 이메일 주소 앞에 _ 가 3개 있는 사원 조회
SELECT *
FROM EMPLOYEE
WHERE EMAIL LIKE '___#_%' ESCAPE '#';

-- 남자만 조회 (주민번호 뒷자리 1)
SELECT *
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO,8,1) = 1;

-- 부서 평균 급여가 300만원 이상인 부서 조회
SELECT 
    D.DEPT_TITLE
    , AVG(SALARY)
FROM EMPLOYEE E
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
GROUP BY D.DEPT_TITLE
HAVING AVG(SALARY)>=3000000;

-- 월급이 높은 상위 5명 조회 *ROWNUM 사용 
-- ROWNUM 은 SELECT 절에 사용하는 행의 번호를 나타내는 것
SELECT 
    ROWNUM
    , EMP_ID
    , EMP_NAME
    , SALARY
FROM (
        SELECT 
            EMP_ID
            , EMP_NAME
            , SALARY
        FROM EMPLOYEE
        ORDER BY SALARY DESC
        )
WHERE ROWNUM <= 5;

--------------------------------

SELECT *
FROM (
        SELECT ROWNUM, EMP_ID, EMP_NAME, SALARY
        FROM (
                SELECT EMP_ID, EMP_NAME, SALARY
                FROM EMPLOYEE 
                ORDER BY SALARY DESC
                )
        )
WHERE ROWNUM BETWEEN 4 AND 6;

-- 사원명, 직급코드, 직급명 조회
SELECT 
    E.EMP_NAME
    , J.JOB_CODE
    , J.JOB_NAME
FROM EMPLOYEE E
JOIN JOB J ON E.JOB_CODE = J.JOB;





CREATE TABLE DEPARTMENT(
    DEPTCODE NUMBER PRIMARY KEY,
    DEPTNAME NVARCHAR2(10) NOT NULL
);



CREATE TABLE EMPLOYEE(
    EMPNO NUMBER PRIMARY KEY,
    EMPNAME VARCHAR2(10) NOT NULL,
    DEPTNO NUMBER REFERENCES DEPARTMENT(DEPTCODE)
);


SELECT EMPNO, EMPNAME, DEPTNO, DEPTNAME
FROM EMPLOYEE
JOIN DEPARTMENT USING(DEPTNO);













