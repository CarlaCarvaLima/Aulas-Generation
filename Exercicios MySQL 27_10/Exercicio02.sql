-- criar banco de dados
create database db_ecommerce;
use db_ecommerce;

-- criar tabela de categoria
create table tb_categoria(
	categoria_id bigint auto_increment,
	categoria varchar(25) not null,
	primary key(categoria_id)
);

-- criar tabela de produtos
create table tb_produto(
	produto_id bigint auto_increment,
    nome varchar(30),
    valor double,
    ano_fabricacao double,
    categoria_id bigint not null,
    primary key(produto_id),
    foreign key(categoria_id) references tb_categoria(categoria_id)
);

-- populando dados em tb_categoria
insert into tb_categoria(categoria) values("Brinquedos");
insert into tb_categoria(categoria) values("Jogos Eletrônicos");
insert into tb_categoria(categoria) values("Esportes");
insert into tb_categoria(categoria) values("Beleza e Bem Estar");
insert into tb_categoria(categoria) values("Papelaria");

-- populando dados em tb_produto
insert into tb_produto(nome, valor, ano_fabricacao, categoria_id)
	values("Pista Ataque do Tubarão", 1500, 2019, 1);
insert into tb_produto(nome, valor, ano_fabricacao, categoria_id)
	values("Need for Speed Underground", 60, 1999, 2);
insert into tb_produto(nome, valor, ano_fabricacao, categoria_id)
	values("Bola de basquete", 50, 2018, 3);
insert into tb_produto(nome, valor, ano_fabricacao, categoria_id)
	values("Chapinha para cabelo", 120, 2020, 4);
insert into tb_produto(nome, valor, ano_fabricacao, categoria_id)
	values("Caderno Tilibra", 15, 2020, 5);
insert into tb_produto(nome, valor, ano_fabricacao, categoria_id)
	values("Boneco Max Steel ", 90, 2005, 1);
insert into tb_produto(nome, valor, ano_fabricacao, categoria_id)
	values("Crash CTR", 120, 1999, 2);
insert into tb_produto(nome, valor, ano_fabricacao, categoria_id)
	values("Raquete de tênis", 1800, 2018, 3);
insert into tb_produto(nome, valor, ano_fabricacao, categoria_id)
	values("Secador de cabelo", 80, 2020, 4);
insert into tb_produto(nome, valor, ano_fabricacao, categoria_id)
	values("Borracha", 5, 2019, 5);
insert into tb_produto(nome, valor, ano_fabricacao, categoria_id)
	values("Banco Imobiliário", 90, 2012, 1);
insert into tb_produto(nome, valor, ano_fabricacao, categoria_id)
	values("102 Dalmatas PS1", 110, 2000, 2);
insert into tb_produto(nome, valor, ano_fabricacao, categoria_id)
	values("Mesa de ping pong", 400, 2017, 3);
insert into tb_produto(nome, valor, ano_fabricacao, categoria_id)
	values("Barbeador elértrico", 80, 2020, 4);
insert into tb_produto(nome, valor, ano_fabricacao, categoria_id)
	values("Folha sulfite", 20, 2020, 5);
    
-- busca produto com valor superior a 2000    
select * from tb_produto where valor > 2000;

-- busca produto com valor superior a 1000 e inferior que 2000
select * from tb_produto where valor > 1000 and valor < 2000;

-- busca produto com a letra inicial C
select * from tb_produto where nome like "c%";