[������]
=  : ����
!=,  ^=,  <> : �����ʴ�
>=, <=, >, < : ũ�ų�����,�۰ų�����,ũ��,�۴�
and, or, between and, in, like, is null/is not null

�� select 
select  [distinct] [�÷�1, �÷�2.......][*][ ||���Ῥ����][as ����]
from ���̺��
[where ������]
[order by �÷��� asc|desc ] -- �׻� �� ������

order by : ����
                asc  - ��������(��������)
                desc - ��������
�÷��� : ���ڷε� ����
=======================================================================================
--ex1) �����,�μ�ID,�Ի����� �μ����� �������� �����Ͻÿ�
select last_name, department_id, hire_date
from EMPLOYEES
order by 2 desc

--ex2) �����, �μ�ID, �Ի�����  �μ����� �������� �����Ͻÿ�
--     �����μ��� ��������  �Ի��ϼ����� �����Ͻÿ�
select last_name, department_id, hire_date
from EMPLOYEES
order by 2 desc, 3 

--ex3) ������� ������ ������ ���������� �������������Ͻÿ�
--�� ��     �� ��     
-- ---------------
--King      28800
select last_name "�� ��", salary*12 "�� ��"
from EMPLOYEES
order by 2 desc
=======================================================================================
[������ �Լ�]
1. �����Լ� : mod(������), round(�ݿø�), trunc(����), ceil(�ø�) 
2. �����Լ� : lower, upper, length, substr, ltrim, rtrim, trim
3. ��¥�Լ� : sysdate, add_month, month_between
4. ��ȯ�Լ�
   (1) �Ͻ���(implict)��ȯ:�ڵ�
       VARCHAR2 �Ǵ� CHAR    ------>     NUMBER
       VARCHAR2 �Ǵ� CHAR    ------>     DATE
       NUMBER               ------>     VARCHAR2
       DATE                 ------>     VARCHAR2   

    (2) �����(explict)��ȯ:����
    
               TO_NUMBER               TO_DATE
                 <------               ------>
     NUMBER                 CHARACTER           DATE
                 ----->                <------
                 TO_CHAR               TO_CHAR

-��¥����-
YYYY : ���ڸ�����(����)         (ex.  2005)  
YEAR : ����(����)
MM : ���ڸ� ������ ��Ÿ�� ��    (ex.   01, 08, 12)
MONTH : �� ��ü�̸�             (ex.   January) 
MON : ���ڸ� ���� ��Ÿ�� ��   (ex.   Jan)  
DAY : ������ü                  (ex. Monday) 
DY : ���ڸ� ���� ��Ÿ�� ����  (ex. Mon) 
DD : ���ڷ� ��Ÿ�� ���� ��      (ex. 31, 01) 

-��������-
9 : ���ڸ� ǥ��
0 : 0�� ������ ǥ��
$ : �ε�$��ȣ�� ǥ��
L : �ε� ������ȭ��ȣ ǥ��(�ѱ�,�Ϻ�...)
.  : �Ҽ������
,  : õ���� ������ ���

5. �׷�(����)�Լ�(�������Լ�) : avg, sum, max, min, count
6. ��Ÿ�Լ� : nvl, dcode, case
=======================================================================================
--ex1)  �̸��� �ҹ��ڷ� �ٲ��� �˻�
--'Higgins'����� �����ȣ,�̸�,�μ���ȣ�� �˻��Ͻÿ�
select employee_id, last_name, department_id
from employees
where last_name='Higgins'

--ex2) 10�� 3���� ���� ������ ���Ͻÿ�(mod)
select mod(10,3)
from dual -- ������ ���̺�

--ex3) 35765.357�� �ݿø�(round)
select round(35765.357, 2) from dual	--35765.36
select round(35765.357, 0) from dual	--35765
select round(35765.357, -3) from dual	--36000

--ex4) 35765.357�� ����(trunc)
select trunc(35765.357, 2) from dual	--35765.35
select trunc(35765.357, 0) from dual	--35765
select trunc(35765.357, -3) from dual	--35000

--ex5) concat('���ڿ�1','���ڿ�2') : ���ڿ��� ����(���ڿ�1+���ڿ�2)
select concat('hello', 'world', 'oo') from dual	-- �Ű������� 2��������, ������
select concat('hello', 'world') from dual

--ex6) length('���ڿ�')  : ���ڿ�(ĳ����)�� ����
--     lengthb('���ڿ�') : ���ڿ�(BYTE)�� ����

--   ��뿹)  ����Ʈ , ����Ʈ
--                     char(20)    varchar2(20)
--      length           14           3         <---- ����Ʈ
--      lengthb          20           9         <---- ����Ʈ

