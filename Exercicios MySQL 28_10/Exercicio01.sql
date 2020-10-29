create database db_cidade_das_carnes;
use db_cidade_das_carnes;

create table tb_categoria(
	cat_id bigint auto_increment,
    descricao varchar(255) not null, 
    disponibilidade boolean not null,
    primary key(cat_id)
);

insert into tb_categoria(descricao, disponibilidade) values ("Aves", true);
insert into tb_categoria(descricao, disponibilidade) values ("Suíno", true);
insert into tb_categoria(descricao, disponibilidade) values ("Bovino", true);
insert into tb_categoria(descricao, disponibilidade) values ("Acessorios para churrasco", true);
insert into tb_categoria(descricao, disponibilidade) values ("Bebidas", true);

create table tb_produto(
	prod_id bigint auto_increment,
    nome varchar(255) not null,
    valor decimal(10,2) not null,
    quantidade int not null,
    cat_id bigint not null, -- id foreign key
    primary key(prod_id),
    foreign key(cat_id) references tb_categoria(cat_id)
);

insert into tb_produto(nome, valor, quantidade, cat_id) 
	values ("Asinha", 8.99, 87, 1);
insert into tb_produto(nome, valor, quantidade, cat_id)
	values("Linguiça", 7.99, 39, 2);
insert into tb_produto(nome, valor, quantidade, cat_id)
	values("Coxão duro", 11.99, 77, 3);
insert into tb_produto(nome, valor, quantidade, cat_id)
	values("Churrasqueira inox", 149.99, 26, 4);
insert into tb_produto(nome, valor, quantidade, cat_id)
	values("Cerveja", 1.99, 19, 5);
insert into tb_produto(nome, valor, quantidade, cat_id)
	values("Pé de galinha", 2.50, 14, 1);
insert into tb_produto(nome, valor, quantidade, cat_id)
	values ("Carvão", 3.99, 41, 4);
insert into tb_produto(nome, valor, quantidade, cat_id)
	values("Bacon", 5.99, 79, 2);

select * from tb_produto where valor > 50;
select * from tb_produto where valor > 3 and valor < 60;
select * from tb_produto where nome like "co%";

-- Faça um um select com Inner join entre tabela categoria e produto.
select tb_produto.nome, tb_produto.valor, tb_categoria.descricao from tb_produto
	inner join tb_categoria on tb_categoria.cat_id = tb_produto.prod_id;
        
-- Faça um select onde traga todos os Produtos de uma categoria específica
select tb_produto.nome, tb_produto.valor, tb_categoria.descricao from tb_produto
	inner join tb_categoria on tb_categoria.cat_id = tb_produto.prod_id
		where tb_categoria.descricao = "Aves";