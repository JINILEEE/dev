-- JOIN

/*
    <JOIN>
        �� ���� �̻��� ���̺��� �����͸� ��ȸ�ϰ��� �� �� ����ϴ� �����̴�.
        
        1. � ����(EQUAL JOIN) / ���� ����(INNER JOIN)
            �����Ű�� Į���� ���� ��ġ�ϴ� ��鸸 ���εǼ� ��ȸ�Ѵ�.(��ġ�ϴ� ���� ���� ���� ��ȸ X)
            
            1) ����Ŭ ���� ����
                [ǥ����]
                    SELECT Į��, Į��, ...
                    FROM ���̺�1, ���̺�2
                    WHERE ���̺�1.Į���� = ���̺�2.Į����;
                
                - FROM ���� ��ȸ�ϰ��� �ϴ� ���̺���� �޸�(,)�� �����Ͽ� �����Ѵ�.
                - WHERE ���� ��Ī ��ų Į���� ���� ������ �����Ѵ�.
            
            2) ANSI ǥ�� ����
                [ǥ����]
                    SELECT Į��, Į��, ...
                    FROM ���̺�1
                    [INNER] JOIN ���̺�2 ON (���̺�1.Į���� = ���̺�2.Į����);
                
                - FROM ���� ������ �Ǵ� ���̺��� ����Ѵ�.
                - JOIN ���� ���� ��ȸ�ϰ��� �ϴ� ���̺��� ��� �� ��Ī ��ų Į���� ���� ������ ����Ѵ�.
                - ���ῡ ����Ϸ��� Į������ ���� ��� ON ���� ��ſ� USING(Į����) ������ ����Ѵ�.
*/

-- �����, �μ��ڵ� ��ȸ
SELECT EMP_NAME, DEPT_CODE, DEPT_TITLE
FROM EMPLOYEE
JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
;

-- �����, �����ڵ�, ���޸� ��ȸ
SELECT EMP_NAME, E.JOB_CODE, JOB_NAME
FROM EMPLOYEE E --�� ���̺��� ��Ī�� ���� ���Ƿ� ����� �־��ָ� �ȴ�.
JOIN JOB J ON E.JOB_CODE = J.JOB_CODE;

-- NATURAL JOIN

/*
    2. ���� JOIN
        ���� ���� ���̺� �����ϴ� ��쿡 ����Ѵ�.
*/

-- ����̸�, �μ��ڵ�, �μ���, �����ڵ�
SELECT EMP_NAME, DEPT_CODE, DEPT_TITLE, NATIONAL_CODE 
FROM EMPLOYEE  
JOIN DEPARTMENT  ON DEPT_CODE = DEPT_ID
JOIN LOCATION  ON LOCATION_ID = LOCAL_CODE;

/*
    3. �ܺ� ���� (OUTER JOIN)
        ���̺� ���� JOIN �� ��ġ���� �ʴ� �൵ ���Խ��Ѽ� ��ȸ�� �����ϴ�.
        ��, �ݵ�� �����̵Ǵ� ���̺�(�÷�)�� �����ؾ� �Ѵ�. (LEFT/RIGHT/(+))
*/

-- �����, �μ��̸�
SELECT EMP_NAME AS �����, DEPT_TITLE AS �μ��̸�
FROM EMPLOYEE
LEFT OUTER JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID;

/*
    4. ī�׽þȰ�(CARTESIAN PRODUCT) / ���� ����(CROSS JOIN)
        ���εǴ� ��� ���̺��� �� ����� ���μ��� ��� ���ε� �����Ͱ� �˻��ȴ�.
        ���̺��� ����� ��� ������ ����� ������ ��� -> ����ȭ�� ����
*/

-- �μ��̸�, �����ڵ�
SELECT DEPT_TITLE, NATIONAL_CODE
FROM DEPARTMENT
CROSS JOIN LOCATION;

