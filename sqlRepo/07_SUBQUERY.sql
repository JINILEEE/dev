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










