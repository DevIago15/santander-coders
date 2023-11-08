import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro("Puppy", "Marrom", 25, 5.5 ,"nada", 1);

        // cachorro1.Latir();
        // System.out.println("O cachorro pegou uma " + cachorro1.Pegar());

        System.out.println("O cachorro está " + cachorro1.Interagir("vai dormir"));
        System.out.println("O cachorro está " + cachorro1.Interagir("carinho"));
        System.out.println("O cachorro está " + cachorro1.Interagir("pisar na patinha"));
        System.out.println("O cachorro está " + cachorro1.Interagir(""));
    }
}