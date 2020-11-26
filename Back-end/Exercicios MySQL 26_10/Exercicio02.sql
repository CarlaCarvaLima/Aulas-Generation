-- criar um banco de dados
create database db_produtos;
use db_produtos;
-- criar tabela
create table tb_produtos(
id bigint auto_increment,
nome_produto varchar(25) not null,
tipo varchar(20) not null,
disponibilidade boolean,
valor decimal not null,
primary key(id)
);

-- cadastrar dados
insert into tb_produtos (nome_produto, tipo, valor) values ("Televisão","Eletrodoméstico",6000.00);
insert into tb_produtos (nome_produto, tipo, valor) values ("Celular","Eletroportátil",3500.00);
insert into tb_produtos (nome_produto, tipo, valor) values ("Geladeira","Eletrodoméstico",2500.00);
insert into tb_produtos (nome_produto, tipo, valor) values ("Microondas","Eletrodoméstico",500.00);
insert into tb_produtos (nome_produto, tipo, valor) values ("Liquidificador","Eletrodoméstico",200.00);
insert into tb_produtos (nome_produto, tipo, valor) values ("Lavadora","Eletrodoméstico",2600.00);
insert into tb_produtos (nome_produto, tipo, valor) values ("Secadora","Eletrodoméstico",2200.00);
insert into tb_produtos (nome_produto, tipo, valor) values ("Chapinha","Eletrodoméstico",200.00);

-- retornar produtos com valor superior a > 500
	select * from tb_produtos where valor > 500;
-- retornar produtos com valor inferior a < 500   
	select * from tb_produtos where valor < 500;
    
-- atualizar um dado desta tabela
update tb_produtos set nome_produto = "Chapinha", valor = 100.00 where id=8;

select * from tb_produtos;
