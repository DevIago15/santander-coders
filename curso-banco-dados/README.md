# Curso Banco de Dados - Trilha Digital | Web Back-End

## Tipos de Dados e Custo de Armazenamento
Quando estamos modelando o banco de dados, precisamos conhecer os tipos de dados para ter um banco bem estruturado, não salvar informações atoas e não consumir armazenamento do banco. Temos hoje mais de 20 tipos de dados principais no PostgreSQL, mas iremos nos aprofundar em 4 tipos:
    * Inteiros: são os números inteiros.
    * Reais: são os números reais.
    * Campos textuais: são os campos que podemos salvar strings ou char.
    * Campos de datas: são os campos que podemos salvar datas no tempo.
    * Booleano: são os verdadeiros e falsos (1 e 0).

*ler a doc do postgresql para visualizar o custo de armazenamento*

## Modelagem de Entidades
É uma representação de qualquer elemento que o sistema precisa ter com as informações ligadas ao banco e ao sistema. Essa modelagem é feita com diagramas para no momento em que construirmos nosso banco de dados, não nos percamos.

## Modelagem de Relacionamentos
É a representação da forma que as tabelas e colunas interagem com elas mesmo (se relacionar entre elas).
    * Relacionamento 1 -> 1: Associação direta, exemplo um "Aluno" e uma "Matrícula" adicionando o "id_aluno" que está na tabela do "Aluno" e fará a relação com a tabela "Matrícula".
    * Relacionamento 1 -> N: Associação direta com N valores, exemplo: 1 "Aluno" tem diversas "Matérias".
    * Relacionamento Muitos -> Muitos: Associação direta, exemplo: diversos "Aluno" tem diversos "Professor".

## Normalização de Dados
Elas buscam garantir a qualidade dos dados com uma "forma normal", seguindo os seguintes princípios:
    * Cada atributo deve conter apenas um valor correspondente num dado registro.
    * Cada elemento deve depender apenas de sua chave primária.
    * Um elemento não chave da tabela não deve depender de outro elemento não chave.
    * Sua tabela não pode ter mais de uma chave candidata


## Inserindo Tabelas no Banco
```
Para criar um banco podemos utilizar o seguinte comando:
    * create database nome_banco
```

```
Para destruir um banco podemos utilizar o seguinte comando:
    * drop database nome_banco
```
```
Para criar uma tabela no banco podemos utilizar o seguinte comando:
    create table nome_categoria
(
	idCategoria		int			not null	primary key		identity,
	categoria		varchar(30)	not null
)
```
## Inserindo Dados no Banco
```
Para inserir dados no podemos utilizar o seguinte comando:
insert into Categorias (categoria)
values	('Lanche Normal'),
		('Lanche Gourmet'),
		('Lanche Natural'),
		('Lanche Vegano')
```
## Editando e Removendo Dados
```
Para editar dados utilizamos o comando
    * update 
```

```
Para remover dados utilizamos o comando
    * delete 
```

## Permissionamento e Views
As views servem para exibir para o usuário que estiver no sistema somente aquilo que ele poderá ver, exemplo: Uma escola tem na base de dados informações de CPF do aluno e queremos mostrar no sistema somente a validade da matricula dele, para isso criamos uma view que irá retornar somente os dados que queremos mostrar a ele.