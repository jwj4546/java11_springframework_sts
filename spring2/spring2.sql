create table sample2 (num int, title varchar2(50), contents varchar2(100), res TIMESTAMP default sysdate);

select * from sample2;

insert into sample2 values (1, '샘플1', '내용1', default);
insert into sample2 values (2, '샘플2', '내용2', default);
insert into sample2 values (3, '샘플3', '내용3', default);

commit;

