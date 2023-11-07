public class Main {
    public static void main(String[] args) {
        int nota = 100;
        String graduacao;

        // Lista de Graduações: A = 80, B = 70, 60 - 0 = D
        if(nota >= 80){
            graduacao = "A";
        } else if (nota < 80 && nota >= 70){
            graduacao = "B";
        } else if (nota < 60 && nota >= 0){
            graduacao = "D";
        } else {
            graduacao = "";
        }

        switch(graduacao){
            case "A":
            case "B":
                System.out.println("Aluno Aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Não Aprovado!");
                break;
            default:
                System.out.println("Graduação Inválida");
                break;
        }
    }
}