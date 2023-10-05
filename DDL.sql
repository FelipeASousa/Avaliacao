drop schema if exists spring;

drop user if exists 'user'@'localhost';

create schema spring;

create user 'user'@'localhost' identified by 'pass123';

grant select, insert, delete, update on spring.* to user@'localhost';
use spring;

create table cpm_compromisso (
	cpm_id bigint primary key auto_increment, 
	cpm_nome varchar(100) not null,
	cpm_data_hora datetime not null,
	cpm_duracao_prevista float not null,
	cpm_cep bigint,
	cpm_numero int
);

insert into cpm_compromisso ( cpm_nome, cpm_data_hora, cpm_duracao_prevista)
values ('Dentista', '2023-10-5 16:00:00', 0.5);
insert into cpm_compromisso ( cpm_nome, cpm_data_hora, cpm_duracao_prevista, cpm_cep, cpm_numero)
values ('Prova', '2023-10-4 21:25:00', 1.5, 12247014, 1350);