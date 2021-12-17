�� SQL��
1. ����Ÿ ���۾�(DML : Data Manipulation Language)
    : insert, update, delete, merge
2. ����Ÿ ���Ǿ�(DDL : Data Definition Language)
    : create, alter, drop, rename, truncate    
3. ����Ÿ�˻�
    : select 
4. Ʈ���������
    : commit, rollback, savepoint
5. ����Ÿ �����(DCL : Data Control Language)
    : grant,  revoke


�� select
[����]
 select [distinct] [�÷�1,�÷�2,.....][as ����][ || ������][*]
 from ���̺��
 [where ������] 

distinct : �ߺ�����
* : ���
������ : and,or,like,in,between and,is null,is not null
==================================================================================
select * from tab;              -- ���̺� ���Ȯ���ϱ�
select * from employees;    --employees���̺��� ����Ȯ���ϱ�
select * from departments; 

--ex1)employees���̺��� ��� ����� �����ȣ,�̸�(last_name),�޿� �˻�
select EMPLOYEE_id, last_name, salary
from EMPLOYEES;
-- select �������� ���̺��� �÷��� �ۼ�
-- from	  �������� ���̺��� �̸� �ۼ�


--ex2)employees���̺��� ��� ����� �̸�(last_name), �Ի���(hire_date), ����ID(job_id) �� �˻�
select last_name, hire_date, job_id from EMPLOYEES;

--ex3)employees���̺��� ��� ����� �̸�(last_name), ����(salary*12)�� �˻�
select last_name, salary*12
from employees

--ex4)������̱�(as�� ��������)
--    employees���̺��� ��� ����� �����ȣ,�̸�(last_name),�޿� �˻�
--    ����) title �����ȣ, �̸� ,�޿��� ����Ұ�
select employee_id as "�����ȣ", last_name as "�̸�", salary as "�޿�"
from EMPLOYEES

--ex5) employee���̺��� �����ȣ,�̸�,������ ���Ͻÿ�
--     ����1) ���� = �޿� * 12
--     ����2) ������ �����ȣ, �̸�, �������� ���
select EMPLOYEE_id �����ȣ, last_name �̸�, salary*12 ����
from employees

--ex6) ���Ῥ����( || ) : �÷��� �����ؼ� ���
--    first_name��  last_name�� �����ؼ� ����Ͻÿ�
--     ��   ��
--     ------------
--     Ellen   Abel
select first_name || ' ' ||last_name "��   ��"
from EMPLOYEES
-- ' '�� ����� ��µǴ� ���ڿ� 
-- " "�� �÷��� ��µǴ� ���ڿ� 

--ex7) ����ó�� ����Ͻÿ�
--   �����ȣ    ��  ��        �� ��
--   ---------------------------------------------
--    100      Steven King   288000�޷� 
select employee_id �����ȣ, first_name || '  ' || last_name "��  ��", 
		salary*12 || '�޷�' "��  ��"
from EMPLOYEES

--ex8) ����ó�� ����Ͻÿ� (last_name, job_id�̿�)
--     Employee  Detail
--     --------------------
--     King  is a  AD_PRES
select last_name ||'  is a  '|| job_id as "Employee  Detail"
from EMPLOYEES
-- �����Ҷ��� || �ΰ��� ����

--�ߺ�����(distinct)
--ex9)employees���̺��� �μ��� ����Ͻÿ�
--    ����1)�ߺ��Ǵ� �μ��� 1���� ����Ͻÿ�
--    ����2)�μ��� ������������ �����ֽÿ�
select distinct DEPARTMENT_id
from EMPLOYEES
order by department_id

--ex10) 10���μ� �Ǵ� 90���μ� ������� �̸�,�Ի���,�μ�ID�� ����Ͻÿ�
select distinct last_name, hire_date, department_id
from EMPLOYEES
where department_id = 10 or department_id = 90;

--ex11)�޿��� 2500�̻� 3500�̸��� ����� �̸�(last), �Ի���, �޿��� �˻��Ͻÿ�
select last_name, hire_date, salary
from EMPLOYEES
where salary >= 2500 and salary <= 3500

