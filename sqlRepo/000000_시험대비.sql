/*
- ���ӱ��� (grant�� �ο����ִ� ��)
- �Ϲ� ����ڷδ� ���Ѻο� �ȵ�!!!!! ������ �ִ� �����Ͱ������� ���Ѻο��ؾ���
- resource: ���̺��� ���� �� �ְ� ����
- connect : ���ӱ��� �ο�
- �����ڵ� ���� �˻��ؼ� �ذ� �����ؾ���
- ���ʽ��� �޴� ��� ��ȸ
- �̸��� �ּ� �տ� _ �� 3�� �ִ� ��� ��ȸ
- ���ڸ� ��ȸ (�ֹι�ȣ ���ڸ� 1)
- �μ� ��� �޿��� 300���� �̻��� �μ� ��ȸ
- ������ ���� ���� 5�� ��ȸ *ROWNUM ���
- �����, �����ڵ�, ���޸� ��ȸ
*/

-- ���ο� ���� �����
CREATE USER �����̸� IDENTIFIED BY ���;

-- ���ӱ��� 
GRANT ����1, ����2, ... TO �����̸�;

--RESOURCE : ���̺��� ���� �� �ְ� ����
--CONNECT : ���ӱ��� �ο�
-- �����ڵ� ���� �˻��ؼ� �ذ� �����ؾ���

-- ���ʽ��� �޴� ��� ��ȸ
SELECT *
FROM EMPLOYEE
WHERE BONUS IS NOT NULL;

-- �̸��� �ּ� �տ� _ �� 3�� �ִ� ��� ��ȸ
SELECT *
FROM EMPLOYEE
WHERE EMAIL LIKE '___#_%' ESCAPE '#';

-- ���ڸ� ��ȸ (�ֹι�ȣ ���ڸ� 1)
SELECT *
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO,8,1) = 1;

-- �μ� ��� �޿��� 300���� �̻��� �μ� ��ȸ
SELECT 
    D.DEPT_TITLE
    , AVG(SALARY)
FROM EMPLOYEE E
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
GROUP BY D.DEPT_TITLE
HAVING AVG(SALARY)>=3000000;

-- ������ ���� ���� 5�� ��ȸ *ROWNUM ��� 
-- ROWNUM �� SELECT ���� ����ϴ� ���� ��ȣ�� ��Ÿ���� ��
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

-- �����, �����ڵ�, ���޸� ��ȸ
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