--   ��뿹)  elite , elite
--                     char(20)    varchar2(20)
--      length           20           5         <---- elite
--      lengthb          20           5         <---- elite

create table text (str1 char(20),str2 varchar2(20));
insert into text(str1,str2) values('����Ʈ','����Ʈ');
insert into text(str1,str2) values('elite','elite');
commit;

select * from tab;
select * from text;
select length(str1),length(str2) from text where str1='����Ʈ';     --14   3
select lengthb(str1),lengthb(str2) from text where str1='����Ʈ';    --20   9

select length(str1),length(str2) from text where str1='elite';     --20   5
select lengthb(str1),lengthb(str2) from text where str1='elite';   --20   5

--ex7) 
select length('korea') from dual;
select length('�ڸ���') from dual;
select lengthb('korea') from dual;
select lengthb('�ڸ���') from dual;

--ex8) �����ѹ��ڿ�ã�� : instr(ǥ����,ã�¹���,[��ġ])  1:��(��������), -1:��    �˻��� ����
select instr('HelloWorld','W') from dual;
select instr('HelloToWorld','o', -5) from dual; -- -(5)°���� ���� '?'�� �˻��ض�

--ex9) ������ ������ ���ڿ��� ���� : substr(ǥ����,����,[����])
select substr('I am very happy', 6) from dual;
select substr('I am very happy', 6, 4) from dual;

--ex10) employees ���̺��� ���ǿ� �°� �˻��Ͻÿ�(concat,  length)   -- 19���ڵ�
--      ����1) �̸��� ���� �����Ͻÿ�(concat)
--      ����2) ������ �̸��� ���̸� ���Ͻÿ�(length)
--      ����3) ���� n���� ������ ���(substr)

--employee_id        name           length
-- -----------------------------------------------
--  102              LexDeHaan       10
select employee_id, concat(first_name, last_name) name, length(concat(first_name, last_name)) "length"
from employees
where substr(last_name, -1, 1)='n'

--ex11) ������ ���� ������ �������� �����ġ : width_bucket(ǥ����,�ּҰ�,�ִ밪,����)
--�ּ�-�ִ밪�� �����ϰ� 10���� ������ ������ ��ġã��
--0-100������ ������ ������ 74�� ���ԵǾ��ִ±����� ǥ���Ͻÿ�
select width_bucket(74, 0, 100, 10) from dual;	-- �ش籸���� ��� 8

--ex12) �������� : ltrim(��), rtrim(����), trim(����)
select rtrim('test         ') || ltrim('         test') from dual;
select trim('         test               ') from dual;

--ex13) sysdate : �ý��ۿ� ������ �ð�ǥ��
-- 2015�� 1�� 05��
select sysdate from dual;
select to_char(sysdate, 'YYYY"��" MM"��" DD"��"') ���ó�¥ from dual; --2021�� 08�� 02��
-- fm(����) ����ϸ� 01���� 1���� ��, ���ڸ����� ǥ��
select to_char(to_date('15/01/05'), 'YYYY"��" fmMM"��" DD"��"') from dual; --2015�� 1�� 5��
select to_char(to_date('15/01/05'), 'YYYY"��" fmMM"��"') from dual; --2015�� 1��

--ex14) add_months(date, �޼�):��¥�� �޼� ���ϱ�
select add_months(sysdate, 1) from dual; -- �� ���� +1 �ϱ�

--ex15) last_day(date) : �ش���� ��������
select last_day(sysdate) from dual;
select last_day('2004-02-01') from dual;

--ex16) ���ú��� �̹��� ������ �� ���� �� ���� ���Ͻÿ�
select last_day(sysdate)-sysdate from dual;
select last_day(sysdate)-to_date('2021-08-30') from dual;

--ex17) months_between(date1,date2) : �� ��¥������ �� ��
select months_between('2014-02-10', '2013-10-21') from dual;--3.64516129032258064516129032258064516129
select round(months_between('2014-02-10', '2013-10-21')) from dual; --4, �̷��� �ݿø��� ���ش�.

-- desc employees ��Ŭ���� ���� �ȵ�, sqlplus���� Ȯ��

--ex18) �Ͻ����� ��ȯ(�ڵ�)
select employee_id, last_name
from employees
where department_id='90'; --> ���� '90' ���� 90���� �ڵ� ����ȯ

select months_between('15-10-21', '2014-10-20') from dual;
-- 						date����		 date����			����� ������������ ��ȯ

--ex19) ������� ��ȯ(����)     number --> character
select last_name, to_char(salary, 'L99,999.00')	--�Ҽ��� 3�ڸ����� , ǥ��(���� ���� ǥ�� �Ϸ��� 9���� ������)
--												  �Ҽ���.00���� ǥ��
from employees
where last_name='King';

