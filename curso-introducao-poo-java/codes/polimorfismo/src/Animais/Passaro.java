package Animais;

public class Passaro extends Animal{
    static int numeroPassaros;

    public Passaro(String nome, String cor, int altura, double peso, String estadoEspirito) {
        super(nome, cor, altura, peso, estadoEspirito);
    }

    @Override
    public void Soar() {
        System.out.println("PIU PIU PIU!");
    }
}
