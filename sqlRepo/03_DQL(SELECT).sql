--DQL (SELECT)

/*
    DQL : Data Query Language == SELECT
    <SELECT>
        [����]
            SELECT Į��1, Į��2, ...
            FROM ���̺��;
            
        - �����͸� ��ȸ�� �� ���
        - ��ȸ�� ����� RESULT SET (�������) ���� ǥ���ȴ�.
        - ���̺� ���� Į���� ��ȸ�ϸ� �ȵ�
*/

--EMPLOYEE ���̺��� ��ü ����� ���(EMP_ID), �̸�(EMP_NAME), ����(SALARY)�� ��ȸ
SELECT EMP_ID, EMP_NAME, SALARY
FROM EMPLOYEE;

--EMPLOYEE ���̺��� ��ü ����� ��� �÷�(*) ���� ��ȸ
SELECT *
FROM EMPLOYEE;

--������ ��ҹ��� ��� X (�Ϲ������� �빮�ڸ� ��ȣ)

/*
    <�������>
    SELECT ������ ��� ���� ����
*/

--�̸�, ���� ��ȸ
SELECT EMP_NAME, SALARY * 12
FROM EMPLOYEE;

--���ʽ� �����ؼ� ��ȸ
--������� ��, NULL���� �����ϸ� ������� ������ NULL
SELECT EMP_NAME, SALARY * 12 + SALARY*BONUS
FROM EMPLOYEE;

--EMPLOYEE ���̺��� ������, �Ի���(HIRE_DATE), �ٹ��ϼ�(���� ��¥ - �Ի���)
--DATE ���� �� ���� ����
--����ð�: SYSDATE
SELECT EMP_NAME, HIRE_DATE, SYSDATE - HIRE_DATE "�ٹ� �ϼ�"
FROM EMPLOYEE;

--Į���� ��Ī ���̱�(AS �̿��ؼ� OR AS �����ؼ� �ۼ��ص� ������.)

/*
   <���ͷ�>
      SELECT ������ ���ͷ��� ��� ����
*/

SELECT EMP_NAME,EMAIL, 123, 'ABC'
FROM EMPLOYEE;

--����
--��� ���̺��� ��� ����� ��� ���� ��ȸ
SELECT *
FROM EMPLOYEE;

--����
--��� ���̺��� ��� ����� �̸�, �̸���, ��ȭ��ȣ ��ȸ
SELECT EMP_NAME, EMAIL, PHONE
FROM EMPLOYEE;

--����
--��� ���̺��� ��� ����� �̸�, ����, ���� ��ȸ
--(������ ����*12 �� ���)
--(��, ���� ��ȸ ����� Į�� ��Ī�� �������� ����)
SELECT EMP_NAME, SALARY, SALARY*12 AS "����"
FROM EMPLOYEE;

--����
--��� ���̺��� ��� ����� �����ڵ�(JOB_CODE) ��ȸ
SELECT JOB_CODE
FROM EMPLOYEE;

/*
    <DISTINCT>
        - �ߺ��� ����
        - SELECT ������ �ѹ��� ��� ����
        - Į���� ���������? ��� �����ؾ� �ߺ����� �Ǵ�
*/

--���� �ڵ� ��ȸ (�ߺ�����)
SELECT DISTINCT JOB_CODE
FROM EMPLOYEE;

--�μ� �ڵ� ��ȸ (�ߺ�����)
SELECT DISTINCT DEPT_CODE
FROM EMPLOYEE;

--�����ڵ�, �μ��ڵ� ��ȸ
SELECT DISTINCT JOB_CODE, DEPT_CODE
FROM EMPLOYEE;

/*
    <���� ������>
        ���� Į�� ���� ��������
        ���ͷ� ���� ���� ����
        Į���� ���ͷ��� ���� ����
*/

--���, �����, �޿� ��ȸ
SELECT EMP_ID ||'����� ���� ' ||  EMP_NAME ||' ����� �޿��� '|| SALARY || '�Դϴ�.'
FROM EMPLOYEE;

-----------------------------------------------------------------------------

/*
    <WHERE>
        [����]
            SELECT Į��, ~~~
            FROM ���̺��
            WHERE ���ǽ�;
            
        - ��ȸ�Ϸ��� ROW �� ������ �����ؾ� ��ȸ
        - ���ǽĿ��� ������ ��� ����
*/

--�μ��ڵ尡 D9 �� �ƴ� ������� ��� Į�� ��ȸ
SELECT *
FROM EMPLOYEE
WHERE DEPT_CODE != 'D9';

--ORACLE ������ !=, ^=, <> �� ��ȣ ��� ���� �ǹ̸� ������.

--EMPLOYEE ���̺��� �޿��� 400���� �̻��� ��������
--������, �μ� �ڵ�, �޿� ��ȸ
SELECT EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY >= 4000000;

