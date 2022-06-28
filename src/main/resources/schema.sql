CREATE TABLE test_db(
noticId Long auto_increment,
title VARCHAR(30) not null,
content varchar(30) not null,
name varchar(30) not null,
primary key(noticId)
);

INSERT INTO test_db(title,content,name) VALUES('제목','내용','이름');