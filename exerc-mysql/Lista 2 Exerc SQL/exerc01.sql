create database db_generation_game_online;

use db_generation_game_online;

create table  tb_classe(
	id_classe int not null auto_increment,
    nome_classe varchar(30) ,
    defesa int not null,
	ataque int not null,
    primary key (id_classe)
);

insert into tb_classe(nome_classe, defesa, ataque) values 
("Ladino", 1000, 3000),
("Clérigo", 1000, 1000),
("Mago", 1000, 3000),
("Druida", 1500, 2500),
("Guerreiro", 2500, 2000);


create table tb_personagem (
	id_person int auto_increment,
    nome varchar(30),
	lvl int not null,
	arma varchar(30),
    armadura varchar(30),
    fk_classe int not null,
    primary key (id_person),
    foreign key (fk_classe) references tb_classe(id_classe)
);

insert into tb_personagem (nome, lvl, arma, armadura, fk_classe) values 
("Bilbo", 75, "Ferroada", "Cota de Mithril", 1),
("Gimli", 80, "Machado de Duas Mãos", "Armadura de Placas", 5),
("Légolas", 81, "Arco do Galadhrim", "Armadura de couro", 1),
("Gandalf", 95, "Cajado branco", "Manto branco", 3),
("Radagast", 92, "Cajado de carvalho", "Manto marrom", 4),
("Aragorn",  83, "Andúril", "Armadura de Placas", 5),
("Galadriel", "94", "Nenya", "Vestido branco", 2),
("Arwen", 77, "Hadhafang", "Manto élfico", 2);

select tb_personagem.nome as "Personagem", tb_classe.ataque as "Ataque"
from tb_personagem join tb_classe
on tb_classe.id_classe = tb_personagem.fk_classe
where tb_classe.ataque > 2000;

select tb_personagem.nome as "Personagem", tb_classe.defesa as "Defesa"
from tb_personagem join tb_classe
on tb_classe.id_classe = tb_personagem.fk_classe
where tb_classe.defesa between 1000 and 2000;

select nome from tb_personagem where nome like "%c%";

select tb_personagem.nome as "Nome", tb_classe.nome_classe as "Classe"
from tb_personagem join tb_classe
on tb_classe.id_classe = tb_personagem.fk_classe
where tb_classe.id_classe = 4; 