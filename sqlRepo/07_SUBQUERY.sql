/*
    <SUBQUERY>
        하나의 SQL 문 안에 포함된 또 다른 SQL 문을 뜻한다. 
        메인 쿼리(기존 쿼리)를 보조하는 역할을 하는 쿼리문이다.
*/

SELECT *
FROM ( SELECT * FROM EMPLOYEE );

SELECT (SELECT 10 FROM DUAL)+20
FROM DUAL;

-- 노옹철 사원과 같은 부서 사람들의 사원명 조회
SELECT EMP_NAME
FROM EMPLOYEE
WHERE DEPT_CODE = (
                    SELECT DEPT_CODE
                    FROM EMPLOYEE
                    WHERE EMP_NAME = '노옹철'
                    );

/*
    <서브 쿼리 구분>
        서브 쿼리는 서브 쿼리를 수행한 결과값의 행과 열의 개수에 따라서 분류할 수 있다.
        
        1) 단일행 서브 쿼리        : 서브 쿼리의 조회 결과 값의 행과 열의 개수가 1개 일 때
        2) 다중행 서브 쿼리        : 서브 쿼리의 조회 결과 값의 행의 개수가 여러 행 일 때
        3) 다중열 서브 쿼리        : 서브 쿼리의 조회 결과 값이 한 행이지만 칼럼이 여러개 일때
        4) 다중행, 다중열 서브 쿼리 : 서브 쿼리의 조회 결과 값이 여러행, 여러열 일 때
        
        * 서브 쿼리의 유형에 따라서 서브 쿼리 앞에 붙는 연산자가 달라진다.
*/

/*
    <단일행, 단일열 서브 쿼리>
        서브 쿼리의 조회 결과 값의 행과 열의 개수가 1개 일 때 (단일행, 단일열)
        비교 연산자(단일행 연산자) 사용 가능 (=, !=, <>, ^=, >, <, >=, <=, ...)
*/

-- 1) 전 직원의 평균 급여보다 급여를 적게 받는 직원들의 이름, 직급 코드, 급여 조회
SELECT 
    EMP_NAME
    , JOB_CODE
    , SALARY
FROM EMPLOYEE
WHERE SALARY < (
                SELECT AVG(SALARY)
                FROM EMPLOYEE
                );

-- 2) 최저 급여를 받는 직원의 이름, 급여 조회
SELECT EMP_NAME, SALARY
FROM EMPLOYEE
WHERE SALARY = (
                SELECT MIN(SALARY)
                FROM EMPLOYEE
                );   

-- 3) 노옹철 사원의 급여보다 더 많은 급여를 받는 사원들의 사원명, 급여 조회
SELECT EMP_NAME, SALARY
FROM EMPLOYEE
WHERE SALARY > (
                SELECT SALARY
                FROM EMPLOYEE
                WHERE EMP_NAME = '노옹철'
                );
                
-- 4) 부서별 급여의 합이 가장 큰 부서의 부서 코드, 급여의 합 조회


SELECT DEPT_CODE, SUM(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE
HAVING SUM(SALARY) = (
                        SELECT MAX(SUM(SALARY))
                        FROM EMPLOYEE
                        GROUP BY DEPT_CODE
                        );

-- 5) 전지연 사원이 속해있는 부서원들 조회 (단, 전지연 사원은 제외)              
SELECT 
    E.EMP_ID            AS 사번
    , E.EMP_NAME        AS 사원이름
    , E.PHONE           AS 전화번호
    , J.JOB_NAME        AS 직급명
    , D.DEPT_TITLE      AS 부서명
    , E.HIRE_DATE       AS 입사일
FROM EMPLOYEE E
JOIN JOB J ON E.JOB_CODE = J.JOB_CODE
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
WHERE DEPT_CODE = (
                    SELECT DEPT_CODE
                    FROM EMPLOYEE
                    WHERE EMP_NAME = '전지연' 
                    )
                    AND EMP_NAME != '전지연';










