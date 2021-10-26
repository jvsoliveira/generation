create database db_rh;

use db_rh;

drop table empresa;

create table empresa(
id_rh bigint not null auto_increment,
nome varchar (255) not null,
cpf bigint not null,
funcao varchar(255),
remuneracao decimal(7, 2) not null,
primary key (id_rh)
);

insert into empresa(nome, cpf, funcao, remuneracao) value ("João", 389898456, "Gerente", 3000.00);
insert into empresa(nome, cpf, funcao, remuneracao) value ("Maria", 678456345, "CEO", 15000.00);
insert into empresa(nome, cpf, funcao, remuneracao) value ("José", 098899632, "Porteiro", 1000.00);
insert into empresa(nome, cpf, funcao, remuneracao) value ("Lucas", 045874320, "Diretor", 2500.00);
insert into empresa(nome, cpf, funcao, remuneracao) value ("Luiza", 865673201, "Gerente", 3000.00);

select * from empresa where remuneracao > 2000;
select * from empresa where remuneracao < 2000;

update empresa set remuneracao = 4000.00 where cpf= 389898456;


