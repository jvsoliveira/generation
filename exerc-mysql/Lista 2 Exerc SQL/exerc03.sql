create database db_farmacia_do_bem;
use db_farmacia_do_bem;

create table tb_categoria (
	id_categ bigint auto_increment,
    nome_categ varchar(30) not null,
    depart varchar(30) not null,
    
    primary key (id_categ)
);

create table tb_produto (
	id_produto bigint auto_increment,
    nome varchar (90) not null,
	preco real not null,
    receita boolean not null,
	estoque int (3),
    
    key_categoria bigint,
    primary key (id_produto),
    foreign key (key_categoria) references tb_categoria(id_categ)    
);

select * from tb_categoria;

insert into tb_categoria (nome_categ, depart) 
		values  ("Calmantes", "Medicamentos"),
				("Aparelhos e medidores", "Saúde" ),
                ("Creme Facial", "Cosméticos"),
                ("Multivitamínicos", "Suplementos"),
                ("Tornozeleiras", "Ortopedia e Acessórios");				                

select * from tb_produto;

insert into tb_produto (nome, preco, receita, estoque, key_categoria)
	values  ("Valerimed 50mg", 9.09, false, 362, 1),
			("Rivotril 2,5mg", 20.99, true, 859, 1),
			("Sensor FreeStyle Libre c/ 1 unid", 259.90, false, 27, 2),
            ("Medidor de Glicose FreeStyle Optinum Neo c/ 1 unid", 80.99, false, 53, 2),
            ("Mineral 89 Vichy Sérum Facial com 30ml", 96.00, false, 164, 3),
            ("Centrum 30 Gomas", 40.69, false, 398, 4),
            ("Vitasay 50+ 60 comprimidos", 99.90, false, 128, 4),
            ("Needs Estabilizador de Tornozelo", 44.90, false, 53, 5);

select * from tb_produto where preco > 40.00;
select * from tb_produto where preco < 35.00;
select * from tb_produto where preco between 3 and 60;
select * from tb_produto where nome like "A%";

select * from tb_categoria inner join tb_produto on tb_categoria.id_categ = tb_produto.key_categoria 
	order by tb_produto.nome;

select * from tb_categoria inner join tb_produto on tb_categoria.id_categ = tb_produto.key_categoria 
	where tb_categoria.depart = "Cosméticos";

            
            
