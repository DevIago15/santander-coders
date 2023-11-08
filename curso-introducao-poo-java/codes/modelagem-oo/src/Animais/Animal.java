package Animais;

public class Animal {

    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoEspirito;

    public Animal(String nome, String cor, int altura, double peso, String estadoEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoEspirito = estadoEspirito;
    }

    public Animal() {

    }

    protected void Comer(){

    }

    protected void Dormir(){

    }

    public void Soar(){
        System.out.println("cricri");
    }
}
