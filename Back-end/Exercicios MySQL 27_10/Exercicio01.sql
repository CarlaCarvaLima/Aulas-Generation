-- criar banco de dados
create database db_RH2;
use db_RH2;

-- criar tabela de cargos
create table tb_cargo(
	cargo_id bigint auto_increment,
	cargo varchar(30) not null,
    setor varchar(15) not null,
    primary key(cargo_id)
);

-- criar tabela de funcionarios
create table tb_funcionario(
	funcionario_id bigint auto_increment,
    nome varchar(30),
    cargo_id bigint not null, -- foreign key
    matricula bigint,
    salario double,
    primary key(funcionario_id),
    foreign key(cargo_id) references tb_cargo(cargo_id)
);

-- populando dados em tb_cargo
insert into tb_cargo(cargo, setor) values("Dev Java Pleno","TI");
insert into tb_cargo(cargo, setor) values("Dev Java Jr","TI");
insert into tb_cargo(cargo, setor) values("Analista Fiscal","Dep. Fiscal");
insert into tb_cargo(cargo, setor) values("Auxiliar Administrativo","Administrativo");
insert into tb_cargo(cargo, setor) values("Analista de Compras","Dep. de Compras");

-- populando dados em tb_funcionario
insert into tb_funcionario(nome,matricula,salario,cargo_id) 
	values("Monica Catarina", 21457, 2600, 3);
insert into tb_funcionario(nome,matricula,salario,cargo_id) 
	values("Jade Sales ", 32574, 4020, 1);
insert into tb_funcionario(nome,matricula,salario,cargo_id) 
	values("Luis Sousa", 45321, 3500, 2);
insert into tb_funcionario(nome,matricula,salario,cargo_id) 
	values("Eunice Veloso", 96587, 1000, 2);
insert into tb_funcionario(nome,matricula,salario,cargo_id) 
	values("Mario Almeida", 12478, 2300, 5);
insert into tb_funcionario(nome,matricula,salario,cargo_id) 
	values("Eduardo Fagundes", 33657, 4100, 3);
insert into tb_funcionario(nome,matricula,salario,cargo_id) 
	values("Roberta Matias", 66987, 1600, 4);
insert into tb_funcionario(nome,matricula,salario,cargo_id) 
	values("Cristina Meireles", 11254, 6300, 5);
insert into tb_funcionario(nome, matricula, salario, cargo_id)
	values("Rebeca Almeida",88974, 1200, 2);
insert into tb_funcionario(nome, matricula, salario, cargo_id)
	values("Vera Lima", 22185, 5100, 3);
insert into tb_funcionario(nome, matricula, salario, cargo_id)
	values("Diana Oliveira", 24226, 2900, 1);
insert into tb_funcionario(nome, matricula, salario, cargo_id)
	values("Jose Carlos", 66599, 2800, 5);
insert into tb_funcionario(nome, matricula, salario, cargo_id)
	values("Mariana Silva", 55233, 1700, 4);
insert into tb_funcionario(nome, matricula, salario, cargo_id)
	values("Heloisa Vono", 11125, 3090, 2);
insert into tb_funcionario(nome, matricula, salario, cargo_id)
	values("Vania Buenas", 66993, 4100,1);
    
-- busca funcionario com salario > 2000
select * from tb_funcionario where salario > 2000;

-- busca funcionario com salario entre 1000 ~ 2000
select * from tb_funcionario where salario > 1000 and salario < 2000;

-- buscar funcionario com nome com a letra C 
select * from tb_funcionario where nome like "c%";