------------------ �ǽ� ���� -----------------
-- 1. EMPLOYEE ���̺��� ���� ��(ENT_YN �÷� ���� 'N')�� �������� ���, �̸�, �Ի��� ��ȸ 
SELECT JOB_CODE as "���", EMP_NAME as "�̸�" , HIRE_DATE as "�Ի���"
FROM EMPLOYEE
WHERE ENT_YN = 'N';

-- 2. EMPLOYEE ���̺��� ������ 5000���� �̻��� ������ ������, �޿�, ����, �Ի��� ��ȸ
SELECT EMP_NAME, SALARY, SALARY*12 AS "����", HIRE_DATE
FROM EMPLOYEE
WHERE SALARY*12 >=50000000;
---------------------------------------------

-- EMPLOYEE ���̺��� �μ� �ڵ尡 D6�̸鼭 �޿��� 300���� �̻��� �������� ���, ������, �μ� �ڵ�, �޿� ��ȸ
SELECT EMP_ID AS "���", EMP_NAME AS "������", DEPT_CODE AS "�μ� �ڵ�", SALARY AS "�޿�"
FROM EMPLOYEE
WHERE DEPT_CODE = 'D6' 
AND SALARY >= 3000000;

-- EMPLOYEE ���̺��� �޿��� 400���� �̻�, ���� �ڵ尡 J2�� ����� ��� �÷� ��ȸ
SELECT *
FROM EMPLOYEE
WHERE SALARY >= 4000000 
AND JOB_CODE = 'J2';

-- EMPLOYEE ���̺��� �޿��� 350���� �̻� 600���� ���ϸ� �޴� ������ ���, ������, �μ� �ڵ�, �޿� ��ȸ
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY >= 3500000 
AND SALARY <= 6000000;

/*
    <BETWEEN A AND B>
        - A �̻� B ����
*/

-- EMPLOYEE ���̺��� �޿��� 350���� �̻� 600���� ���ϸ� �޴� ������ ���, ������, �μ� �ڵ�, �޿� ��ȸ
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY BETWEEN 3500000 AND 6000000;

-- EMPLOYEE ���̺��� �޿��� 350���� �̻� 600���� ���ϰ� �ƴ� ������ ���, ������, �μ� �ڵ�, �޿� ��ȸ
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
--WHERE NOT SALARY BETWEEN 3500000 AND 6000000;  NOT�� ��ġ Į���� �յ� �ƹ����� ����!
WHERE SALARY NOT BETWEEN 3500000 AND 6000000;

-- EMPLOYEE ���̺��� �Ի��� '90/01/01' ~ '01/01/01'�� ����� ��� �÷� ��ȸ
SELECT *
FROM EMPLOYEE
WHERE HIRE_DATE BETWEEN '90/01/01' AND '01/01/01'
ORDER BY EMP_NAME;

/*
    <LIKE>
        [����]
            WHERE �񱳴���÷� LIKE 'Ư�� ����';
            
        - ���Ϸ��� �÷� ���� ������ Ư�� ���Ͽ� ������ ��� TRUE�� �����Ѵ�.
        - Ư�� ���Ͽ��� '%', '_'�� ���ϵ�ī��� ����� �� �ִ�.
          '%' : 0���� �̻�
            ex) �񱳴���÷� LIKE '����%'  => �񱳴���÷� �� �߿� '����'�� �����ϴ� ��� ���� ��ȸ�Ѵ�.
                �񱳴���÷� LIKE '%����'  => �񱳴���÷� �� �߿� '����'�� ������ ��� ���� ��ȸ�Ѵ�.
                �񱳴���÷� LIKE '%����%' => �񱳴���÷� �� �߿� '����'�� ���ԵǾ� �ִ� ��� ���� ��ȸ�Ѵ�.
                
          '_' : 1����
            ex) �񱳴���÷� LIKE '_����'  => �񱳴���÷� �� �߿� '����'�տ� ������ �� ���ڰ� ���� ��� ���� ��ȸ�Ѵ�.
                �񱳴���÷� LIKE '__����' => �񱳴���÷� �� �߿� '����'�տ� ������ �� ���ڰ� ���� ��� ���� ��ȸ�Ѵ�.
*/

-- EMPLOYEE ���̺��� ���� �� ���� ����� �����, �޿�, �Ի��� ��ȸ
SELECT EMP_NAME, SALARY, HIRE_DATE
FROM EMPLOYEE
WHERE EMP_NAME LIKE '��%';

-- EMPLOYEE ���̺��� �̸� �߿� '��'�� ���Ե� ����� ���Į�� ��ȸ
SELECT *
FROM EMPLOYEE
WHERE EMP_NAME LIKE '%��%';

-- EMPLOYEE ���̺��� ��ȭ��ȣ 4��° �ڸ��� 9�� �����ϴ� ����� ���Į�� ��ȸ
SELECT *
FROM EMPLOYEE
WHERE PHONE LIKE '___9%';

