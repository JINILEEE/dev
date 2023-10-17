-- QnA (cherry market)

/*CREATE TABLE "QNA" (
	"QNA_NO"	NUMBER		NOT NULL,
	"MEMBER_NO"	NUMBER		NOT NULL,
	"MANAGER_NO"	NUMBER		NOT NULL,
	"TITLE"	VARCHAR2(1000)		NOT NULL,
	"CONTENT"	VARCHAR2(4000)		NOT NULL,
	"MEMBER_ENROLL_DATE"	TIMESTAMP	DEFAULT SYSDATE	NULL,
	"SECRET_YN"	CHAR(1)	DEFAULT 'Y'	NULL,
	"ANSWER"	VARCHAR2(4000)		NULL,
	"MANAGER_ENROLL_DATE"	TIMESTAMP	DEFAULT SYSDATE	NULL,
	"MANAGER_EDIT_DATE"	TIMESTAMP	DEFAULT SYSDATE	NULL
);
*/

--���̺� ����
DROP TABLE QNA CASCADE CONSTRAINTS;

--������ ����
DROP SEQUENCE SEQ_QNA_NO;
CREATE SEQUENCE SEQ_QNA_NO NOCYCLE NOCACHE;

--���̺� ����
CREATE TABLE QNA (
    QNA_NO                  NUMBER              PRIMARY KEY         
    , MEMBER_NO             NUMBER             
    , MANAGER_NO            NUMBER              
    , TITLE                 VARCHAR2(1000)      NOT NULL
    , CONTENT               VARCHAR2(4000)      NOT NULL
    , MEMBER_ENROLL_DATE    TIMESTAMP           DEFAULT SYSDATE
    , SECRET_YN             CHAR(1)             DEFAULT 'Y' CHECK(SECRET_YN IN('Y', 'N'))
    , ANSWER                VARCHAR2(4000)
    , MANAGER_ENROLL_DATE   TIMESTAMP           DEFAULT SYSDATE
    , MANAGER_EDIT_DATE     TIMESTAMP           DEFAULT SYSDATE
);

COMMENT ON COLUMN "QNA"."QNA_NO" IS '�Խñ۹�ȣPK';
COMMENT ON COLUMN "QNA"."MEMBER_NO" IS '����ڹ�ȣFK';
COMMENT ON COLUMN "QNA"."MANAGER_NO" IS '�����ڹ�ȣFK';
COMMENT ON COLUMN "QNA"."TITLE" IS '����';
COMMENT ON COLUMN "QNA"."CONTENT" IS '����';
COMMENT ON COLUMN "QNA"."MEMBER_ENROLL_DATE" IS '������� �Խñ��ۼ���';
COMMENT ON COLUMN "QNA"."SECRET_YN" IS '��������';
COMMENT ON COLUMN "QNA"."ANSWER" IS '�������� �亯';
COMMENT ON COLUMN "QNA"."MANAGER_ENROLL_DATE" IS '�������� �亯 �ۼ���';
COMMENT ON COLUMN "QNA"."MANAGER_EDIT_DATE" IS '������ �亯 ���� ����';

-- �ܷ�Ű
ALTER TABLE QNA
ADD CONSTRAINT FK_QNA_MEMBER 
FOREIGN KEY(MEMBER_NO) REFERENCES MEMBER (MEMBER_NO);

ALTER TABLE QNA
ADD CONSTRAINT FK_QNA_MANAGER 
FOREIGN KEY(MANAGER_NO) REFERENCES MANAGER (MANAGER_NO);


-- ���� ������(������ �ۼ��� ������)
INSERT INTO QNA(QNA_NO, MEMBER_NO, TITLE, CONTENT) VALUES(SEQ_QNA_NO.NEXTVAL, 5, '�Խñ� ������ ������ �ֳ���?', '�Ǹ��ϰ� ���� ��ǰ�� ������ �Խñ��� � �ۼ��� �� �ִ��� �ñ��մϴ�.');
INSERT INTO QNA(QNA_NO, MEMBER_NO, TITLE, CONTENT) VALUES(SEQ_QNA_NO.NEXTVAL, 3, '�ù� �ŷ��� �����Ѱ���?', '�Ǹ��ڰ� ȸ�翡 �ǸŹ�ǰ�� �ΰ�ͼ� ���ŷ��� ��ƴٰ� �ù�� �ŷ����ڴµ� �����ұ��?');
INSERT INTO QNA(QNA_NO, MEMBER_NO, TITLE, CONTENT) VALUES(SEQ_QNA_NO.NEXTVAL, 7, '�� �Խñ��� �Ⱥ�����.', '�Ǹű��� �ۼ��ߴµ� �Խñ��� �Ⱥ��Դϴ�.');
COMMIT;



-- ���� ������(�����ڰ� �ۼ��� ���)
UPDATE QNA SET ANSWER = '�Ϸ翡 20���� �Խñ��� �ۼ� �� �� �ְ�, �� ����� 300���� �Խñ��� �ۼ��� �� �ֽ��ϴ�.' WHERE QNA_NO = 1;
UPDATE QNA SET ANSWER = '�ù� �ŷ��� �����մϴ�. �ٸ� �ù�ŷ��� �׻� ��� ������ ������ �����Ͻñ� �ٶ��ϴ�.' WHERE QNA_NO = 2;
UPDATE QNA SET ANSWER = '�ߺ��Խñ��� �ۼ��ϼ̰ų� �����Ǹž��� ���縦 ���� ��� �Խñ��� �Ⱥ��� �� �ֽ��ϴ�.' WHERE QNA_NO = 3;
COMMIT;






