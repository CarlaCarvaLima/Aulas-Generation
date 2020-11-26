create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;

create table tb_categoria(
	cat_id bigint auto_increment,
    descricao varchar(255) not null, 
    disponibilidade boolean not null,
    primary key(cat_id)
);

insert into tb_categoria(descricao, disponibilidade) values ("Elétrica", true);
insert into tb_categoria(descricao, disponibilidade) values ("Hidráulica", true);
insert into tb_categoria(descricao, disponibilidade) values ("Área externa", true);
insert into tb_categoria(descricao, disponibilidade) values ("Decoração", true);
insert into tb_categoria(descricao, disponibilidade) values ("Construção", true);

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
	values ("Tomada", 4.99, 78, 1);
insert into tb_produto(nome, valor, quantidade, cat_id)
	values("Cano PVC", 11.99, 13, 2);
insert into tb_produto(nome, valor, quantidade, cat_id)
	values("Grama sintética", 23.99, 99, 3);
insert into tb_produto(nome, valor, quantidade, cat_id)
	values("Quadro Unicórnio Psicodélico", 198.50, 62, 4);
insert into tb_produto(nome, valor, quantidade, cat_id)
	values("Cimento", 7.99, 39, 5);
insert into tb_produto(nome, valor, quantidade, cat_id)
	values("Tijolo", 2.50, 78, 5);
insert into tb_produto(nome, valor, quantidade, cat_id)
	values ("Portão em aço", 479.99, 6, 3);
insert into tb_produto(nome, valor, quantidade, cat_id)
	values("Lâmpada 7W", 5.99, 41, 1);

select * from tb_produto where valor > 50;
select * from tb_produto where valor > 3 and valor < 60;
select * from tb_produto where nome like "ci%";

select tb_produto.nome, tb_produto.valor, tb_categoria.descricao from tb_produto
	inner join tb_categoria on tb_categoria.cat_id = tb_produto.prod_id;
        
select tb_produto.nome, tb_produto.valor, tb_categoria.descricao from tb_produto
	inner join tb_categoria on tb_categoria.cat_id = tb_produto.prod_id
		where tb_categoria.descricao = "Elétrica";