public class Main {
    public static void main(String[] args) {

        // teste do comportamento da linguagem:
        String nome;
        nome = "Iago";
        nome = "Matheus";
        nome = "Santander";

        System.out.printf("Olá, " + nome);

        // brincando com inteiros e suas expessões aritméticas
        int a;
        int b = 2;
        a = 3;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        float divisao = (float) a/b;

        System.out.println("\n\nSoma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);


    }
}