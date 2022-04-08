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

-- 3. 특정 행 출력 : WHERE 절(조건)-비교연산자 ; 같다(=), 크거나같다(>=).. 다르다(!=, ^=, <>)
SELECT EMPNO "사번", ENAME "이름", SAL "급여" FROM EMP WHERE SAL = 3000; -- 같다
SELECT EMPNO "사번", ENAME "이름", SAL "급여" FROM EMP WHERE SAL != 3000; -- 다르다
SELECT EMPNO "사번", ENAME "이름", SAL "급여" FROM EMP WHERE SAL ^= 3000; -- 다르다
SELECT EMPNO "사번", ENAME "이름", SAL "급여" FROM EMP WHERE SAL <> 3000; -- 다르다
    -- 비교연산자는 숫자, 문자, 날짜형 모두 가능
    -- ex. 사원이름(ENAME)이 'A','B','C'로 시작하는 사원의 모든 필드
SELECT * FROM EMP WHERE ENAME < 'D';
    -- ex. 81년도 이전에 입사한 사원의 모든 필드
SELECT * FROM EMP WHERE HIREDATE < '81/01/01';
    -- ex. 10번 부서번호(deptno)인 사원의 모든 필드를 출력
SELECT * FROM EMP WHERE DEPTNO=10;
    -- ex. 이름(ENAME)이 FORD인 직원의 EMPNO, ENAME, MGR(상사의 사번)을 출력
SELECT EMPNO, ENAME, MGR FROM EMP WHERE ENAME = 'FORD';
select empno, ename, mgr from emp where ename = 'FORD'; -- 데이터는 대소문자 구분

-- 4. 논리연산자 : AND, OR, NOT
    -- ex. 급여(SAL)가 2000이상 3000이하인 직원의 모든 필드
SELECT * FROM EMP WHERE SAL>=2000 AND SAL<=3000;
    -- ex. 82년도에 입사한 사원의 모든 필드
SELECT * FROM EMP WHERE HIREDATE >= '82/01/01' AND HIREDATE<= '82/12/31';
-- 날짜 표기법 셋팅 (현재 : YY/MM/DD OR RR/MM/DD)
ALTER SESSION SET NLS_DATE_FORMAT = 'MM-DD-RR';
ALTER SESSION SET NLS_DATE_FORMAT = 'RR/MM/DD'; -- 한글윈도우즈 위에 INSTALL
SELECT ENAME, HIREDATE FROM EMP;
    -- 연봉이 2400 이상인 직원의 ENAME, SAL, 연봉 출력 (연봉 = SAL*12)
SELECT ENAME, SAL, SAL*12 "연봉" FROM EMP WHERE SAL*12 > 2400;
SELECT ENAME, SAL, SAL*12 "연봉" FROM EMP WHERE 연봉>2400; -- WHERE절에는 별칭을 쓸 수 없다
SELECT ENAME, SAL, SAL*12 "연봉" 
    FROM EMP 
    WHERE SAL*12>2400 
    ORDER BY 연봉; -- ORDER BY절에는 별칭 사용 가능
    -- 10번 부서(DEPTNO)이거나 직책(JOB)이 MANAGER인 사람의 모든 필드
SELECT * FROM EMP WHERE DEPTNO=10 OR JOB='MANAGER';
    -- 부서번호가 10번이 아닌 사람의 모든 필드
SELECT * FROM EMP WHERE DEPTNO != 10;
SELECT * FROM EMP WHERE NOT DEPTNO=10;

-- 5. 산술표현식
SELECT ENAMEK, SAL "현재급여", SAL+100 "올릴급여" FROM EMP WHERE DEPTNO=10;
    -- ex. 모든 사원의 이름(ENAME), 월급(SAL), 상여(COMM), 연봉(SAL*12+COMM)
    -- 산술연산의 결과는 NULL포함하면 결과도 NULL
    -- NVL(NULL일 수도 있는 필드명, 대치값) 반드시 매개변수 둘은 타입 같아야 함
SELECT ENAME, SAL, COMM, SAL*12+COMM FROM EMP;
SELECT ENAME, SAL, COMM, SAL*12+NVL(COMM, 0) FROM EMP;
    -- 모든 사원의 사원명(ENAME), 상사의 사번(MGR)을 출력(상사없으면 0)
SELECT ENAME, NVL(MGR, 0) FROM EMP;
SELECT ENAME, NVL(MGR, '없음') FROM EMP; -- NVL 매개변수 타입 불일치 에러









