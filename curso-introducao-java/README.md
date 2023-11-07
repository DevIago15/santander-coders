# Curso Introdução ao Java - Trilha Digital | Web Back-End

## Variáveis
A linguagem de programação Java é fortemente tipada, o que significa que todas as vezes que iremos declarar uma variável, também é necessário dizer o tipo de dado dela.

O java tem atualmente 8 tipos de dados primitivos, sendo eles:
* byte: números *inteiros* que podem ser armazenados de -128 até 127.
* short: números *inteiros* que podem ser armazenados de -32.768 até 32.767.
* int: números *inteiros*, exemplo: 5
* long: números *inteiros* que podem ser armazenados 64 bits de informação, de -9.223.372.036.854.775.808L até 9.223.372.036.854.775.807L
* float: números reais decimais, para aproximar valores analógicos e contínuos.
* double: números reais decimais, exemplo: 2.5
* boolean: números lógicos, exemplo: 1 ou 0, true ou false.
* char: o tipo de dado que armazena letras (caracteres).
* string: o tipo de dado que armazena textos.

* Quando declaramos três valores para a mesma variável, o sistema entende que os dois primeiros valores são perdidos e mostra ou armazena somente o último valor. (teste em /code/variaveis)

* O Java tem uma particularidade onde ele entende que números inteiros divididos por números inteiros sempre vai resultar um outro número inteiro.

 E qual solução podemos dar para contornar isso?
    * 1 - Mudar o tipo de dado das variáveis para *float* out *double*, mas pensando em alta escala, daria muito trabalho para isso ser implementado.
    * 2 - Fazer um *cast*, onde usamos os parenteses na expressão dizendo ao Java que estamos representando o tipo de dado como float/double (exemplo em /code/variaveis).

## Operadores Booleanos | Tabela Verdade
Utilizamos esse tipo de dado para valores lógicos (verdadeiros ou falsos).

* Tabela Verdade do Operador && (AND):
    * true && true = true
    * true && false = false
    * false && true = false
    * false && false = false

* Tabela Verdade do Operador || (OR):
    * true || true = true
    * true || false = true
    * false || true = true
    * false || false = false

* Há uma forma de fazer uma operação rápida com String onde com base no verdadeiro ou falso é mostrado uma mensagem, chamamos de operador ternário (exemplo em codes/operadores-booleanos).
-> Exemplificado: String msg = fimDeSemana *?* "É fim de semana!" *:* "Não é fim de semana"; 
Onde *o primeiro valor é o termo que será avaliado*, *o segundo termo é o valor caso seja verdadeiro* e o *terceiro valor caso seja falso.*

## Estruturas Condicionais
* if/else: analisa uma condição e faz um comportamento específico a depender daquela condição, é o caso mais simples.
* switch case: analisa e combina condições retornadas e faz um comportamento específico a depender da condição retornada.

## Manipulação de Strings e Datas
Para manipular strings existe métodos que podem ser chamados com a variável e fazer um comportamento específico, exemplos:
* var.toUpperCase(): para deixar a string com letras maiúsculas
* var.toLowerCase(): para deixar a string com letras minúsculas
* var.length(): para consultar o comprimento da string
* var.equals(): idem abaixo porém não ignora se são maiúscula ou minúscula.
* var.equalsIgnoreCase(): retorna true ou false caso duas variaveis sejam iguais, ignorando maiúscula ou minúscula.

Manipulando datas temos a ISO 8601 que é o padrão mundial de datas, para utilizar em java, é necessários importarmos a biblioteca *Locale* antes de tudo.
* atribuindo a uma variavel o LocalData.now(): é retornado no terminal a data do dia atual.
* passando uma variavel com getDayOfWeek(): é retornado o dia da semana atual.
* passando uma variavel com getDayOfMonth(): é retornando o dia do mês atual.
* passando uma variavel com getDayOfYear(): é retornado o dia do ano atual.
* utilizando o gethour() com uma variável: é retornado a hora atual

Exemplos em *code/manipulando-strings-e-datas*

## Laços Numéricos
São as estruturas que dão controle ao algoritmo para repetir N vezes uma função.

Podemos utilizar laços aninhados, queria laços *for* dentro de outros laços *for*

Tabuada feita com 5 linhas de código em */code/lacos-numericos*

## Vetores/Arrays
No array com o Java não podemos misturar os tipos de dados, todos os elementos que estiverem dentro do array devem ser do mesmo tipo.

Os arrays são orientados a indíces, então para completarmos os arrays, precisamos adicionar os indíces com um *for*.

Começamos a contagem dos arrays sempre na primeiro posição em 0 até N-1, exemplo: 
* Um array de 10 números começará a contar do 0 até 9.

Exemplos em */codes/vetores*.

## Funções
O ponto de partida sempre será o método *MAIN*. então sempre que formos chamar um outro método, ele precisa ser invocado no método *MAIN*.