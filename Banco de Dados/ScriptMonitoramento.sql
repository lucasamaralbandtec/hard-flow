create database Hardflow;

use Hardflow;

create table Endereco(
	ID_Endereco int primary key identity(1,1),
    Rua varchar(100),
    Numero bigint,
    Bairro varchar(60),
    CEP varchar(9),
    Complemento varchar(30),
    Cidade varchar(20),
    Estado varchar(2)
);
	insert into Endereco (Rua, Numero, Bairro, CEP, Complemento, Cidade, Estado) 
	values  ('Avenida Comercial', 9786, 'São Carlos', '74477-190', 'Não tem', 'Goiânia', 'GO'),
			('Rua Oscar Freire', 8676, 'Pinheiros', '05409-012', 'Não tem', 'São Paulo', 'SP'),
			('Avenida Tocantins', 32135, 'Republica', '74015-005', 'Não tem', 'Goiânia', 'GO'),
			('Rua Santa Ifigênia', 234556, 'Centro', '01207-001', 'Não tem', 'São Paulo', 'SP'),
			('Rua Teodoro Sampaio', 743, 'Pinheiros', '05406-000', 'Não tem', 'São Paulo', 'SP'),
			('Avenida Imperador', 2653, 'Centro', '60015-050', 'Não tem', 'Farias Brito', 'CE'),
			('Rua Zeno Zani', 46467, 'Barra da Tijuca', '22790-765', 'Não tem', 'Rio de Janeiro', 'RJ'),
			('Avenida Samdu', 12324, 'Taguatininga', '70297-400', 'Setor F Norte', 'Brasília', 'DF');		

create table Unidade(
	ID_Unidade int primary key identity(1,1),
    Nome_Unidade varchar(45),
    Telefone varchar(10),
    fkEndereco int,
    fkGestor int,
    fkEmpresa int,
    foreign key (fkEndereco) references Endereco(ID_Endereco),
    foreign key (fkGestor) references Gestor(ID_Gestor),
    foreign key (fkEmpresa) references Empresa(ID_Empresa)
);
	insert into Unidade (Nome_Unidade, Telefone, fkEndereco, fkGestor, fkEmpresa)
	values	('UnidadeNorte', '113547-8473', '5', '1', '1'),
			('UnidadeSul', '113547-8473', '8', '2', '2'),
			('Sede', '113547-8473', '2', '3', '3');
        
create table Empresa(
	ID_Empresa int primary key identity(1,1),
    Nome_Empresa varchar(45),
    CNPJ varchar(18)
);
	insert into Empresa (Nome_Empresa, CNPJ)
	values	('Logicalis','09.458.123/0001-45'),
			('Ousystems', '18.554.646/0001-86'),
			('FDerivs', '22.535.368/0001-97');

create table Gestor(
	ID_Gestor int primary key identity(1,1),
    Nome_Gestor varchar(45),
    Senha varchar(45),
    CPF varchar(15),
    Ramal varchar(30)
);
	insert into Gestor (Nome_Gestor, Senha, CPF, Ramal)
	values	('Frederico', 'Fred123321@#','809.765.765-53','756'),
			('Tasmine', 'Tas123321@#', '645.875.628-00', '8888'),
			('David', 'David123321@#','534.314.253-77', '1');

create table Maquina(
	ID_Maquina int primary key identity(1,1),
    Nome_Maquina varchar(30),
    IP_Maquina varchar(15),
    Gateway varchar(30),
    Proprietario varchar(30),
    Sistema_Operacional varchar(30),
    fkGestor int,
    foreign key (fkGestor) references Gestor(ID_Gestor)
);
	insert into Maquina (Nome_Maquina, IP_Maquina, Gateway, Proprietario, Sistema_Operacional, fkGestor)
	values	('RiosLocal','145.10.154.121','192.148.1.190','Tevez','Linux', 1), 
			('RiosLocal','177.50.136.124','192.148.1.190','Matheus','Linux', 1),
			('RiosLocal','192.654.1.230','192.148.1.190','Euclides','Windows', 1),
			('TerLocal','152.280.1.230','152.280.10.290','Felipe','Windows', 2),
			('TerLocal','122.958.1.230','122.958.10.390','Acacia','Windows', 2),
			('CerLocal','102.237.1.230','102.237.10.990','Leticia','Windows', 2),
			('CastaLocal','121.10.563.426','121.378.5.426','Felicia','Linux', 3),
			('CastaLocal','136.30.345.153','136.658.5.153','Gabriel','Linux', 3),
			('CastaLocal','197.50.796.968','197.354.5.968','Pietro','Linux', 3);

create table Dado_Maquina(
	ID_Dado int primary key identity(1,1),
    C_P_U varchar(4),
    Memoria varchar(4),
    Disco varchar(4),
    fkMaquina int,
    fkGestor int,
    foreign key (fkMaquina) references Maquina(ID_Maquina),
    foreign key (fkGestor) references Gestor(ID_Gestor)
);
	insert into Dado_Maquina(C_P_U, Memoria, Disco, fkMaquina, fkGestor)
	values ('23%','57%','77%','1','1'),
	       ('43%','64%','34%','2','1'),
		   ('12%','55%','23%','3','1'),
		   ('15%','68%','82%','1','2'),
		   ('87%','09%','87%','2','2'),
		   ('56%','65%','91%','3','2'),
		   ('91%','44%','32%','1','3'),
		   ('56%','21%','54%','2','3'),
		   ('35%','32%','32%','3','3');

select * from Endereco;
select * from Unidade;
select * from Empresa;
select * from Gestor;
select * from Maquina;
select * from Dado_Maquina;
