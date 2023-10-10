/*
    <SUBQUERY>
        �ϳ��� SQL �� �ȿ� ���Ե� �� �ٸ� SQL ���� ���Ѵ�. 
        ���� ����(���� ����)�� �����ϴ� ������ �ϴ� �������̴�.
*/

SELECT *
FROM ( SELECT * FROM EMPLOYEE );

SELECT (SELECT 10 FROM DUAL)+20
FROM DUAL;

-- ���ö ����� ���� �μ� ������� ����� ��ȸ
SELECT EMP_NAME
FROM EMPLOYEE
WHERE DEPT_CODE = (
                    SELECT DEPT_CODE
                    FROM EMPLOYEE
                    WHERE EMP_NAME = '���ö'
                    );

/*
    <���� ���� ����>
        ���� ������ ���� ������ ������ ������� ��� ���� ������ ���� �з��� �� �ִ�.
        
        1) ������ ���� ����        : ���� ������ ��ȸ ��� ���� ��� ���� ������ 1�� �� ��
        2) ������ ���� ����        : ���� ������ ��ȸ ��� ���� ���� ������ ���� �� �� ��
        3) ���߿� ���� ����        : ���� ������ ��ȸ ��� ���� �� �������� Į���� ������ �϶�
        4) ������, ���߿� ���� ���� : ���� ������ ��ȸ ��� ���� ������, ������ �� ��
        
        * ���� ������ ������ ���� ���� ���� �տ� �ٴ� �����ڰ� �޶�����.
*/

/*
    <������, ���Ͽ� ���� ����>
        ���� ������ ��ȸ ��� ���� ��� ���� ������ 1�� �� �� (������, ���Ͽ�)
        �� ������(������ ������) ��� ���� (=, !=, <>, ^=, >, <, >=, <=, ...)
*/

-- 1) �� ������ ��� �޿����� �޿��� ���� �޴� �������� �̸�, ���� �ڵ�, �޿� ��ȸ
SELECT 
    EMP_NAME
    , JOB_CODE
    , SALARY
FROM EMPLOYEE
WHERE SALARY < (
                SELECT AVG(SALARY)
                FROM EMPLOYEE
                );

-- 2) ���� �޿��� �޴� ������ �̸�, �޿� ��ȸ
SELECT EMP_NAME, SALARY
FROM EMPLOYEE
WHERE SALARY = (
                SELECT MIN(SALARY)
                FROM EMPLOYEE
                );   

-- 3) ���ö ����� �޿����� �� ���� �޿��� �޴� ������� �����, �޿� ��ȸ
SELECT EMP_NAME, SALARY
FROM EMPLOYEE
WHERE SALARY > (
                SELECT SALARY
                FROM EMPLOYEE
                WHERE EMP_NAME = '���ö'
                );
                
-- 4) �μ��� �޿��� ���� ���� ū �μ��� �μ� �ڵ�, �޿��� �� ��ȸ


SELECT DEPT_CODE, SUM(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE
HAVING SUM(SALARY) = (
                        SELECT MAX(SUM(SALARY))
                        FROM EMPLOYEE
                        GROUP BY DEPT_CODE
                        );

-- 5) ������ ����� �����ִ� �μ����� ��ȸ (��, ������ ����� ����)              
SELECT 
    E.EMP_ID            AS ���
    , E.EMP_NAME        AS ����̸�
    , E.PHONE           AS ��ȭ��ȣ
    , J.JOB_NAME        AS ���޸�
    , D.DEPT_TITLE      AS �μ���
    , E.HIRE_DATE       AS �Ի���
FROM EMPLOYEE E
JOIN JOB J ON E.JOB_CODE = J.JOB_CODE
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
WHERE DEPT_CODE = (
                    SELECT DEPT_CODE
                    FROM EMPLOYEE
                    WHERE EMP_NAME = '������' 
                    )
                    AND EMP_NAME != '������';

