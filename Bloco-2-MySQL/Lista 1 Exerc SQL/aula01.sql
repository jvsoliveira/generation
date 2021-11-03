create database db_acervo35;

create table tb_usuario(
	id_usuario bigint auto_increment,
    nome varchar(255) not null,
    email varchar(255) not null,
    nascimento_data date,
    senha varchar(255) not null,
    primary key (id_usuario)
);

select * from db_acervo35.tb_usuario;

insert into tb_usuario (nome, email, nascimento_data, senha)
	values ("Lissa", "email@email.com", '1995-01-30', "123456");
    
update `db_acervo35`.`tb_usuario` set `senha`='333' where(`id_usuario`='1');

alter table tb_usuario add livro varchar(30);