--ex12) �޿��� 2500���� �̰ų� 3000�̻��̸鼭, 90�� �μ��� ����� �̸�, �޿�, �μ�ID�� ����Ͻÿ�. --3��
--      ����1) ������ �����, ��  ��, �μ��ڵ�� �Ͻÿ�
--      ����2) �޿��տ� $�� ���̽ÿ�
--      ����3) ������� first_name�� last_name�� �����ؼ� ����Ͻÿ�
select first_name ||' '|| last_name "�����", '$' || salary "��  ��", department_id "�μ��ڵ�"
from employees
where (salary <= 2500 or salary >= 3000) and department_id=90;

--ex13) 'King'����� ��� �÷��� ǥ���Ͻÿ�
select *
from EMPLOYEES
where last_name = 'King' --> ���ڿ� �˻��ÿ��� ��ҹ��ڸ� ����

select *
from EMPLOYEES
where upper(last_name) = 'KING' -- upper() ���ڿ��� �빮�ڷ� �ٲ����� (KING)�̳�

select *
from EMPLOYEES
where lower(last_name) = 'King' -- lower() ���ڿ��� �ҹ��ڷ� �ٲ����� (king)�̳�


-- like  : ���ڸ� ����
-- 'a%'      a�� �����ϴ�
-- '%d'      d�� ������ 
-- '%test%'   test�� ���ԵǾ��ִ�
-- ��)  select * from employees where first_name like '%net%';

--ex14)����ID�� CL�� ���ԵǾ��ִ� ������� �̸�,����ID,�μ�ID�� ����Ͻÿ�
select last_name, job_id, department_id
from EMPLOYEES
where job_id like '%CL%'

--ex15) ����ID��  IT�� �����ϴ� ������� �̸�,����ID,�μ�ID�� ����Ͻÿ�
select last_name, job_id, department_id
from EMPLOYEES
where job_id like 'IT%'

--ex16) is null / is not null 
--Ŀ�̼��� �޴� ������� �̸��� �޿�,Ŀ�̼��� ����Ͻÿ�
select last_name, salary, commission_pct
from EMPLOYEES
where commission_pct is null

--ex17)Ŀ�̼��� ���� �ʴ� ������� �̸��� �޿�,Ŀ�̼��� ����Ͻÿ�
select last_name, salary, commission_pct
from EMPLOYEES
where commission_pct is not null

--ex18) in������(or�������� �ٸ�ǥ��)
--����ID��  FI_MGR�̰ų�  FI_ACCOUNT�� ������� �����ȣ,�̸�,����ID�� ����Ͻÿ�   --6��
select EMPLOYEE_id, last_name, job_id
from EMPLOYEES
where job_id = 'FI_MGR' or job_id='FI_ACCOUNT'
-- ��������
select EMPLOYEE_id, last_name, job_id
from EMPLOYEES
where job_id in('FI_MGR', 'FI_ACCOUNT')

--ex19) between������(and�������� �ٸ� ǥ��) : �ʰ�,�̸������� ����Ҽ� ����
--�޿���  10000�̻�  20000������ ����� �����ȣ,�̸�,�޿��� ����Ͻÿ�   --18��
select employee_id, last_name, salary
from EMPLOYEES
where salary >= 10000 and salary <= 20000
-----------------�������� -----------------
select employee_id, last_name, salary
from EMPLOYEES
where salary between 10000 and 20000

--[����1] ����ID�� 'SA_REP' �̰ų� 'AD_PRES' �̸鼭, �޿��� 15000�� �ʰ��ϴ� 
--������� �̸�,����ID,�޿��� ����Ͻÿ�
--�̸�        ����ID            ��  ��
-- --------------------------------------
--King       AD_PRES            24000��
select last_name �̸�, job_id ����ID, '��' || salary "��  ��"
from EMPLOYEES
where job_id in ('SA_REP', 'AD_PRES') and salary > 15000
------------------------------------------------------------------------------
--[����2] Employees���̺��� ����ID�� �ߺ����� �ʰ� ǥ���ϴ� ���Ǹ� �ۼ��Ͻÿ�
-- JOB_ID
-- ---------
--AC_ACCOUNT
--AC_MGR
--     :
select distinct job_id
from EMPLOYEES
-----------------------------------------------------------------------------
--[����3] �Ի����� 03���� ������� �����ȣ,�̸�,�Ի����� ǥ���Ͻÿ�
select employee_id, last_name, hire_date
from EMPLOYEES
where hire_date like '03%'