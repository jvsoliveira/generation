create database escola;

use escola;

create table alunos(
id_aluno int not null auto_increment,
nome varchar(255) not null,
ano varchar(255) not null,
turma char not null, 
nota decimal(4, 2),
primary key (id_aluno)
);

insert into alunos(nome, ano, turma, nota) values ("Carlos", "1°", "A", 9.0);
insert into alunos(nome, ano, turma, nota) values ("Maria", "3°", "A", 4.0);
insert into alunos(nome, ano, turma, nota) values ("Lineu", "5°", "B", 3.5);
insert into alunos(nome, ano, turma, nota) values ("Helen", "1°", "A", 6.0);
insert into alunos(nome, ano, turma, nota) values ("Henzo", "6°", "C", 8.0);
insert into alunos(nome, ano, turma, nota) values ("José", "3°", "A", 7.5);
insert into alunos(nome, ano, turma, nota) values ("Tereza", "7°", "C", 3.0);
insert into alunos(nome, ano, turma, nota) values ("Luiza", "8°", "B", 7.0);

select * from alunos where nota > 7;
select * from alunos where nota < 7;

update alunos set nota = 10 where id_aluno = 1;