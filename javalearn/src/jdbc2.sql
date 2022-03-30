CREATE TABLE students(
     stu_id NUMBER(2) 
    ,stu_name VARCHAR2(20)
    ,stu_score NUMBER(5)
);   

SELECT*
FROM students;

DROP sequence stu_seq;

INSERT INTO students VALUES (STU_SEQ.nextval, '민우', 300);

create sequence stu_seq
    increment by 1
    start with 1
    MINVALUE 1
    maxvalue 9000;
    
update students
set stu_name = '재훈'
where stu_id = 2;

commit;
ROLLBACK;


create table bank(
     bank_name varchar2(50)
    ,bank_account number(10)

);

insert into bank values ('김사장', 10000000);
insert into bank values ('정대리', 2000000);

select*
from bank;
commit;

update
    bank
    set bank_account = bank_account -2500000
where 1=1
and bank_name = '민우';

