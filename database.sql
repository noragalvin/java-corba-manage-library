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
	type varchar(10),
	status bit default 1
)

create table categories
(
	id int not null primary key identity(1,1),
	categoryName nvarchar(50),
	status bit default 1
)

create table books
(
	id int not null primary key identity(1,1),
	bookName nvarchar(50),
	publishingCompany nvarchar(50),
	createdAt datetime,
	inventory int,
	borrowAmount int,
	status bit default 1,
	author nvarchar(50),
	categoryID int foreign key references categories(id) on update cascade
)

create table readers
(
	id int not null primary key identity(1,1),
	readerName nvarchar(50),
	birthday datetime,
	address nvarchar(100),
	phoneNumber nvarchar(20),
	gender nvarchar(10),
	email nvarchar(20),
	status bit default 1
)

create table bills
(
	id int not null primary key identity(1,1),
	readerID int foreign key references readers(id) on update cascade,
	createdAt datetime,
	deadline datetime,
	status bit default 0
)

create table bill_details
(
	billID int foreign key references bills(id) on update cascade,
	bookID int foreign key references books(id) on update cascade,
	borrowAmount int,
	primary key(bookID, billID)
)

insert into users(name, username, password, type) values ('Bui Ngoc Minh',  'minhnora98', '123456', 'admin');
insert into users(name, username, password, type) values ('Bui Ngoc Minh1', 'minhnora981', '123456', 'user');
insert into users(name, username, password, type) values ('Bui Ngoc Minh2', 'minhnora982', '123456', 'user');
insert into users(name, username, password, type) values ('Bui Ngoc Minh3', 'minhnora983', '123456', 'user');
insert into users(name, username, password, type) values ('Bui Ngoc Minh4', 'minhnora984', '123456', 'admin');

insert into categories(categoryName) values ('The Loai 1');
insert into categories(categoryName) values ('The Loai 2');
insert into categories(categoryName) values ('The Loai 3');

insert into books(bookName, publishingCompany, createdAt, inventory, borrowAmount, categoryID, author) values ('Sach 1', 'NXB 1', '2019-08-08', 50, 5, 1, 'Tac gia 1');
insert into books(bookName, publishingCompany, createdAt, inventory, borrowAmount, categoryID, author) values ('Sach 2', 'NXB 2', '2019-09-08', 50, 2, 2, 'Tac gia 2');
insert into books(bookName, publishingCompany, createdAt, inventory, borrowAmount, categoryID, author) values ('Sach 3', 'NXB 3', '2019-05-08', 50, 6, 3, 'Tac gia 3');
insert into books(bookName, publishingCompany, createdAt, inventory, borrowAmount, categoryID, author) values ('Sach 4', 'NXB 1', '2019-01-08', 50, 11, 1, 'Tac gia 1');
insert into books(bookName, publishingCompany, createdAt, inventory, borrowAmount, categoryID, author) values ('Sach 5', 'NXB 2', '2019-08-08', 50, 7, 2, 'Tac gia 2');
insert into books(bookName, publishingCompany, createdAt, inventory, borrowAmount, categoryID, author) values ('Sach 6', 'NXB 3', '2019-03-08', 50, 0, 3, 'Tac gia 3');
insert into books(bookName, publishingCompany, createdAt, inventory, borrowAmount, categoryID, author) values ('Sach 7', 'NXB 1', '2019-08-08', 50, 1, 1, 'Tac gia 1');
insert into books(bookName, publishingCompany, createdAt, inventory, borrowAmount, categoryID, author) values ('Sach 8', 'NXB 2', '2019-06-08', 50, 0, 2, 'Tac gia 2');
insert into books(bookName, publishingCompany, createdAt, inventory, borrowAmount, categoryID, author) values ('Sach 9', 'NXB 3', '2019-08-08', 50, 6, 3, 'Tac gia 3');
insert into books(bookName, publishingCompany, createdAt, inventory, borrowAmount, categoryID, author) values ('Sach 10', 'NXB 1', '2019-08-02', 50, 2, 1, 'Tac gia 1');
insert into books(bookName, publishingCompany, createdAt, inventory, borrowAmount, categoryID, author) values ('Sach 11', 'NXB 2', '2019-08-01', 50, 2, 2, 'Tac gia 2');
insert into books(bookName, publishingCompany, createdAt, inventory, borrowAmount, categoryID, author) values ('Sach 12', 'NXB 3', '2019-08-04', 50, 4, 3, 'Tac gia 3');

insert into readers(readerName, birthday, address, phoneNumber, gender, email) values('Khach 1', '1998-08-02', 'Ha Noi 1', '123456', 'Nam', 'nora1@gempages.help');
insert into readers(readerName, birthday, address, phoneNumber, gender, email) values('Khach 2', '1998-08-04', 'Ha Noi 2', '123456', 'Nu', 'nora2@gempages.help');
insert into readers(readerName, birthday, address, phoneNumber, gender, email) values('Khach 3', '1998-02-08', 'Ha Noi', '123456', 'Nam', 'nora3@gempages.help');
insert into readers(readerName, birthday, address, phoneNumber, gender, email) values('Khach 4', '1998-06-08', 'Ha Noi 1', '123456', 'Nam', 'nora4@gempages.help');
insert into readers(readerName, birthday, address, phoneNumber, gender, email) values('Khach 5', '1998-08-01', 'Ha Noi 2', '123456', 'Nam', 'nor5a@gempages.help');
insert into readers(readerName, birthday, address, phoneNumber, gender, email) values('Khach 6', '1998-12-08', 'Ha Noi', '123456', 'Nam', 'nora6@gempages.help');
insert into readers(readerName, birthday, address, phoneNumber, gender, email) values('Khach 7', '1998-08-11', 'Ha Noi', '123456', 'Nam', 'nora7@gempages.help');

select * from readers;
SELECT TOP 1 * FROM readers ORDER BY id DESC;