/*
    <������ ���� ����>
        ���� ������ ��ȸ ��� ���� ���� ������ ���� �� �� ��
        
        IN / NOT IN (���� ����) : ���� ���� ����� �߿��� �� ���� ��ġ�ϴ� ���� �ִٸ� Ȥ�� ���ٸ� TRUE�� �����Ѵ�.
        ANY : ���� ���� ���� �߿��� �� ���� �����ϸ� TRUE, IN�� �ٸ� ���� �� �����ڸ� �Բ� ����Ѵٴ� ���̴�. 
            ANY(100, 200, 300)
            SALARY = ANY(...)  : IN�� ���� ���
            SALARY != ANY(...) : NOT IN�� ���� ���
            SALARY > ANY(...)  : �ּҰ� ���� ũ�� TRUE
            SALARY < ANY(...)  : �ִ밪 ���� ������ TRUE
        ALL : ���� ���� ���� ��ο� ���Ͽ� �����ؾ� TRUE, IN�� �ٸ� ���� �� �����ڸ� �Բ� ����Ѵٴ� ���̴�.
            ALL(100, 200, 300)
            SALARY > ALL(...)  : �ִ밪 ���� ũ�� TRUE
            SALARY < ALL(...)  : �ּҰ� ���� ������ TRUE
*/

-- �μ��� �ְ� �޿��� �޴� ������ �̸�, �޿�, �μ��ڵ�
SELECT EMP_NAME, SALARY, DEPT_CODE
FROM EMPLOYEE
WHERE SALARY IN (
                    SELECT MAX(SALARY)
                    FROM EMPLOYEE
                    GROUP BY DEPT_CODE
                );

-- �λ���� �ִ� ����� ���, �̸� ��ȸ
SELECT EMP_ID AS ���, EMP_NAME AS �̸�
FROM EMPLOYEE
WHERE EMP_ID IN (
                  SELECT DISTINCT(MANAGER_ID)
                  FROM EMPLOYEE 
                  WHERE MANAGER_ID IS NOT NULL
                 );

-- �븮 ������ ����� ��,
-- ���� ������ �ּ� �޿����� ���� �޴� ����
-- ����, �����, �޿�
SELECT J.JOB_CODE AS ����, E.EMP_NAME AS �����, E.SALARY AS �޿�
FROM EMPLOYEE E
JOIN JOB J ON E.JOB_CODE = J.JOB_CODE
WHERE J.JOB_NAME = '�븮' 
AND SALARY > ANY (
                    SELECT E.SALARY
                    FROM EMPLOYEE E
                    JOIN JOB J ON E.JOB_CODE = J.JOB_CODE
                    WHERE J.JOB_NAME = '����' 
                  );

-- ���� �� �������� 

-- ������ ����� ���� �μ��ڵ�, ���� �����ڵ� �� �ش��ϴ� ��� �̸�, �μ��ڵ�, �����ڵ� ��ȸ
SELECT EMP_NAME, DEPT_CODE, JOB_CODE
FROM EMPLOYEE
WHERE (DEPT_CODE, JOB_CODE) = (
                                SELECT DEPT_CODE, JOB_CODE
                                FROM EMPLOYEE
                                WHERE EMP_NAME = '������'
                                );

-- ������, ���߿� ��������

-- �ζ��� �� (FROM �� �ڿ� �������� �ۼ�)
SELECT *
FROM (SELECT * FROM EMPLOYEE)
;

SELECT *
FROM EMPLOYEE
ORDER BY EMP_ID;

-- TOP-N
SELECT *
FROM (
        SELECT ROWNUM AS RNUM, EMP_ID, EMP_NAME, SALARY
        FROM (
                SELECT EMP_ID, EMP_NAME, SALARY
                FROM EMPLOYEE 
                ORDER BY SALARY DESC
                )
        )
WHERE RNUM BETWEEN 4 AND 6;


-- WITH

/*
    <RANK �Լ�>
        [ǥ����]
            RANK() OVER(���� ����) / DENSE_RANK() OVER(���� ����)
        
         RANK() OVER(���� ����)         : ������ ���� ������ ����� ������ �ο�����ŭ �ǳʶٰ� ������ ����Ѵ�.
                                         (EX. ���� 1���� 2���̸� ���� ������ 3��)
         DENSE_RANK() OVER(���� ����)   : ������ ���� ������ ����� ������ 1�� �����Ѵ�.
                                         (EX. ���� 1���� 2���̸� ���� ������ 2��)
*/

--�޿� ���� ������ ���� �ű��
-- �޿�����, �����, �޿�
SELECT *
FROM (
        SELECT
            DENSE_RANK()OVER (ORDER BY SALARY DESC) AS �޿�����
            , EMP_NAME
            , SALARY
        FROM EMPLOYEE
)
WHERE �޿����� <= 3;











SELECT * FROM EMPLOYEE;
SELECT * FROM DEPARTMENT;
SELECT * FROM JOB;


