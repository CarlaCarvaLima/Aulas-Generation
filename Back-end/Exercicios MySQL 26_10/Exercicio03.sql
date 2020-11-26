-- criar um banco de dados
create database db_alunos;
use db_alunos;
-- criar tabela
create table tb_alunos(
id bigint auto_increment,
nome varchar(25) not null,
periodo varchar(10) not null,
curso varchar(15) not null,
matricula varchar(6) not null,
nota decimal not null,
primary key(id)
);

-- cadastrar dados
insert into tb_alunos (nome, periodo, curso, matricula, nota) 
values ("Vinicius Vono","Manhã","ADS",254783,8);
insert into tb_alunos (nome, periodo, curso, matricula, nota) 
values ("Daniela Silva","Manhã","ADM",547821,5);
insert into tb_alunos (nome, periodo, curso, matricula, nota) 
values ("Pedro Ribeiro","Manhã","Economia",452785,4);
insert into tb_alunos (nome, periodo, curso, matricula, nota) 
values ("Caio Sales","Manhã","Psicologia",632547,7);
insert into tb_alunos (nome, periodo, curso, matricula, nota) 
values ("Monica Cavalante","Noite","Hotelaria",658742,9);
insert into tb_alunos (nome, periodo, curso, matricula, nota) 
values ("Helena Carvalho","Noite","Contabilidade",784565,8);
insert into tb_alunos (nome, periodo, curso, matricula, nota) 
values ("Cristina Portales","Noite","Design Gráfico",957854,5);
insert into tb_alunos (nome, periodo, curso, matricula, nota) 
values ("Leonardo Dereste","Noite","Eng.Química",218475,9);

-- retornar alunos com nota superior superior a > 7
	select * from tb_alunos where nota > 7;
-- retornar alunos com nota inferior a < 7   
	select * from tb_alunos where nota < 7;
    
-- atualizar um dado desta tabela
update tb_alunos set matricula = 254783, nota = 10 where id=1;

select * from tb_alunos;