/*
    5. �� ����(NON EQUAL JOIN)
        ���� ���ǿ� ��ȣ(=)�� ������� �ʴ� ���ι��� �� �����̶�� �Ѵ�.
        ������ �÷� ���� ��ġ�ϴ� ��찡 �ƴ�, ���� ������ ���ԵǴ� ����� �����ϴ� ����̴�.
        ( = �̿ܿ� �� ������ >, <, >=, <=, BETWEEN AND, IN, NOT IN ���� ����Ѵ�.)
        
        -- ANSI �������δ� JOIN ON �������θ� ����� �����ϴ�. (USING ��� �Ұ�)
*/

-- �����, �޿�, �޿����
SELECT EMP_NAME, SALARY, SAL_LEVEL
FROM EMPLOYEE
JOIN SAL_GRADE ON SALARY >= MIN_SAL AND SALARY <= MAX_SAL;

/*
    6. ��ü ����(SELF JOIN)
        ���� ���̺��� �ٽ� �ѹ� �����ϴ� ��쿡 ����Ѵ�.
*/

-- �����ȣ, �����, �����ȣ, �����
SELECT 
    A.EMP_ID AS �����ȣ
    , A.EMP_NAME AS ����̸�
    , A.MANAGER_ID AS �����ȣ
    , NVL(B.EMP_NAME, '�������') AS ����̸�
FROM EMPLOYEE A
LEFT OUTER JOIN EMPLOYEE B ON A.MANAGER_ID = B.EMP_ID
ORDER BY �����ȣ;

---------------------------------------------------------------------------------
-- 1. DEPARTMENT ���̺�� LOCATION ���̺��� �����Ͽ� �μ� �ڵ�, �μ���, ���� �ڵ�, �������� ��ȸ
SELECT 
    D.DEPT_ID AS "�μ� �ڵ�"
    , D.DEPT_TITLE AS "�μ���"
    , L.LOCAL_CODE AS "���� �ڵ�"
    , L.LOCAL_NAME AS "������"
FROM DEPARTMENT D
JOIN LOCATION L ON D.LOCATION_ID = L.LOCAL_CODE;

-- 2. EMPLOYEE ���̺�� DEPARTMENT ���̺��� �����ؼ� ���ʽ��� �޴� ������� ���, �����, ���ʽ�, �μ����� ��ȸ
SELECT 
    E.EMP_ID AS ���
    , E.EMP_NAME AS �����
    , E.BONUS AS ���ʽ�
    , D.DEPT_TITLE AS �μ���
FROM EMPLOYEE E
JOIN DEPARTMENT  D ON E.DEPT_CODE = D.DEPT_ID
WHERE BONUS IS NOT NULL;

-- 3. EMPLOYEE ���̺�� DEPARTMENT ���̺��� �����ؼ� �λ�����ΰ� �ƴ� ������� �����, �μ���, �޿��� ��ȸ
SELECT
    E.EMP_NAME AS �����
    , D.DEPT_TITLE AS �μ���
    , E.SALARY AS �޿�
FROM EMPLOYEE E
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
WHERE D.DEPT_TITLE != '�λ������' OR D.DEPT_TITLE IS NULL;


-- 4. EMPLOYEE ���̺�, DEPARTMENT ���̺�, LOCATION ���̺��� �����ؼ� ���, �����, �μ���, ������ ��ȸ
SELECT 
    E.EMP_ID AS ���
    , E.EMP_NAME AS �����
    , D.DEPT_TITLE AS �μ���
    , L.LOCAL_NAME AS ������
FROM EMPLOYEE E
LEFT OUTER JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
LEFT OUTER JOIN LOCATION L ON D.LOCATION_ID = L.LOCAL_CODE;

-- 5. ���, �����, �μ���, ������, ������ ��ȸ
SELECT
    E.EMP_ID                AS ���
    , E.EMP_NAME            AS �����
    , D.DEPT_TITLE          AS �μ���
    , L.LOCAL_NAME          AS ������
    , N.NATIONAL_NAME       AS ������
