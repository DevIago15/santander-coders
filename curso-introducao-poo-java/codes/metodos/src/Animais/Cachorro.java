package Animais;

public class Cachorro {
    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoRabo;

    public String estadoEspirito;

    public void Comer(){

    }

    public void Latir(){
        System.out.println("AU AU AU!");
    }

    public String Pegar(){
        return "Bolinha";
    }

    public String Interagir(String acao){
        if(acao.equals("carinho")){
            this.estadoEspirito = "feliz"; //este atributo (que foi iniciado la em cima)

        } else if(acao.equals("chute")){
            this.estadoEspirito = "bravo";
        } else{
            this.estadoEspirito = "neutro";
        }
        return estadoEspirito;
    }
}
