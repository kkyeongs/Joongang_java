[SET operator]
�ΰ� �̻��� ��������� �ϳ��� ���ս�Ű�� ������

1. UNION      : ���������� ��� ����(�ߺ� ����� 1���� ����)     --> ������
2. UNION  ALL : ���������� ��� ����(�ߺ� ����� ��� ����)  
3. INTERSECT  : �������� ����� ��� ���ԵǴ� �ุ ǥ��          --> ������
4. MINUS      : ����1����� ���Եǰ� ����2������� ���Ե��� �ʴ� �ุ ǥ�� -->������

[���������̺�]
drop table employees_role purge;

create table employees_role
as  select * from employees  where 1=0;         -- ���̺� ������ ����

select * from tab;
select * from employees_role;

insert into employees_role  values(101,'Neena','Kochhar','NKOCHHAR','515.123.4568',
'2005-09-21','AD_VP',17000.00,NULL,100,90);

insert into employees_role  values(101,'Neeno','Kochhar','NKOCHHAR','515.123.4568',
'2005-09-21','AD_VP',17000.00,NULL,100,90);

insert into employees_role values(300,'Harry','Potter','porter','010.123.4567',
'2007-03-01','IT_PROG',23000.00,NULL,100,90);
commit;

select * from employees_role;

delete from employees_role where first_name='Harry';
==================================================================================
--ex1) union 
--     employees���̺�� employees_role���̺��� union���� �����Ͻÿ�  ==> 108���ڵ�
--     ����1) employee_id, last_name�� ������� �ߺ����� �Ͻÿ�
--     ����2) ���
--               emoloyee_id   last_name
--               ----------------------------

--employee_id   first_name    last_name
--101              Neena         Kochhar   <-- employees , employees_role�Ѵ� ����
--101              Neeno         Kochhar   <-- employees_role���� ����
select employee_id, last_name
from employees
union 
select employee_id, last_name
from employees_role
order by 1

-- 109���ڵ� ��� ǥ��
select employee_id, first_name, last_name
from employees
union 
select employee_id, first_name, last_name
from employees_role
order by 1

--ex2) union all
--     employees���̺�� employees_role���̺��� union all���� �����Ͻÿ�  ==> 110���ڵ�
--     ����1) employee_id, last_name�� ������� �ߺ� �Ͻÿ�
--     ����2) ���
--               emoloyee_id   last_name
--               ----------------------------
select employee_id, last_name
from employees
union all
select employee_id, last_name
from employees_role
order by 1

--ex3) minus
--    employees_role�� �ߺ��Ǵ� ���ڵ�� �����ϰ� employees���� �ִ� �������� 
--    ���Ͻÿ� (��, employee_id, last_name�� ǥ��)   ==> 106 ���ڵ�
  
--     emoloyee_id   last_name
--     ----------------------------
select employee_id, last_name
from employees
minus
select employee_id, last_name
from employees_role

--ex4) intersect(������) �ߺ��Ǵ� ���� ã��
--     employees�� employees_role���� �ߺ��Ǵ� ���ڵ��� �������� ���Ͻÿ�
--     (��, employee_id, last_name�� ǥ��)   ==> 1 ���ڵ�
select employee_id, last_name
from employees
intersect
select employee_id, last_name
from employees_role

--ex5) employees�� employees_role����  �ߺ��Ǵ� ���ڵ��� �������� ���Ͻÿ�  ==> 1 ���ڵ�
--        ����1) ����̸�, ����ID,�Ի����� ǥ���Ͻÿ�
--        ����2) �μ���ȣ�� 90�λ���� ǥ���Ͻÿ�
select last_name ����̸�, job_id ����ID, hire_date �Ի���
from employees
where department_id=90
intersect
select last_name ����̸�, job_id ����ID, hire_date �Ի���
from employees_role
where department_id=90


--ex6) union������ �̿��Ͽ� 50�� �μ����� ��ǥ�̻�� ������ ���Ͻÿ�
--employee_id     last_name    ����
---------------------------------------
--100             King         ��ǥ�̻�              
--120             Weiess         ����
--121             Fripp          ���� 
--                 :
--(�м�) select * from employees where department_id=50;
select employee_id, last_name, '��ǥ�̻�'"����"
from employees 
where employee_id=100
union 
select employee_id, last_name, '����'"����"
from employees 
where department_id=50

--ex7) ��Ÿ
select 'SQL�� �����ϰ� �ֽ��ϴ�' ����, 3 ���� from dual
union
select 'it programmer ��������', 1 from dual
union
select '���� ����ְ�', 2 from dual
order by 2 asc;

--ex8) SET operator��  IN operator����
--job_title��   'Stock Manager' �Ǵ�  'Programmer'�� ������� ������ job_title�� ǥ���Ͻÿ�
--last_name       job_title
--------------------------------
--Kaufling        StockManager
--Hunlod          Programmer
--           :
-- join, in ������ ���
select last_name, job_title
from employees
join jobs using(job_id)
where job_title in('Stock Manager', 'Programmer')

-- join, union ������ ���
select last_name, job_title
from employees
join jobs using(job_id)
where job_title='Stock Manager'
union
select last_name, job_title
from employees
join jobs using(job_id)
where job_title='Programmer'


--ex9) �÷����� �ٸ������ SET operator
--     : ����1�� ����2�� select ����� �ݵ�õ���(�÷�����,������Ÿ��)�ؾ� �ϹǷ� 
--       �̸� ���� Dummy Column�� ����Ҽ� �ִ�
select last_name, employee_id, hire_date
from employees
where department_id=20
union
select department_name, department_id, null
from departments
where department_id=20





















