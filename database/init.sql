drop database if exists demodb;
create database demodb;

use demodb;

drop table if exists info;
create table info(
        id int not null auto_increment,
        message varchar(100) not null,
        primary key (id)
);

drop table if exists added;
create table added(
        id int not null auto_increment,
        m varchar(100) not null,
        primary key (id)
);