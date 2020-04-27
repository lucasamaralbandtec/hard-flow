create database Hardflow;

use Hardflow;

create table Endereco(
	ID_Endereco int primary key auto_increment not null,
    Rua varchar(100),
    Numero bigint,
    Bairro varchar(60),
    CEP varchar(8),
    Complemento varchar(30) null,
    Cidade varchar(20),
    Estado varchar(2)
);


create table Unidade(
	ID_Unidade int primary key auto_increment not null,
    Nome_Unidade varchar(45),
    Telefone varchar(10),
    fkEndereco int,
    fkGestor int,
    fkEmpresa int,
    foreign key (fkEndereco) references Endereco(ID_Endereco),
    foreign key (fkGestor) references Gestor(ID_Gestor),
    foreign key (fkEmpresa) references Empresa(ID_Empresa)
);
        
create table Empresa(
	ID_Empresa int primary key auto_increment not null,
    Nome_Empresa varchar(45),
    CNPJ varchar(14)
);

create table Gestor(
	ID_Gestor int primary key auto_increment not null,
    Nome_Gestor varchar(45),
    Senha varchar(45),
    CPF varchar(11),
    Ramal varchar(30)
);

create table Maquina(
	ID_Maquina int primary key auto_increment not null,
    Nome_Maquina varchar(30),
    IP_Maquina varchar(30),
    Gateway varchar(30),
    Proprietario varchar(30),
    Sistema_Operacional varchar(30),
    fkGestor int,
    foreign key (fkGestor) references Gestor(ID_Gestor)
);

create table Dado_Maquina(
	ID_Dado int primary key auto_increment not null,
    C_P_U int,
    Memoria varchar(5),
    Disco varchar(5),
    fkMaquina int,
    fkGestor int,
    foreign key (fkMaquina) references Maquina(ID_Maquina),
    foreign key (fkGestor) references Gestor(ID_Gestor)
);

select * from Endereco;
select * from Unidade;
select * from Empresa;
select * from Gestor;
select * from Maquina;
select * from Dado_Maquina;