--EMPLOYEE ���̺��� �̸��� �� _ �� ���ڰ� 3�ڸ��� �̸��� �ּҸ� ���� ����� ��� �����, �̸��� ��ȸ
-- ex) sun_di@kh.or.kr, yoo_js@kh.or.kr, ...
SELECT EMP_ID, EMP_NAME, EMAIL
FROM EMPLOYEE
WHERE EMAIL LIKE '___#_%' ESCAPE '#';  --ESCAPE ���ڷ� ���� ������ �־��ְ�, ESCAPE ���ڰ� ���� �����ϴ� ���� �ۼ��ϸ� �ȴ�!!

------------------- �ǽ� ���� -------------------
-- 1. EMPLOYEE ���̺��� ��ȭ��ȣ ó�� 3�ڸ��� 010�� �ƴ� ����� �̸�, ��ȭ��ȣ ��ȸ
SELECT EMP_NAME, PHONE
FROM EMPLOYEE
WHERE NOT PHONE LIKE '010%';

-- 2. DEPARTMENT ���̺��� �ؿܿ����ο� ���� ��� �÷� ��ȸ
SELECT *
FROM DEPARTMENT
WHERE DEPT_TITLE LIKE '�ؿܿ���%';
------------------------------------------------

/*
    <IS NULL / IS NOT NULL>
        [����]
            WHERE �񱳴���÷� IS [NOT] NULL;
            
        - �÷� ���� NULL�� ���� ��� NULL �� �񱳿� ���ȴ�.
          IS NULL : �񱳴���÷� ���� NULL�� ��� TRUE�� �����Ѵ�.
          IS NOT NULL : �񱳴���÷� ���� NULL�� �ƴ� ��� TRUE �����Ѵ�.
*/ 

-- EMPLOYEE ���̺��� ���ʽ��� ���� �ʴ� ����� ���, �����, �޿� ��ȸ
SELECT *
FROM EMPLOYEE 
--WHERE BONUS = NULL;  --NULL �� �񱳿��� �Ұ���
WHERE BONUS IS NULL;

--EMPLOYEE ���̺��� ������(���)�� �ִ� ��� �̸�, �μ� �ڵ� ��ȸ 
SELECT EMP_NAME, DEPT_CODE
FROM EMPLOYEE
WHERE MANAGER_ID IS NOT NULL;

--�μ��� ����, ���ʽ��� �޴�, ��� �÷� ��ȸ
SELECT *
FROM EMPLOYEE
WHERE DEPT_CODE IS NULL
AND BONUS IS NOT NULL;

/*
    <IN>
        [����]
            WHERE �񱳴���÷� IN('��', '��', '��', ..., '��');
        
        - �� ��� �߿� ��ġ�ϴ� ���� ���� �� TRUE �����Ѵ�.
*/
--�μ��ڵ� D5, D6, D8 �� �ش��ϴ� ������� ����÷� ��ȸ
SELECT *
FROM EMPLOYEE
WHERE DEPT_CODE IN ('D5', 'D6', 'D8');

/*
    <������ �켱����>
        0. ()
        1. ��� ������
        2. ���� ������
        3. �� ������
        4. IS NULL, LIKE, IN
        5. BETWEEN AND
        6. �� ������ - NOT
        7. �� ������ - AND
        8. �� ������ - OR
*/

/*
    <ORDER BY>
        [����]
            SELECT �÷�, �÷�, ..., �÷�
              FROM ���̺��
             WHERE ���ǽ�
          ORDER BY ���Ľ�Ű���� �ϴ� �÷���|��Ī|�÷� ���� [ASC|DESC] [NULLS FIRST | NULLS LAST];
          
        - SELECT ������ ���� �������� �����ϴ� �������� ���� ���� ���� �������� ����ȴ�.
        - ASC : ������������ �����Ѵ�. (ASC �Ǵ� DESC ���� �� �⺻��)
        - DESC : ������������ �����Ѵ�.
        - NULLS FIRST : �����ϰ��� �ϴ� �÷� ���� NULL�� �ִ� ��� �ش� ������ ���� �� ������ �����Ѵ�.
        - NULLS LAST : �����ϰ��� �ϴ� �÷� ���� NULL�� �ִ� ��� �ش� ������ ���� �� �ڷ� �����Ѵ�.
*/

-- EMPLOYEE ���̺��� BONUS�� �������� ����
SELECT *
FROM EMPLOYEE
ORDER BY BONUS ASC NULLS FIRST; --������ �⺻�� ASC, ASC �� �⺻������ NULLS LAST

-- EMPLOYEE ���̺��� BONUS�� �������� ����(��, BONUS ���� ��ġ�� ��� �׶��� SALARY ������ ������������)
SELECT *
FROM EMPLOYEE
ORDER BY BONUS DESC, SALARY;

-- EMPLOYEE ���̺��� ������ ������������ ���ĵ� ����� �����, ���� ��ȸ
SELECT EMP_NAME, SALARY*12 AS "����"
FROM EMPLOYEE
ORDER BY "����" DESC;














