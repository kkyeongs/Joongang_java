[��������(SubQuery)]
: �ϳ��� ������ �ٸ� ������ ���ԵǴ� ����,()��ó��
1) ������ ��������(�������ȯ) :  > , < , >=, <= , <>
     Main Query
               
         Sub  Query      ----->   1 ����� 

2) ������ ��������(�������ȯ) : in, any, all

     Main Query
     
          Sub Query      ----->   �������� ���  
      
       < any : �񱳴���� �ִ밪���� ����
       > any : �񱳴���� �ּҰ����� ŭ   
                  (ex. ���������� �޿��� �޴� �����ȸ)
       =  any : in�����ڿ� ����
       <  all   : �񱳴���� �ּҰ����� ����
       >  all   : �񱳴���� �ִ밪���� ŭ 
                  (ex. ��������� ���޺��� �޿��� ���� �����ȸ)

3) �������(correlated  subquery)   
  : �������� ������ �а� �ش簪�� ������������ �����Ͽ� ������������� �����ϸ� true�� ��ȯ
      exists,  not exists : ���� ���ο� ���� true,false�� ��ȯ

==============================================================================================
--ex1) Neena����� �μ����� �˾Ƴ��ÿ�
select department_id from employees where first_name='Neena' -- 90
select department_name from departments where department_id=90

select department_name
from departments
where department_id=(select department_id from employees where first_name='Neena')

--ex2) Valli Pataballa��  ������(job_title)�� �˾Ƴ��ÿ�
--[����] job_id(IT_PROG)
select first_name, last_name from employees

select job_title from jobs where job_id=(select job_id 
										from employees
										where first_name='Valli' and last_name='Pataballa')

------------------------------------------------------------------------------------------------
--ex3) Alexander Hunold�� �ٹ���(city)�� �˾Ƴ��ÿ�
--[����] department_id(60) -> location_id(1400) -> city(Southlake)
select * from employees
select * from jobs

select city from locations where location_id=(select location_id 
											from departments
											where department_id=(select department_id 
																from employees 
										where first_name='Alexander' and last_name='Hunold'))


------------------------------------------------------------------------------------------------
--ex4) Steven King�� �ٹ��ϴ� ����(country_name)�� �˾Ƴ��ÿ�
--[����] �� : United States of America
select country_name from countries where country_id=(
select country_id from locations where location_id=(
select location_id from departments where department_id=(
select department_id from employees where first_name='Steven' and last_name='King')))

------------------------------------------------------------------------------------------------
--ex5) Diana Lorentz�� �ٹ��ϴ� ����(region_name)�� �˾Ƴ��ÿ� --Americas
select region_name from regions where region_id=(
select region_id from countries where country_id=(
select country_id from locations where location_id=(
select location_id from departments where department_id=(
select department_id from employees where first_name='Diana' and last_name='Lorentz'))))

------------------------------------------------------------------------------------------------
--ex6) Neena����� �μ����� Neena������� �޿��� ���� �޴� ������� ���Ͻÿ�  ==> 1���ڵ�
--                             (90)                         (17000)
--first_name    department_id    salary
-- ----------------------------------------
--Steven	     90	           24000
select first_name, department_id, salary
from employees
where department_id=(select department_id from employees where first_name='Neena')
and salary>(select salary from employees where first_name='Neena')

-----------------------------------------------------------------------------------------------
--ex7) oliver�� ���� ����ID�̸鼭 ���� �μ��� �ƴ� ����� 
--       �̸�(first_name),����ID,�μ�ID�� ����Ͻÿ�  ==> 1���ڵ� 
--                        (SA_REP)  (80)       
--      first_name        job_id        department_id
--      ------------------------------------------------
--      Kimberely	        SA_REP			null
select first_name, job_id, department_id
from employees
where job_id=(select job_id from employees where lower(first_name)='oliver')
and nvl(department_id, 0)!=(select department_id from employees where lower(first_name)='oliver')

------------------------------------------------------------------------------------------------
--ex8) Austin�� �����μ��̸鼭 ���� �޿��� �޴»������ �̸�, �μ���, �޿��� ���Ͻÿ� ==> 2 ���ڵ�
--                   (60)                  (4800)
             
