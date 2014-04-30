drop database if exists booksdb;
create database booksdb;

use booksdb;

create table users (
	username	varchar(20) not null primary key,
	userpass	char(32) not null,
	name		varchar(70) not null,
	email		varchar(255) not null
);

create table user_roles (
	username			varchar(20) not null,
	rolename 			varchar(20) not null,
	foreign key(username) references users(username) on delete cascade,
	primary key (username, rolename)
);

create table books (
	bookid			int not null auto_increment,
	titulo			varchar(40) not null,
	autor			varchar(20) not null,
	lengua			varchar(20) not null,
	edicion			varchar(20) not null,
	editorial		varchar(20) not null,
	fechae			date not null,
	fechai			date not null,
	primary key (bookid)
);

create table review (
	reviewid		int not null auto_increment,
	bookid			int not null,
	username		varchar(20) not null,
	fecha			date not null,
	review_text		text(200) not null,
	primary key (bookid, username),
	foreign key (bookid) references books(bookid) on delete cascade,
	foreign key (username) references users(username) on delete cascade
);

