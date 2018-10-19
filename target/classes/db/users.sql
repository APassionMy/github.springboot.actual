create database hr CHARACTER SET utf8
use hr
drop table Users
create table Users(
	Id int primary key  not null, 
	usename varchar(30),
	age int not null,
	birthday varchar(30)
);

select * from Users

insert into Users(id,usename,age,birthday) value(02,'as',20,'2018-02-02');

select * from study


