use sys;
create table sample3 (num int, title varchar(50), contents varchar(100), res DATETIME default current_timestamp);

select * from sample3;

insert into sample3 values (1, '샘플1', '내용1', default);
insert into sample3 values (2, '샘플2', '내용2', default);
insert into sample3 values (3, '샘플3', '내용3', default);

commit;