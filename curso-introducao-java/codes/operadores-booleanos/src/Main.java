public class Main {
    public static void main(String[] args) {
        boolean fimDeSemana = false; // sempre com camelCase
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        System.out.println(vamosAPraia);

        String msg = fimDeSemana ? "É Fim de Semana!" : "Não é Fim de Semana!";
        System.out.println(msg);
    }
}