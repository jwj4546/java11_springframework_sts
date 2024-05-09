create table sample (num int, title varchar2(50), res TIMESTAMP default sysdate);

select * from sample;

insert into sample values (1, '샘플1', '내용1', default);
insert into sample values (2, '샘플2', '내용2', default);
insert into sample values (3, '샘플3', '내용3', default);

commit;

select num from (select * from sample order by num desc) where rownum=1;

select * from stage;

create table stage (storeNum int, storeName varchar2(50));

drop table stage;

commit;