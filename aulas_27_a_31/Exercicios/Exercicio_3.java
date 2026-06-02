public class Exercicio_3 {
    public static void main(String[] args){
        double menor_parcela = 1_000;
        double valor_apagar = 30_000;
        double valor_parcela;
        for(int i = 0; i < menor_parcela; i++){
            valor_parcela = valor_apagar / i;
            if(valor_parcela < 1000){
                System.out.println("FIM");
                break;
            }else{
                System.out.println("Parcela " + i + "X" + " = " + valor_parcela);
            }
        }
    }
}
