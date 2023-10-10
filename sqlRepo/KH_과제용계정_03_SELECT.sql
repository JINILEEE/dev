-- 03_SELECT(Option)

--�� ���б� ��ũ�� ����
--SQL03_SELECT(Option)

-- 1��
-- �л��̸��� �ּ����� ǥ���Ͻÿ�. ��, ��� ����� "�л� �̸�", "�ּ���"�� �ϰ�, ������ �̸����� �������� ǥ���ϵ��� �Ѵ�.
SELECT
    STUDENT_NAME        AS "�л� �̸�"
    , STUDENT_ADDRESS   AS "�ּ���"
FROM TB_STUDENT
ORDER BY STUDENT_NAME ASC;    

-- 2��
-- �������� �л����� �̸��� �ֹι�ȣ�� ���̰� ���� ������ ȭ�鿡 ����Ͻÿ�
SELECT
    STUDENT_NAME        AS "�л� �̸�"
    , STUDENT_SSN       AS �ֹι�ȣ
FROM TB_STUDENT
ORDER BY STUDENT_SSN DESC;

-- 3��
-- �ּ����� �������� ��⵵�� �л��� �� 1900��� �й��� ���� �л����� �̸��� �й�, �ּҸ� �̸��� ������������ ȭ�鿡 ����Ͻÿ�.
-- ��, ���������� "�л��̸�", "�й�", "������ �ּ�"�� ��µǵ��� �Ѵ�.
SELECT
    STUDENT_NAME        AS �л��̸�
    , STUDENT_NO        AS �й�
    , STUDENT_ADDRESS   AS "������ �ּ�"
FROM TB_STUDENT
ORDER BY STUDENT_NAME;

-- 4��
-- ���� ���а� ���� �� ���� ���̰� ���� ������� �̸��� Ȯ���� �� �ִ� SQL ������ �ۼ��Ͻÿ�.
-- (���а��� '�а� �ڵ�'�� �а� ���̺��� ��ȸ�ؼ� ã�� ������ ����)
SELECT
    P.PROFESSOR_NAME, P.PROFESSOR_SSN
FROM TB_PROFESSOR P
JOIN TB_DEPARTMENT D ON P.DEPARTMENT_NO = D.DEPARTMENT_NO
WHERE D.DEPARTMENT_NAME = '���а�'
ORDER BY PROFESSOR_SSN;

-- 5��
-- 2004�� 2�б⿡ 'C3118100' ������ ������ �л����� ������ ��ȸ�Ϸ��� �Ѵ�. 
-- ������ ���� �л����� ǥ���ϰ�,
-- ������ ������ �й��� ���� �л����� ǥ���ϴ� ������ �ۼ��� ���ÿ�.
-- ��ũ�� ����� �����ϰ� �Ҽ��� �Ʒ� 2�ڸ����� 0���� ǥ���ϱ� ���ؼ� TO_CHAR(NUMBER, 'FM9.00') ���� ���
SELECT S.STUDENT_NO, TO_CHAR(G.POINT, '99.99') AS POINT
FROM TB_STUDENT S
JOIN TB_GRADE G ON S.STUDENT_NO = G.STUDENT_NO
WHERE G.CLASS_NO = 'C3118100'
AND G.TERM_NO = '200402'
ORDER BY G.POINT DESC, S.STUDENT_NO;

-- 6��
-- �л� ��ȣ, �л� �̸�, �а� �̸��� �л� �̸����� �������� �����Ͽ� ����ϴ� SQL���� �ۼ��Ͻÿ�.
SELECT 
    S.STUDENT_NO
    , S.STUDENT_NAME
    , D.DEPARTMENT_NAME
FROM TB_STUDENT S
JOIN TB_DEPARTMENT D ON S.DEPARTMENT_NO = D.DEPARTMENT_NO
ORDER BY S.STUDENT_NAME
;

-- 7��
-- �� ������б��� ���� �̸��� ������ �а� �̸��� ����ϴ� SQL������ �ۼ��Ͻÿ�.
SELECT 
    C.CLASS_NAME
    , D.DEPARTMENT_NAME
FROM TB_CLASS C
JOIN TB_DEPARTMENT D ON C.DEPARTMENT_NO = D.DEPARTMENT_NO
ORDER BY 2, 1;

-- 8��
-- ���� ���� �̸��� ã������ �Ѵ�. ���� �̸��� ���� �̸��� ����ϴ� SQL���� �ۼ��Ͻÿ�.
SELECT 
    CC.CLASS_NAME
    , P.PROFESSOR_NAME
FROM TB_CLASS_PROFESSOR C
JOIN TB_PROFESSOR P ON C.PROFESSOR_NO = P.PROFESSOR_NO
JOIN TB_CLASS CC ON C.CLASS_NO = CC.CLASS_NO
ORDER BY 2, 1;

-- 9��
-- 8���� ��� �� '�ι� ��ȸ' �迭�� ���� ������ ���� �̸��� ã������ �Ѵ�.
-- �̿� �ش��ϴ� ���� �̸��� ���� �̸��� ����ϴ� SQL���� �ۼ��Ͻÿ�.
SELECT 
    C.CLASS_NAME
    , P.PROFESSOR_NAME
FROM TB_CLASS C
JOIN TB_DEPARTMENT D ON C.DEPARTMENT_NO = D.DEPARTMENT_NO
JOIN TB_CLASS_PROFESSOR CP ON C.CLASS_NO = CP.CLASS_NO
JOIN TB_PROFESSOR P ON CP.PROFESSOR_NO = P.PROFESSOR_NO
WHERE D.CATEGORY = '�ι���ȸ'
ORDER BY 2, 1
;

