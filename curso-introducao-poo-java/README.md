# Curso Introdução ao POO com Java - Trilha Digital | Web Back-End

## Hello World com Java
Para rodar um programa em Java, necessitamos de uma classe *Main* e ela precisa ter 5 características, sendo elas:
    * tem que ser público (public)
    * precisa ser estático (static)
    * tem que ter a descrição void (não retorna nada)
    * tem que ter o nome "Main"
    * precisa receber como parâmetros um array ou var args de string

Existem duas formas de iniciar um método main:
    * com var args de strings (serve para indefinir quantas variáveis estará recebendo no método): 
```
public class Main {
    public static void main(String... args) {
        System.out.println("Hello World!");
    }
}
```
    * com array de string:
```
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

A variável *args* não necessariamente precisa ser chamada assim, podemos mudar o nome da mesma e o programa rodará normalmente, mas o mais comum é ser chamada de *args*.

Em Java temos dois tipos de variávis, as primitivas e as não primitivas, nessa aula veremos os tipos primitivos (são os tipos que já estão definidos).
* byte: números *inteiros* que podem ser armazenados de -128 até 127.
* short: números *inteiros* que podem ser armazenados de -32.768 até 32.767.
* int: números *inteiros*, exemplo: 5
* long: números *inteiros* que podem ser armazenados 64 bits de informação, de -9.223.372.036.854.775.808L até 9.223.372.036.854.775.807L
* float: números *reais* decimais, para aproximar valores analógicos e contínuos.
* double: números *reais* decimais, exemplo: 2.5
* boolean: números lógicos, exemplo: 1 ou 0, true ou false.
* char: o tipo de dado que armazena letras (caracteres).
* string: o tipo de dado que armazena textos.

## Classes não Executáveis
* Classe: é uma definição pro objeto (característica)
* Objeto: é um objeto em si
Exemplo: O cachorro pinscher é uma classe, ele tem suas próprias características que o diferem de outras classes(raças) enquanto o cachorro em si é um objeto.

* Varíavel de referência: é uma variavel que faz referencia a uma classe.

Exemplo em */codes/classes-nao-executaveis*

## Métodos
Dentro de uma classe declaramos um método, o que a classe poderá fazer no programa.

Exemplo em */codes/metodos*

```
enum: O Java enum é um tipo de dado utilizado para armazenar um conjunto de valores constantes, ou seja, são valores fixos, que não podem ser modificados. Na prática, o enum é um tipo especial de classe que utiliza a palavra-chave enum ao ser declarado.
```

## Encapsulamento
O conceito de encapsulamento significa encapsular o objeto de forma segura, onde o objeto fique guardado e só possa acessar quem a gente quer e da forma que a gente quer, temos como encapsuladores:
    * public: todos podem ver.
    * protected: somente classes em pacotes diferentes não poderá ver.
    * default: somente qualquer classe *filha* em pacote diferente e classes em pacotes diferentes não poderão ver.
    * private: somente a mesma classe pode ve-lo.

Com os getters (GET) conseguimos reestringir uma variável, exemplo: Se o usuário enviar uma senha para o sistema que irá enviar para o Banco de Dados, ela irá como ele enviou, com o get eu consigo trocar o retorno da variável para "criptografar" a mesma.

## Modelagem Orientada a Objetos
Aula explicando sobre modelagem completa de objetos.

## Herança
Através da herança podemos estender uma classe e juntar com outras, tornando uma mãe e as outras filha utilizando a sintaxe extends, exemplo:

```
public class Passaro extends Animal
```

* Para que serve o método @Override?
Ele serve para alterar o resultado de um método da classe pai da filha, exemplo: Temos um método *soar* que seria o som do animal, porém cada animal faz um som diferente, se colocarmos um @Override na classe passando para o método público *soar* que o cachorro quando for chamado deve fazer "AU AU", o sistema irá mostrar "AU AU".

## Polimorfismo
É a capacidade de um objeto poder ser referenciado de várias formas, o objeto nasce de um tipo e morre daquele tipo, o que muda é a forma como referenciamos ele.

* Utilizando o *abstract* o que acontece na classe?
Isso diz ao sistema que uma classe não pode ser objeto, exemplo: Uma classe animal não pode se transformar em um objeto Animal, e sim em um objeto "Passáro". 
