--����� ���� ����

--���� �ּ�

/*
    ������
    �ּ�
    ����
*/

--����� ���� ���� (������ �������θ� ����)
--[����]
--CREATE USER ������ IDENTIFIED BY ��й�ȣ;
CREATE USER C##KH IDENTIFIED BY 1234;

--���� �ο�
--[����]
--GRANT ����1, ����2, ... TO ������;
GRANT RESOURCE, CONNECT TO C##KH;

--���� ����
--REVOKE
REVOKE RESOURCE FROM C##KH;

--Ȯ��
SELECT *
FROM ROLE_SYS_PRIVS;















