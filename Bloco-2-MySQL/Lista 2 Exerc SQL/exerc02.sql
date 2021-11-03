create database db_pizzaria_legal;
use db_pizzaria_legal;


create table tb_categoria(
	id_categ bigint auto_increment,
	tamanho enum ("P", "M", "G"),
    borda enum("Sim", "Não"),
    tipo enum ("Doce", "Salgada"),
     
	primary key(id_categ)
    );

create table tb_pizza(
	id_pizza bigint auto_increment,
    sabor varchar(35) not null,
    preco decimal(10,2),
    borda enum ("Calabresa", "Cheddar", "Catupiry", "Cream Cheese", "Chocolate", "Nenhum"),
    id_categoria bigint,
        
    primary key (id_pizza),
    foreign key(id_categoria) references tb_categoria(id_categ)
);

insert into tb_categoria (tamanho, borda, tipo) 
	values  ("P", "Sim", "Salgada"),
			("M", "Sim", "Salgada"),
			("G", "Sim", "Salgada"),
            ("P", "Sim", "Doce"),
			("M", "Sim", "Doce"),
			("P", "Não", "Salgada"),
			("M", "Não", "Salgada"),
			("G", "Não", "Salgada"),
            ("P", "Não", "Doce"),
			("M", "Não", "Doce");
            
insert into tb_pizza (sabor, preco, borda, id_categoria) 
	values  ("Mussarela", 34.00, "Cream Cheese", 3),
			("Margherita", 38.00, "Cheddar", 3),
            ("Alho Poró", 36.00, "Catupiry", 6),
            ("Brigadeiro", 20.00, "Nenhum", 9),
            ("Portuguesa", 37.00, "Nenhum", 7),
            ("Calabresa", 32.00, "Cheddar", 2),
            ("4 Queijos", 38.00, "Nenhum", 7),
            ("Baiana", 38.00, "Catupiry", 2);

select * from tb_pizza where preco < 45.00;
select * from tb_pizza where preco between 29.00 and 60.00;
select * from tb_pizza where sabor like "C%";
select * from tb_pizza inner join tb_categoria on tb_categoria.id_categ = tb_pizza.id_categoria
	order by tb_pizza.id_pizza;
select * from tb_pizza inner join tb_categoria on tb_categoria.id_categ = tb_pizza.id_categoria 
	and tb_categoria.tipo = "Doce";