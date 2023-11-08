import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();

        // cachorro1.Latir();
        // System.out.println("O cachorro pegou uma " + cachorro1.Pegar());

        System.out.println("O cachorro está " + cachorro1.Interagir("chute")); // mandei um carinho que enviou para o objeto a acao e me retornou que ele está feliz
        System.out.println("O cachorro está " + cachorro1.Interagir("carinho")); // mandei um carinho que enviou para o objeto a acao e me retornou que ele está feliz
        System.out.println("O cachorro está " + cachorro1.Interagir("")); // mandei um carinho que enviou para o objeto a acao e me retornou que ele está feliz
    }
}