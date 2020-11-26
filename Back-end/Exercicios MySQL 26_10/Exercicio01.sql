-- criar um banco de dados
create database db_funcionarios_rh;
use db_funcionarios;
-- criar tabela
create table tb_funcionarios(
id bigint auto_increment,
nome varchar(25) not null,
cargo varchar(20) not null,
contrato boolean,
salario decimal not null,
primary key(id)
);

-- cadastrar dados
insert into tb_funcionarios (nome, cargo, salario) values ("Marina","Dev Java",3500.00);
insert into tb_funcionarios (nome, cargo, salario) values ("Monica","Recepcionista",1800.00);
insert into tb_funcionarios (nome, cargo, salario) values ("Caio","Comprador",2400.00);
insert into tb_funcionarios (nome, cargo, salario) values ("Eduardo","Scrum Master",5500.00);
insert into tb_funcionarios (nome, cargo, salario) values ("Helena","Contadora",3500.00);

-- retornar funcionarios com salario > 2000
	select * from tb_funcionarios where salario > 2000;
-- retornar funcionarios com salario < 2000   
	select * from tb_funcionarios where salario < 2000;
    
-- atualizar um dado desta tabela
update tb_funcionarios set cargo = "Recepcionista", salario = 2500.00 where id=2;

select * from tb_funcionarios;