-- 10��
-- '�����а�' �л����� ������ ���Ϸ��� �Ѵ�. 
-- �����а� �л����� "�й�", "�л� �̸�", "��ü ����"�� ����ϴ� SQL ������ �ۼ��Ͻÿ�.
-- (��, ������ �Ҽ��� 1�ڸ������� �ݿø��Ͽ� ǥ���Ѵ�.)
SELECT 
    S.STUDENT_NO AS "�й�"
    , S.STUDENT_NAME AS "�л� �̸�"
    , ROUND(AVG(G.POINT), 1) AS "��ü ����"
FROM TB_STUDENT S
JOIN TB_GRADE G ON S.STUDENT_NO = G.STUDENT_NO
JOIN TB_DEPARTMENT D ON S.DEPARTMENT_NO = D.DEPARTMENT_NO
WHERE D.DEPARTMENT_NAME = '�����а�'
GROUP BY S.STUDENT_NO, S.STUDENT_NAME;

-- 11��
-- �й��� A313047�� �л��� �б��� ������ ���� �ʴ�. ���� �������� ������ �����ϱ� ���� 
-- �а� �̸�, �л� �̸��� ���� ���� �̸��� �ʿ��ϴ�.
-- �̶� ����� SQL���� �ۼ��Ͻÿ�.
SELECT 
    D.DEPARTMENT_NAME AS "�а� �̸�"
    , S.STUDENT_NAME AS "�л� �̸�"
    , P.PROFESSOR_NAME AS "���� ���� �̸�"
FROM TB_STUDENT S
JOIN TB_DEPARTMENT D ON S.DEPARTMENT_NO = D.DEPARTMENT_NO
JOIN TB_PROFESSOR P ON S.COACH_PROFESSOR_NO = P.PROFESSOR_NO
WHERE STUDENT_NO = 'A313047';

-- 12��
-- 2007�⵵�� '�ΰ������' ������ ������ �л��� ã�� 
-- �л��̸��� �����б⸦ ǥ���ϴ� SQL ������ �ۼ��Ͻÿ�.
SELECT
    S.STUDENT_NAME AS "�л� �̸�"
    , G.TERM_NO AS "���� �б�"
FROM TB_STUDENT S
JOIN TB_GRADE G ON S.STUDENT_NO = G.STUDENT_NO
JOIN TB_CLASS C ON G.CLASS_NO = C.CLASS_NO
WHERE C.CLASS_NAME = '�ΰ������'
AND G.TERM_NO LIKE '2007%';

-- 13��
-- ��ü�� �迭 ���� �� ���� ��米���� �� �� �������� ���� ������ ã�� 
-- �� ���� �̸��� �а� �̸��� ����ϴ� SQL ������ �ۼ��Ͻÿ�.
-- ��� ���� ���� �����ϳ� ���� ������ ���� �ٸ� ������ ����



SELECT * FROM TB_PROFESSOR;
SELECT * FROM TB_GRADE;
SELECT * FROM TB_CLASS;
SELECT * FROM TB_CLASS_PROFESSOR;
SELECT * FROM TB_DEPARTMENT;
SELECT * FROM TB_STUDENT;



-- 14��
-- �� ������б� ���ݾƾ��а� �л����� ���������� �Խ��ϰ��� �Ѵ�. 
-- �л��̸��� �������� �̸��� ã�� ���� ���� ������ ���� �л��� ���
-- "�������� ������"���� ǥ���ϵ��� �ϴ� SQL ���� �ۼ��Ͻÿ�. 
-- �� �������� "�л��̸�", "��������"�� ǥ���ϸ� ���й� �л��� ���� ǥ�õǵ��� �Ѵ�.


-- 15��
-- ���л��� �ƴ� �л� �� ������ 4.0 �̻��� �л��� ã�� 
-- �� �л��� �й�, �̸�, �а�, �̸�, ������ ����ϴ� SQL���� �ۼ��Ͻÿ�.


-- 16��
-- ȯ�������а� ����������� ���� �� ������ �ľ��� �� �ִ� SQL ���� �ۼ��Ͻÿ�.


-- 17��
-- �� ������б��� �ٴϰ� �ִ� �ְ��� �л��� ���� �� �л����� �̸��� �ּҸ� ����ϴ� SQL ���� �ۼ��Ͻÿ�.
SELECT STUDENT_NAME, STUDENT_ADDRESS
FROM TB_STUDENT
WHERE DEPARTMENT_NO = (SELECT DEPARTMENT_NO
                       FROM TB_STUDENT
                       WHERE STUDENT_NAME = '�ְ���');
                       
-- 18��
-- ������а����� �������� ���� ���� �л��� �̸��� �й��� ǥ���ϴ� SQL���� �ۼ��Ͻÿ�



-- 19��
-- �� ������б��� "ȯ�������а�"�� ���� ���� �迭 �а����� 
-- �а� �� �������� ������ �ľ��ϱ� ���� ������ SQL���� ã�Ƴ��ÿ�.
-- ��, �������� "�迭 �а���", "��������"���� ǥ�õǵ��� �ϰ�, 
-- ������ �Ҽ��� ���ڸ������� �ݿø��Ͽ� ǥ�õǵ��� �Ѵ�.
