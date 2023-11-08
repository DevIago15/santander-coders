import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Puppy", "Marrom", 25, 5.5 ,"nada", 1);
        Gato gato1 = new Gato("Felix", "Preto", 15, 2.5, "nada");
        Passaro passaro1 = new Passaro("Jr", "Preto", 15, 2.5, "nada");

        cachorro1.Soar();
        gato1.Soar();
        passaro1.Soar();


    }
}