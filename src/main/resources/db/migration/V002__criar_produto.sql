create table Produto (
    idProduto BIGINT PRIMARY KEY IDENTITY,
	tipoProduto VARCHAR(50),
	validade DATE);

	insert into Produto (tipoProduto,validade) values ('vasco da gama', '2023-08-08');
	insert into Produto (tipoProduto,validade) values ('vasco do flamengo', '2023-03-08');