-- [II] SELECT �� - ���� ���� ���̴� DML(Data Manipulation Language) ; �˻� ���
-- 1. SELECT ���� �ۼ���
-- ���� ���� (���� : ctrl + Enter)
SHOW USER; 
SELECT * FROM TAB; -- �� ����(scott)�� ������ �ִ� ���̺�
SELECT * FROM EMP; -- EMP ���̺��� ��� ��(�ʵ�), ��� ��
SELECT * FROM DEPT; -- DEPT���̺��� ��� ��, ��� ��
-- EMP ���̺��� ����
DESC EMP;
DESC DEPT;

-- 2. SELECT�� ����(Ư�� ���� ���)
SELECT EMPNO, ENAME, SAL, JOB FROM EMP;
SELECT EMPNO AS "�� ��", ENAME AS "�̸�", SAL AS "�޿�", JOB FROM EMP; -- ��Ī
SELECT EMPNO AS ���, ENAME AS �̸�, SAL AS �޿�, JOB FROM EMP;
SELECT EMPNO ���, ENAME �̸�, SAL �޿�, JOB FROM EMP;
SELECT EMPNO "�� ��", ENAME "�� ��", SAL "�� ��", JOB FROM EMP;
SELECT EMPNO NO, ENAME NAME, SAL SALARY FROM EMP; -- TITLE : NO, NAME, SALARY

