-- VIEW

/*
    <VIEW>
        SELECT ���� ������ �� �ִ� ��ü�̴�.(������ ���� ���̺�)
        �����͸� �����ϰ� ���� ������ ���̺� ���� SQL�� ����Ǿ� �־� VIEW ������ �� SQL�� �����ϸ鼭 ������� �����´�.
        
        [����]
            CREATE [OR REPLACE] VIEW ���
            AS ���� ����;
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
    <�� Į���� ��Ī �ο�>
        ���� ������ SELECT ���� �Լ��� ��������� ����Ǿ� �ִ� ��� �ݵ�� ��Ī�� �����ؾ� �Ѵ�.
*/

/*
    <VIEW�� �̿��ؼ� DML(INSERT, UPDATE, DELETE) ���>
        �並 ���� �����͸� �����ϰ� �Ǹ� ���� �����Ͱ� ����ִ� �⺻ ���̺��� ����ȴ�.
*/

/*
    <DML �������� VIEW ������ �Ұ����� ���>
    --  1) �� ���ǿ� ���Ե��� �ʴ� Į���� �����ϴ� ���
    --  2) �信 ���Ե��� ���� Į�� �߿� �⺻ ���̺� �� NOT NULL ���������� ������ ���
    --  3) ��� ǥ�������� ���ǵ� ���
    --  4) �׷� �Լ��� GROUP BY ���� ������ ���
    --  5) DISTINCT�� ������ ���
    --  6) JOIN�� �̿��� ���� ���̺��� ������ ��� 
*/




