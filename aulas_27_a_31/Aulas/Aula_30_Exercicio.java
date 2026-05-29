public class Aula_30_Exercicio {
    public static void main(String[] args){
        double valorApagar = 30_000;
        double valor_ate = 1000;
        double valorParcela;

        for (int c = 1; c <= valorApagar; c++){
            valorParcela = valorApagar / c;
            if (valorParcela < valor_ate){
                System.out.println("FIM");
                break;
            }
            System.out.println("Parcela " + c + " = " + valorParcela);
        }
    }
}
