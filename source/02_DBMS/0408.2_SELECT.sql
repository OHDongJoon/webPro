-- [II] SELECT 문 - 가장 많이 쓰이는 DML(Data Manipulation Language) ; 검색 기능
-- 1. SELECT 문장 작성법
-- 현재 계정 (실행 : ctrl + Enter)
SHOW USER; 
SELECT * FROM TAB; -- 현 계정(scott)이 가지고 있는 테이블
SELECT * FROM EMP; -- EMP 테이블의 모든 열(필드), 모든 행
SELECT * FROM DEPT; -- DEPT테이블의 모든 열, 모든 행
-- EMP 테이블의 구조
DESC EMP;
DESC DEPT;

-- 2. SELECT문 실행(특정 열만 출력)
SELECT EMPNO, ENAME, SAL, JOB FROM EMP;
SELECT EMPNO AS "사 번", ENAME AS "이름", SAL AS "급여", JOB FROM EMP; -- 별칭
SELECT EMPNO AS 사번, ENAME AS 이름, SAL AS 급여, JOB FROM EMP;
SELECT EMPNO 사번, ENAME 이름, SAL 급여, JOB FROM EMP;
SELECT EMPNO "사 번", ENAME "이 름", SAL "급 여", JOB FROM EMP;
SELECT EMPNO NO, ENAME NAME, SAL SALARY FROM EMP; -- TITLE : NO, NAME, SALARY

