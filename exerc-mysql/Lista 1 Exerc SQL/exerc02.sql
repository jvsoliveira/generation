create database loja;

use loja;

create table produtos(
id_produto bigint auto_increment,
nome_produto varchar (255)not null,
quantidade int (255) not null,
marca varchar (255) not null,
preço decimal (7, 2) not null,
primary key (id_produto)
);

insert into produtos(nome_produto, quantidade, marca, preço) values ("Shorts", 50, "Nike", 49.90);
insert into produtos(nome_produto, quantidade, marca, preço) values ("Camiseta", 30, "Puma", 39.90);
insert into produtos(nome_produto, quantidade, marca, preço) values ("Tenis", 25, "Addidas", 350.90);
insert into produtos(nome_produto, quantidade, marca, preço) values ("Calça", 17, "Jeans", 178.90);
insert into produtos(nome_produto, quantidade, marca, preço) values ("Blusa", 12, "Mormai", 230.00);
insert into produtos(nome_produto, quantidade, marca, preço) values ("Meias", 200, "Lupo", 19.90);
insert into produtos(nome_produto, quantidade, marca, preço) values ("Saia", 96, "Handbook", 150.00);
insert into produtos(nome_produto, quantidade, marca, preço) values ("Tenis", 27, "Mizuno", 899.99);

select * from produtos where preço > 500;
select * from produtos where preço < 500;
update produtos set preço = 290.00 where id_produto = 3;