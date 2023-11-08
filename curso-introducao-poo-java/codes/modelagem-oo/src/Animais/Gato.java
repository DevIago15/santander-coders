package Animais;

public class Gato extends Animal{
    static int numeroGatos;

    public Gato(String nome, String cor, int altura, double peso, String estadoEspirito) {
        super(nome, cor, altura, peso, estadoEspirito);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void Soar() {
        System.out.println("MIAU MIAU!");
    }
}
