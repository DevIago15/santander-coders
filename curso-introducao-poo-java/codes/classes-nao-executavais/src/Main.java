import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "Pupp";
        cachorro1.cor = "Amarelo";
        cachorro1.altura = 25;
        cachorro1.peso = 5.5;
        cachorro1.tamanhoRabo = 1;
        System.out.println("Nome: " + cachorro1.nome);
        System.out.println("Cor do Cachorro: " + cachorro1.cor);
        System.out.println("Altura do Cachorro: " + cachorro1.altura);
        System.out.println("Peso: " + cachorro1.peso);
        System.out.println("Tamanho do Rabo: " + cachorro1.tamanhoRabo);
    }
}