FROM EMPLOYEE E 
LEFT OUTER JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
LEFT OUTER JOIN LOCATION L ON D.LOCATION_ID = L.LOCAL_CODE
LEFT OUTER JOIN NATIONAL N ON L.NATIONAL_CODE = N.NATIONAL_CODE;

-- 6. ���, �����, �μ���, ������, ������, �޿� ��� ��ȸ
SELECT
    E.EMP_ID                AS ���
    , E.EMP_NAME            AS �����
    , D.DEPT_TITLE          AS �μ���
    , L.LOCAL_NAME          AS ������
    , N.NATIONAL_NAME       AS ������
    , S.SAL_LEVEL           AS "�޿� ���"
FROM EMPLOYEE E 
LEFT OUTER JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
LEFT OUTER JOIN LOCATION L ON D.LOCATION_ID = L.LOCAL_CODE
LEFT OUTER JOIN NATIONAL N ON L.NATIONAL_CODE = N.NATIONAL_CODE
LEFT OUTER JOIN SAL_GRADE S ON E.SALARY BETWEEN S.MIN_SAL AND S.MAX_SAL;

------------------------- ���� �ǽ� ���� -------------------------
-- 1. ������ �븮�̸鼭 ASIA �������� �ٹ��ϴ� �������� ���, �����, ���޸�, �μ���, �ٹ�����, �޿��� ��ȸ�ϼ���.
--JOB_CODE : ���� (EMPLOYEE TABEL)  // JOB TABLE 

SELECT
    E.EMP_ID          AS ���
    , E.EMP_NAME      AS �����
    , J.JOB_NAME      AS ���޸�
    , D.DEPT_TITLE     AS �μ���
    , L.LOCAL_NAME    AS �ٹ�����
    , E.SALARY        AS �޿�
FROM EMPLOYEE E
LEFT OUTER JOIN JOB J ON E.JOB_CODE = J.JOB_CODE
LEFT OUTER JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
LEFT OUTER JOIN LOCATION L ON D.LOCATION_ID = L.LOCAL_CODE
WHERE J.JOB_CODE = 'J6' AND L.LOCAL_CODE = 'L1' OR 'L2';

-- 2. 70���� �̸鼭 �����̰�, ���� �� ���� �������� �����, �ֹι�ȣ, �μ���, ���޸��� ��ȸ�ϼ���.
SELECT 
    E.EMP_NAME          AS �����
    , E.EMP_NO          AS �ֹι�ȣ
    , D.DEPT_TITLE      AS �μ���
    , J.JOB_NAME        AS ���޸�
FROM EMPLOYEE E
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
JOIN JOB J ON E.JOB_CODE = J.JOB_CODE
WHERE E.EMP_NO LIKE '7______2%'
AND SUBSTR(E.EMP_NAME,1,1) = '��';

-- 3. ���ʽ��� �޴� �������� �����, ���ʽ�, ����, �μ���, �ٹ������� ��ȸ�ϼ���.
SELECT 
    E.EMP_NAME          AS �����
    , E.BONUS           AS ���ʽ�
    , E.SALARY*12       AS ����
    , D.DEPT_TITLE      AS �μ���
    , L.LOCAL_NAME          AS �ٹ�����
FROM EMPLOYEE E
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
JOIN LOCATION L ON D.LOCATION_ID = L.LOCAL_CODE;

-- 4. �ѱ��� �Ϻ����� �ٹ��ϴ� �������� �����, �μ���, �ٹ�����, �ٹ� ������ ��ȸ�ϼ���.
SELECT
    E.EMP_NAME          AS �����
    , D.DEPT_TITLE      AS �μ���
    , L.LOCAL_NAME      AS �ٹ�����
    , N.NATIONAL_NAME   AS "�ٹ� ����"
