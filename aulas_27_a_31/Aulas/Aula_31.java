public class Aula_31 {
    public static void main(String[] args){
        double valorTotal = 30_000;
        double valorAte = 1000;
        double valorParcela;

        for(int c = (int)valorTotal; c >= 1; c--){
            valorParcela = valorTotal / c;
            if(valorParcela < valorAte){
                continue;
            } else{
                System.out.println("Parcela " + c + " = " + valorParcela);
            }
        }
    }
}
