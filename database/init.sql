drop database if exists demodb;
create database demodb;

use demodb;

drop table if exists Info;
create table Info(
        id int not null auto_increment,
        message varchar(100) not null,
        primary key (id)
);