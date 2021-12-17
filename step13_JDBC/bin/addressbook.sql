--계정바꾸기 (edu/1234)
select * from tab;
drop table addressbook purge;

create table addressbook(
num number primary key,
name varchar2(10) not null,
phone varchar2(15),
addr varchar2(70));

create sequence num_seq increment by 1 start with 1 nocycle nocache;
drop sequence num_seq;

insert into addressbook(num,name,phone,addr) values(num_seq.nextval,'aaa','010-111-1111','서울');
insert into addressbook(num,name,phone,addr) values(num_seq.nextval,'bbb','010-222-2222','울릉도');
insert into addressbook(num,name,phone,addr) values(num_seq.nextval,'ccc','010-333-3333','제주도');

select * from addressbook;