--        last_name     department_name   salary
--       -------------------------------------------------  
--       Austin	             IT            4800
--       Pataballa           IT            4800     
select last_name, department_name, salary
from employees
left join departments using(department_id)
where department_id=(select department_id from employees where lower(last_name)='austin')
and salary=(select salary from employees where lower(last_name)='austin')

------------------------------------------------------------------------------------------------
--ex9) �����޿��� �޴� ������� �̸��� �޿��� ���Ͻÿ�
--       last_name   salary
--       ---------------------
--       Olson         2100  
select last_name, salary
from employees
where salary=(select min(salary) from employees)

------------------------------------------------------------------------------------------------
--ex10) ��ձ޿��� �޴� ������� �̸��� �޿��� ���Ͻÿ�  ==> 2���ڵ�
--       ����1) ��ձ޿��� õ���� �����Ͻÿ�       
--       �����        �޿�
--       ----------------------
--       Ernst          6000
--       Fay            6000
select last_name �����, salary �޿�
from employees
where salary=(select trunc(avg(salary), -3) from employees)

------------------------------------------------------------------------------------------------
--ex11)�μ��� �޿��հ���  �ִ�޿��� �޴� �μ��� 
--     �μ����  �޿��հ踦 ���Ͻÿ�(������ ��������)   ==> 1���ڵ�
--     ����1) �μ��� �޿��հ踦 ���ϰ� �ִ밪�� ���Ѵ�
--     ����2) Ÿ��Ʋ�� �μ���,�޿��հ�� �Ѵ�
--              �μ���    �޿��հ�
--              -----------------------
--               Sales	    304500
select department_name �μ���, sum(salary) �޿��հ�
from employees
join departments using(department_id)
group by department_name
having sum(salary)=(select max(sum(salary)) from employees group by department_id)

------------------------------------------------------------------------------------------------
--ex12) ����ID�� �޿������ ��ü��ձ޿����� ���� �޴� ����ID��  
--      �������  �޿���ո� ���Ͻÿ�(������ ��������)  ==> 6 ���ڵ�
--     ����1) ������ �޿������ ���Ѵ�
--     ����2) �޿������ õ���� �����Ѵ�
--     ����3) Ÿ��Ʋ�� ������,�޿��հ�� �Ѵ�
--     ����4) ��� ����� �����Ѵ�

--               ������                    �޿����
--              ----------------------------------------
--               Programmer	             5000
--               Purchasing Clerk	     2000
--               Marketing Representative    6000
--               Administration Assistant    4000
--               Stock Clerk	             2000
--               Shipping Clerk	             3000
select job_title, salary
from employees
join jobs using(job_id)

select job_title, avg(salary)
from employees
join jobs using(job_id)
group by job_title

select job_title ������, trunc(avg(salary)) �޿����
from employees
left join jobs using(job_id)
group by job_title
having avg(salary)<(select avg(salary) from employees)

--==================================================================================================
-- ������ ��������
--ex13) 'SA_REP' ���޺��� �޿��� ���� 'ST_MAN'���� �������� ��ȸ�Ͻÿ�    -- 4 ���ڵ�
--[�м�]
--ST_MAN ����� �޿� 8000, 8200,7900,6500,5800 �� 5800�� ���ܵ�
--SA_REP�� �ּұ޿��� 6100�̱� ����
select salary from employees where job_id='SA_REP' order by 1 desc
select salary from employees where job_id='ST_MAN' order by 1 desc

--last_name   job_id   salary
-------------------------------
--Weiss       ST_MAN    8000
--Fripp       ST_MAN    8200
--Kaufling    ST_MAN    7900
--Vollman     ST_MAN    6500
-- �� ����� �ּҰ� ���� ŭ >any
select last_name, job_id, salary
from employees
where job_id='ST_MAN'
and salary>any(select distinct salary from employees where job_id='SA_REP')

------------------------------------------------------------------------------------------------
--ex14) 'SA_REP' ������ �ּұ޿����� �޿��� ���� 'ST_MAN'���� �������� ��ȸ�Ͻÿ�   -- 1 ���ڵ�
--last_name   job_id   salary
-------------------------------
--Mourgos	ST_MAN	5800
select last_name, job_id, salary
from employees
where job_id='ST_MAN'
and salary<all(select salary from employees where job_id='SA_REP')