FROM EMPLOYEE E
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
JOIN LOCATION L ON D.LOCATION_ID = L.LOCAL_CODE
JOIN NATIONAL N ON L.NATIONAL_CODE = N.NATIONAL_CODE;

-- 5. �� �μ��� ��� �޿��� ��ȸ�Ͽ� �μ���, ��� �޿�(���� ó��)�� ��ȸ�ϼ���.
SELECT
    D.DEPT_TITLE AS "�μ���"
    , ROUND(AVG(E.SALARY), 0)  AS "��� �޿�"
FROM EMPLOYEE E
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
GROUP BY D.DEPT_TITLE;

-- 6. �� �μ��� �� �޿��� ���� 1000���� �̻��� �μ���, �޿��� ���� ��ȸ�Ͻÿ�.
SELECT 
    D.DEPT_TITLE AS �μ���
    , SUM(E.SALARY) AS "�޿��� ��"
FROM EMPLOYEE E
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_CODE
GROUP BY D.DEPT_TITLE
HAVING SUM(E.SALARY) > '10000000';

-- 7. ���, �����, ���޸�, �޿� ���, �������θ� ��ȸ
SELECT 
    E.EMP_ID          AS ���
    , E.EMP_NAME      AS �����
    , J.JOB_NAME      AS ���޸�
    , S.SAL_LEVEL     AS "�޿� ���"
    , E.ENT_YN        AS ��������
FROM EMPLOYEE E
JOIN JOB J ON E.JOB_CODE = J.JOB_CODE
JOIN SAL_GRADE S ON E.SALARY BETWEEN S.MIN_SAL AND S.MAX_SAL;

-- 8. ���ʽ��� ���� �ʴ� ������ �� ���� �ڵ尡 J4 �Ǵ� J7�� �������� �����, ���޸�, �޿��� ��ȸ�Ͻÿ�.
SELECT 
    E.EMP_NAME        AS �����
    , J.JOB_NAME      AS ���޸�
    , E.SALARY        AS �޿�
FROM EMPLOYEE E
JOIN JOB J ON E.JOB_CODE = J.JOB_CODE
WHERE E.JOB_CODE IN('J4', 'J7');

-- 9. �μ��� �ִ� �������� �����, ���޸�, �μ���, �ٹ� ������ ��ȸ�Ͻÿ�.
SELECT
    E.EMP_NAME          AS �����
    , J.JOB_NAME        AS ���޸�
    , D.DEPT_TITLE      AS �μ���
    , L.LOCAL_NAME      AS "�ٹ� ����"
FROM EMPLOYEE E
JOIN JOB J ON E.JOB_CODE = J.JOB_CODE
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
JOIN LOCATION L ON D.LOCATION_ID = L.LOCAL_CODE;

-- 10. �ؿܿ������� �ٹ��ϴ� �������� �����, ���޸�, �μ� �ڵ�, �μ����� ��ȸ�Ͻÿ�
SELECT
    E.EMP_NAME          AS �����
    , J.JOB_NAME        AS ���޸�
    , E.DEPT_CODE       AS "�μ� �ڵ�"
    , D.DEPT_TITLE      AS �μ���
FROM EMPLOYEE E
JOIN JOB J ON E.JOB_CODE = J.JOB_CODE
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID;

-- 11. �̸��� '��'�ڰ� ����ִ� �������� ���, �����, ���޸��� ��ȸ�Ͻÿ�.
SELECT
    E.EMP_ID            AS ���
    , E.EMP_NAME        AS �����
    , J.JOB_NAME        AS ���޸�
FROM EMPLOYEE E
JOIN JOB J ON E.JOB_CODE = J.JOB_CODE
WHERE E.EMP_NAME LIKE '%��%';



SELECT * FROM EMPLOYEE;
SELECT * FROM DEPARTMENT;
SELECT * FROM JOB;
SELECT * FROM LOCATION;
SELECT * FROM NATIONAL;
SELECT * FROM SAL_GRADE;

