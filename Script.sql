create database captu;

create table Usuario (
	id serial primary key,
	email varchar(40) not null,
	senha varchar(30) not null,
	livros int references livro(id)
);

create table categoria (
	id serial primary key,
	nome_categoria varchar(50) not null	
);

create table livro (
	id serial primary key,
	nome varchar(50),
	autor varchar(40),
	sinopse text,
	categoria_id int references categoria(id)
);

create table avaliacao (
	id serial primary key,
	nota varchar(20)
);

create table notausuario (
	id serial primary key,
	usuario_id int references Usuario(id),
	livro_id int references livro(id),
	avalicao_id int references avaliacao(id)
);