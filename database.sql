use master

if DB_ID('QLTV') is not null
	drop database QLTV
go

create database QLTV

go

use QLTV

create table users
(
	id int not null primary key identity(1,1),
	name nvarchar(50),
	username nvarchar(50),
	password nvarchar(10),
	type varchar(10)
)

insert into users(name, username, password, type) values ('Bui Ngoc Minh', 'minhnora98', '123456', 'admin');