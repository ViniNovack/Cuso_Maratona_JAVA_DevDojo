public class Exercicio_2 {
    public static void main(String[] args){
        int[] numeros_simulados = {5, 10, 15, 999};
        double soma = 0;
        int cont = 0;
        int valor;
        while(true){
            valor = numeros_simulados[cont];
            if(valor == 999){
                break;
            }else{
                soma +=valor;
                cont++;
            }
        }
        System.out.println("Soma = " + soma + "\nFIM");
    }
}
