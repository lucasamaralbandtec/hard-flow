create database monitoramento;

use monitoramento;

create table usuario(
idUser int not null auto_increment primary key,
Username varchar (45),
password varchar (10),
telefone varchar (11),
email varchar (45),
fkmaq int,
foreign key usuario (fkmaq) references maquina (idMaquina)
);

create table maquina(
idMaquina int not null auto_increment primary key,
memoria varchar (20),
Central_Processing_Unit varchar (20),
disco varchar (20),
fkUser int
);

create table capturaDeLog(
idLog int not null auto_increment primary key,
tipoLog varchar (20),
dataHoraGerado datetime,
linhaDeErro varchar (20)
);
 
alter table maquina add constraint foreign key maquina (fkUser) REFERENCES usuario (idUser);
 
select * from capturaDeLog;
select * from usuario;
select * from maquina;