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

-- 3. Ư�� �� ��� : WHERE ��(����)-�񱳿����� ; ����(=), ũ�ų�����(>=).. �ٸ���(!=, ^=, <>)
SELECT EMPNO "���", ENAME "�̸�", SAL "�޿�" FROM EMP WHERE SAL = 3000; -- ����
SELECT EMPNO "���", ENAME "�̸�", SAL "�޿�" FROM EMP WHERE SAL != 3000; -- �ٸ���
SELECT EMPNO "���", ENAME "�̸�", SAL "�޿�" FROM EMP WHERE SAL ^= 3000; -- �ٸ���
SELECT EMPNO "���", ENAME "�̸�", SAL "�޿�" FROM EMP WHERE SAL <> 3000; -- �ٸ���
    -- �񱳿����ڴ� ����, ����, ��¥�� ��� ����
    -- ex. ����̸�(ENAME)�� 'A','B','C'�� �����ϴ� ����� ��� �ʵ�
SELECT * FROM EMP WHERE ENAME < 'D';
    -- ex. 81�⵵ ������ �Ի��� ����� ��� �ʵ�
SELECT * FROM EMP WHERE HIREDATE < '81/01/01';
    -- ex. 10�� �μ���ȣ(deptno)�� ����� ��� �ʵ带 ���
SELECT * FROM EMP WHERE DEPTNO=10;
    -- ex. �̸�(ENAME)�� FORD�� ������ EMPNO, ENAME, MGR(����� ���)�� ���
SELECT EMPNO, ENAME, MGR FROM EMP WHERE ENAME = 'FORD';
select empno, ename, mgr from emp where ename = 'FORD'; -- �����ʹ� ��ҹ��� ����

-- 4. �������� : AND, OR, NOT
    -- ex. �޿�(SAL)�� 2000�̻� 3000������ ������ ��� �ʵ�
SELECT * FROM EMP WHERE SAL>=2000 AND SAL<=3000;
    -- ex. 82�⵵�� �Ի��� ����� ��� �ʵ�
SELECT * FROM EMP WHERE HIREDATE >= '82/01/01' AND HIREDATE<= '82/12/31';
-- ��¥ ǥ��� ���� (���� : YY/MM/DD OR RR/MM/DD)
ALTER SESSION SET NLS_DATE_FORMAT = 'MM-DD-RR';
ALTER SESSION SET NLS_DATE_FORMAT = 'RR/MM/DD'; -- �ѱ��������� ���� INSTALL
SELECT ENAME, HIREDATE FROM EMP;
    -- ������ 2400 �̻��� ������ ENAME, SAL, ���� ��� (���� = SAL*12)
SELECT ENAME, SAL, SAL*12 "����" FROM EMP WHERE SAL*12 > 2400;
SELECT ENAME, SAL, SAL*12 "����" FROM EMP WHERE ����>2400; -- WHERE������ ��Ī�� �� �� ����
SELECT ENAME, SAL, SAL*12 "����" 
    FROM EMP 
    WHERE SAL*12>2400 
    ORDER BY ����; -- ORDER BY������ ��Ī ��� ����
    -- 10�� �μ�(DEPTNO)�̰ų� ��å(JOB)�� MANAGER�� ����� ��� �ʵ�
SELECT * FROM EMP WHERE DEPTNO=10 OR JOB='MANAGER';
    -- �μ���ȣ�� 10���� �ƴ� ����� ��� �ʵ�
SELECT * FROM EMP WHERE DEPTNO != 10;
SELECT * FROM EMP WHERE NOT DEPTNO=10;

-- 5. ���ǥ����
SELECT ENAMEK, SAL "����޿�", SAL+100 "�ø��޿�" FROM EMP WHERE DEPTNO=10;
    -- ex. ��� ����� �̸�(ENAME), ����(SAL), ��(COMM), ����(SAL*12+COMM)
    -- ��������� ����� NULL�����ϸ� ����� NULL
    -- NVL(NULL�� ���� �ִ� �ʵ��, ��ġ��) �ݵ�� �Ű����� ���� Ÿ�� ���ƾ� ��
SELECT ENAME, SAL, COMM, SAL*12+COMM FROM EMP;
SELECT ENAME, SAL, COMM, SAL*12+NVL(COMM, 0) FROM EMP;
    -- ��� ����� �����(ENAME), ����� ���(MGR)�� ���(�������� 0)
SELECT ENAME, NVL(MGR, 0) FROM EMP;
SELECT ENAME, NVL(MGR, '����') FROM EMP; -- NVL �Ű����� Ÿ�� ����ġ ����









