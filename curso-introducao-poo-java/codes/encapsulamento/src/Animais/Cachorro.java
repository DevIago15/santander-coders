package Animais;

public class Cachorro {
    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoRabo;
    public String estadoEspirito;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoRabo() {
        return tamanhoRabo;
    }

    public void setTamanhoRabo(int tamanhoRabo) {
        this.tamanhoRabo = tamanhoRabo;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        if(nome.equals("lily")){
            this.nome = null;
        }
        this.nome = nome;
    }

    // construtor padrao
    public Cachorro(){

    }

    // construtor adicional
    public Cachorro(String nome, String cor, int altura, double peso, String estadoEspirito, int tamanhoRabo){
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.estadoEspirito = estadoEspirito;
        this.tamanhoRabo = tamanhoRabo;
    }

    public void Comer(){

    }

    public void Latir(){
        System.out.println("AU AU AU!");
    }

    public String Pegar(){
        return "Bolinha";
    }

    public String Interagir(String acao){
        switch (acao){
            case "carinho": this.estadoEspirito = "feliz";
                break;
            case "vai dormir": this.estadoEspirito = "bravo";
                break;
            case "pisar na patinha": this.estadoEspirito = "triste";
                break;
            default: this.estadoEspirito = "neutro";
                break;
        }

        return estadoEspirito;



//        if(acao.equals("carinho")){
//            this.estadoEspirito = "feliz"; //este atributo (que foi iniciado la em cima)
//
//        } else if(acao.equals("chute")){
//            this.estadoEspirito = "bravo";
//        } else{
//            this.estadoEspirito = "neutro";
//        }
//        return estadoEspirito;
    }
}