--ex20) fm���� : ���İ� �����Ͱ� �ݵ�� ��ġ�ؾ���(fm - fm���̰��� ��ġ)
select last_name, hire_date from employees where hire_date='05/06/25';
select last_name, hire_date from employees where hire_date='05/6/25';
select to_char(to_date('15-04-07'), 'YYYY-fmMM-fmDD') from dual;

--ex)2007-02-07�� �Ի��� ����� �˻��Ͻÿ�
select *
from employees
where hire_date='2007-02-07'; -- hire_date > '2007-02-07' �̷��͵� ����

select *
from employees
where to_char(hire_date, 'YY-MM-DD')=to_char(to_date('07-02-07','YY-MM-DD'),'YY-MM-DD');

--ex21) RR, YY����

   (��ȯ��:����⵵�� ����)              			    �����ѿ���(�� ���ڸ�)
						-----------------------------------------------------
  									    0 - 49                 50 - 99     
==================================================================================
  	 ���翬�� (�� ���ڸ�)  	  0 - 49     ��ȯ���� ���缼��     		 ��ȯ���� ��������
						----------------------------------------------------------
						 50 - 99  	 ��ȯ���� ��������    		 ��ȯ���� ���缼��


  	 ��)   ����⵵              �����ѳ�¥        	 RR����              YY����
        -----------------------------------------------------------------------
           1995              27-oct-95           1995				2095
           1995              27-oct-17             
           2001              27-oct-17            
    4      2001              27-oct-95           1995				2095
select to_char(to_date('95/10/27', 'YY-MM-DD'), 'YYYY-MM-DD') from dual; -- 4�� YY����
select to_char(to_date('95/10/27', 'RR-MM-DD'), 'RRRR-MM-DD') from dual; -- 4�� RR����

--ex22)
select to_char(to_date('97/9/30'), 'YYYY-MON-DD') from dual;
select to_char(to_date('9/30/97', 'MM-DD-YY'), 'YYYY-MON-DD') from dual; -- 2097��
select to_char(to_date('9/30/97', 'MM-DD-RR'), 'YYYY-MON-DD') from dual; -- 1997��

--ex23)2005�� ���Ŀ� ���� ����� ã���ÿ�
--last_name     hire_date
------------------------------------
--King           17-Jan-1987
--Kochhar        21-sep-1989
--Whalen         17-sep-1987
select last_name, to_char(hire_date, 'dd-mon-yyyy')
from employees
where hire_date >= '2005-01-01';
-- where hire_date >= to_char(to_date('2005-01-01','yy-mm-dd), 'yy-mm-dd);

select to_char(sysdate, 'Month d, yyyy', 'nls_date_language=english') from dual;
                     
--**�׷��Լ�    
--ex24) count(�÷���), max(�÷���), min(�÷���),avg(�÷���),sum(�÷���) �Լ�
--employees���̺��� �޿��� �ִ�, �ּ�, ���, ���� ���Ͻÿ�
--����) ����� �Ҽ���������, ���� ���ڸ� ���� �޸���� \ǥ��
select count(salary), max(salary), min(salary), trunc(avg(salary), 0), to_char(sum(salary), 'L999,999,999')
from employees;

--ex25) Ŀ�̼��� ���� �ʴ� ����� �ο����� ���Ͻÿ�
select count(*)
from employees
where commission_pct is null;

--ex26) employees���̺��� ���ºμ������ؼ�,�� �μ��� ���� ���Ͻÿ�(�� : 12��)
--      (nvl���) 
select count(distinct nvl(department_id, 0))-- null���� ���Խ�ų �� �ִ�. nvl(�տ����� null�϶� ��ü�� ��)
from employees

--����) ���������� ����Ͻÿ�
--        ����1) ����̸�, �޿�, Ŀ�̼�, ������ ����Ͻÿ�
--        ����2) ���� = �޿�*12 + (�޿�*12)*Ŀ�̼����� �Ѵ�
--        ����3) Ŀ�̼��� ���� �ʴ°�쿡�� 0���� ǥ���Ѵ�
select last_name ����̸�, salary �޿�, nvl(commission_pct, 0) Ŀ�̼�, 
	salary*12+(salary*12)*nvl(commission_pct, 0) ����
from employees;

--ex27) �� decode(ǥ����,�˻�1,���1,�˻�2,���2....[default])
--        : ǥ���İ� �˻��� ���Ͽ� ��� ���� ��ȯ �ٸ��� default
--        �� case  [value]  when  ǥ����  then   ����1
--                         when  ǥ����  then   ����2
--                                  :
--                         else  ����3
--						   end

