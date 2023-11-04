# Curso Algoritmos - Trilha Digital | Web Back-End
O algoritmo é uma sequência lógica (passo a passo) para fazer uma ação, exemplo: Receita de Bolo.

## Fluxos Simples, Sequencial
Para escrever um algoritmo, temos que definir as nossas entradas e o que é esperado na saída.

O algoritmo se resume em:
* Início -> Entrada -> Processamento -> Saída -> Final

Exemplo um algoritmo simples para mostrar uma mensagem simples:
* Início -> Nome da Pessoa -> Processamento -> Bom dia, "Nome da Pessoa" -> Final

O mesmo exemplo com o algoritmo mais exemplificado:
* Início -> Pedir o nome da pessoa -> Armazenar o nome da pessoa -> Juntar o nome da pessoa ao texto de "Bom dia" -> Mostrar a frase montada -> Final

O mesmo exemplo com pseudocódigo:
*INICIO PRINCIPAL*
    *MOSTRAR 'Digite seu nome: '*
    *ESPERAR_DIGITACAO -> nome*
    *JUNTAR_TEXTO 'Bom dia ', nome -> saudacao*
    *MOSTRAR_TEXTO saudacao*
*FIM*

* Para algoritmos é utilizado também o TESTE DE USO, que é um documento que pode ser feito em tabelas onde basicamente lista os COMANDOS do algoritmo, a SAÍDA NA TELA e o ARMAZENAMENTO, para que quem for testar consiga com sucesso testar e analisar se há erros ou bugs diferente do esperado.

## Tipos de Dados
* O primeiro tipo de dado é o *numérico*, o computador costuma separar esses dados por dois tipos, inteiros e pontos flutuantes, exemplos:
    * Inteiro: 2
    * Ponto Flutuante: 2.5

* O segundo tipo de dado é o *texto*, que são basicamente letras, palavras, sílabas, textos, sequência de caracteres, exemplo:
    * Texto: "Bom dia"

* O terceiro tipo é o *booleano*, que funciona como um interruptor, ele só tem dois estados/valores, ou VERDADEIRO ou FALSO, utilizamos esse tipo de dado para saber se algo é válido ou não, executar uma operação ou não, se o valor deve ser utilizado ou não, exemplo:
    * Booleano: se a luz está ligada (true) senão (false)

* O que é uma variável?
A variável é um identificador de um valor dentro da memória do computador, exemplo: Caixinha que recebe um nome e pode colocar um valor lá dentro (a variável é desse tipo de dado e pode guardar isso e futuramente pode resgatar esse valor de dentro).

## Estruturas de Decisão
Essas estruturas nos ajudam a decidir dado uma quantidade de entradas, quais comandos iremos rodar ou quais comandos não iremos rodar nos algoritmos. É muito utilizado if e else para tal, exemplo:
    * se a hora atual for menor que 0 e maior que 12, exibir "Bom dia", se a hora atual for maior que 12 e menor que 18, exibir "Boa tarde" e se a hora atual for maior que 18 e menor que 24, exibir "Boa noite".

## Estruturas de Repetição
As estruturas de repetição servem para determinar uma quantidade de comandos e executar os mesmos quantas vezes forem necessárias, definido por uma regra no momento da criação do laço.

* É utilizada a expressão "iteração" cada vez que passamos pelo loop.

## Listas/Arrays
São variáveis sem limitações para valores, enquanto uma variável pode guardar somente um valor, as listas/arrays podem guardar N valores que são relacionados.

## Funções
As funções são estruturas que são utilizadas para fazer ações durante o algoritmo, elas não ficam rodando para sempre, normalmente são "chamadas" para começar a rodar.

## Exercício Completo (Pseudocódigo)
A idéia é criar um caixa eletrônico simples, olhar saldo, sacar, depositar ou sair do programa:

INICIO principal
    VAR op: STRING
    VAR valor: INTEIRO
    VAR saldo: INTEIRO
    VAR sair: BOOLEANO

    DEFINIR sair -> FALSO

    ENQUANTO sair IGUAL FALSO
        CHAMAR MOSTRAR_MENU -> op
        SE op IGUAL a 1
            MOSTRAR "Seu saldo é: ". saldo
        OU SE op IGUAL a 2
            MOSTRAR "Digite o valor a depositar: "
            ESPERAR_DIGITACAO -> valor
            SOMAR valor, saldo -> saldo
            MOSTRAR "Deposito efetuado"
        OU SE op IGUAL a 3
            MOSTRAR "Digite o valor para retirada: "
            ESPERAR_DIGITACAO -> valor
            SE valor MAIOR_QUE saldo
                MOSTRAR "Saque não permitido, saldo insuficiente."
            SENAO
                SUBTRAIR valor, saldo -> saldo
            FIM SE
            MOSTRAR "Saque efetuado!"
        OU SE op -> 4
            DEFINIR VERDADEIRO -> sair
        SENAO
            MOSTRAR "opcao invalida, tente novamente!"
        FIM SE
    FIM ENQUANTO
FINAL

## Desempenho de Algoritmos
O desempenho é uma das funções mais importantes do algoritmo, devemos entender o tempo que é demorado para o algoritmo finalizar uma ação e o porque, através dessa análise conseguimos entender se o algoritmo está tendo um bom desempenho ou não.
    * Você tem que primeiro fazer a coisa funcionar, e depois fazer com que a coisa funcione bem.