-------------------------------------------------------------------------------------------------
--       (9000,4800,4200,6000)
--ex15) 'IT_PROG' ������ ���� ���� �޴� ����� �޿�����,�� �����޿��� �޴�   -- 10 ���ڵ�
--      'FI_ACCOUNT' �Ǵ� 'SA_REP' ���� �������� ��ȸ�Ͻÿ�
--      ����1) �޿������� �������������Ͻÿ�
--      ����2) �޿��� ���ڸ����� �޸�(,) ��� ȭ����� '�޷�'�� ���̽ÿ�
--      ����3) Ÿ��Ʋ��  �����, ����ID, �޿��� ǥ���Ͻÿ�

--      �����      ����ID          �޿�
--      ----------------------------------------
--      Ozer         SA_REP        11,500�޷�
--      Abel         SA_REP        11,000�޷�
--      Vishney      SA_REP        10,500�޷�
select last_name �����, job_id ����ID, to_char(salary, '999,999')||'�޷�' �޿�
from employees
where job_id in('FI_ACCOUNT', 'SA_REP')
and salary>all(select salary from employees where job_id='IT_PROG')
order by 3 desc

------------------------------------------------------------------------------------------------
--ex16) 'IT_PROG'�� ���� �޿��� �޴� ������� �̸�,����ID,�޿��� ���� ���Ͻÿ�  ==> 10���ڵ�
--�̸�    ����ID   �޿�
---------------------------
--McEwen   SA_REP   9000
--Hall     SA_REP   9000
select last_name �̸�, job_id ����ID, salary �޿�
from employees
where salary=any(select salary from employees where job_id='IT_PROG')

where salary in(select salary from employees where job_id='IT_PROG')

-------------------------------------------------------------------------------------------------
--ex17) ��ü������ ���� �����ڿ� ������ �����ϴ� ǥ�ø� �Ͻÿ�(in, not in�̿�)
--        ����1) ���к� ���������ϰ� �����ȣ�� �������������Ͻÿ�
-- �����ȣ      �̸�       ����
-------------------------------------
-- 100                King      ������
select employee_id �����ȣ, last_name �̸�, 
		case when employee_id in(select distinct manager_id from employees) then '������'
		else '����'
		end as "����"
from employees
order by 3, 1

------------------------------------------------------------------------------------------------
--ex18) ������ ���� ���ǿ� �´� ���� �˻��Ͻÿ�   ==> 28���ڵ�
--      ����1) ���޺� ��ձ޿��� ������ ��� ����� �� �޿��� �޴� ����� ��ȸ�Ͻÿ�
--               (��, 100���� ���� ����)
--      ����2) ����� �޿��� ���ڸ����� �޸��� $ǥ��
--      ����3) ����̸�(last_name),����(job_title) ,�޿�(salary) �� ǥ���Ͻÿ�
--      ����4) �޿������� �������� �����Ͻÿ�

--         ����̸�       ����               �޿�
--         ---------------------------------------
--         Higgins      Accounting Manager   $12,008
--         Errazuriz    Sales Manager	     $12,000
--         Greenberg    Finance Manager	     $12,008
select last_name ����̸�, job_title ����, to_char(salary, '$999,999') �޿�
from employees
left join jobs using(job_id)
where trunc(salary, -2)=any(select trunc(avg(salary), -2) from employees group by job_id)
order by 3 

select * from employees
select * from jobs

------------------------------------------------------------------------------------------------
--ex19) group by rollup : a,b�� ����
--�μ���, ����ID�� �޿���ձ��ϱ�(���Ϻμ��� ���� ������ ��ձ޿�)
--����1) �ݿø��ؼ� �Ҽ� 2°�ڸ����� ���Ͻÿ�
--����2) ������ Job_title, Department_name, Avg_sal�� ǥ���Ͻÿ�


------------------------------------------------------------------------------------------------
--ex20) group by cube :  a�� ���� �Ǵ� b�� ����
--�μ���, ����ID�� �޿���ձ��ϱ�(�μ��� �������� ��Ÿ���� ��ձ޿�)      

------------------------------------------------------------------------------------------------
--ex21) group by grouping sets
--������ ��ձ޿��� ��ü����� ��ձ޿��� �Բ� ���Ͻÿ�                 




















          