import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //declarando um array de inteiros
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        //declarando um array de strings com atribuições já feitas
        String[] letras = {"A", "B", "C", "D", "E"};
        for(int i = 0; i < letras.length; i++){
            System.out.println(letras[i]);
        }

        // mais fácil sem laço
        System.out.println(Arrays.toString(letras));

        // um laço com uma verificação de maior/menor/media
        int[] num = {9, 10, 12, 25, 15, 2};
        int maior = num[0];
        int menor = num[0];
        int media = 0;

        for(int i = 0; i< num.length; i++){
            if(num[i] > maior){
                maior = num[i];
            }
            if (num[i] < menor){
                menor = num[i];
            }
            media += num[i];
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media/num.length);
    }
}