--ex28)���� id�� 'SA_MAN' �Ǵ� ��SA_REP'�̸� 'Sales Dept' �� �� �μ��̸� 'Another'�� ǥ��
--����) �з����� ������������
--        ����          �з�
--       --------------------------
--       SA_MAN    Sales Dept
--       SA_REP      Sales Dept
--       IT_PROG    Another

-- decode�� ����� decode(salary, 10000) 10000�� ���� ��Ȯ�� ���� �����ؾ� �Ѵ�
select job_id ����, decode(job_id, 'SA_MAN', 'Sales Dept', 'SA_REP', 'Sales Dept', 'Another') �з�
from employees
order by 2 desc
-------------------��������-------------------
select job_id ����
		case job_id when 'SA_MAN' then 'Sales Dept' --when�϶� then
					when 'SA_REP' then 'Sales Dept'	--when�϶� then
					else 'Another'					-- ������
					end �з�
from employees
order by 2 desc

--ex28) �޿��� 10000�̸��̸� �ʱ�, 20000�̸��̸� �߱� �� ���̸� ����� ����Ͻÿ� 
--      ����1) �÷�����  '����'���� �Ͻÿ�
--      ����2) ������ �����ȣ, �����, ��  ��
--      ����3) ����(��������)���� �����ϰ�, ���а��� ������ �����(��������)���� �����Ͻÿ�
select employee_id �����ȣ, last_name �����,
		case  when salary<10000 then '�ʱ�' -- case salary when 10000 then '�ʱ�'
			  when salary<20000 then '�߱�'
			  else '���'
			  end "��  ��"
from employees
order by 3, 2

select employee_id, last_name, 
		decode(salary, 10000, '�ʱ�', 20000, '�߱�', '���') "��   ��"
from employees
order by 3, 2

--rank�Լ� : ��ü���� ������� ������ ����
--rank(ǥ����) within group(order by ǥ����)     ---> �κ�
--rank() over(������Ƽ��)                       ---> ��ü������ ǥ��

--ex29)�޿��� 3000�� ����� ���� �޿������� ���Ͻÿ�
select rank(3000) within group(order by salary desc)
from employees

--ex30)��ü����� �޿������� ���Ͻÿ�
select employee_id, last_name, salary,
		rank() over(order by salary desc) "rank", -- �������� 1 2 2 4 ..
		dense_rank() over(order by salary desc) "dense_rank", -- 1 2 2 3 3 4..
		row_number() over(order by salary desc) "row_number" -- 1 2 3 4 5 6 7..
from employees

-- ����
--first_value�Լ� : ���ĵ� �� �߿��� ù��°�� ��ȯ
--first_value(ǥ����) over(������Ƽ��)
--ex31)��ü����� �޿��� �Բ� ���μ��� �ְ�޿��� ��Ÿ���� ���Ͻÿ�
=================================================================================================
--[����1] ������̺��� �����ȣ, �̸�, �޿�, Ŀ�̼�, ������ ����Ͻÿ�
--        ����1) ������ $ ǥ�ÿ� ���ڸ����� �޸��� ����Ͻÿ�
--        ����2) ���� = �޿� * 12 + (�޿� * 12 * Ŀ�̼�) 
--        ����3) Ŀ�̼��� ���� �ʴ� ����� �����ؼ� ����Ͻÿ�
select employee_id �����ȣ, last_name �̸�, salary �޿�, nvl(commission_pct, 0) Ŀ�̼�,
		to_char(salary*12+(salary*12*nvl(commission_pct, 0)), '$999,999,999') ����
from employees

--[����2] �Ŵ����� ���� ����� �Ŵ���id��, 1000���� ǥ��
--        ����1) ������ �����ȣ,�̸�,�Ŵ���ID
--        ����2) ��� ����� ǥ���Ͻÿ�       
--                �����ȣ     �̸�       �Ŵ���ID
--	          ---------------------------------
--	           100           King        1000 
select employee_id �����ȣ, last_name �̸�, nvl(manager_id, 1000) �Ŵ���ID
from employees

--[����3] �޿���  7000�̻��̸� '���'  3000�̻��̸� '�߱�'  3000�̸��̸� '�ʱ�'�� ���
--          grade���� �������� �����Ͻÿ�  
--                last_name        salary       grade
--              --------------------------------------------
--                 King               24000      ���
select last_name, salary,
	case when salary>=7000 then '���'
		 when salary>=3000 then '�߱�'
		 when salary<3000 then '�ʱ�'
		 end "grade"
from employees
order by 3, 2 desc





select *
from employees