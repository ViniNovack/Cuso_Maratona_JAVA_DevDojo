public class Exercicio_2 {
    public static void main(String[] args){
        int[]numeros = {5, 13, 1, 11, 22};
        int maior = 0;
        int menor = numeros[0];
        for(int cont : numeros){
            if(cont > maior){
                maior = cont;
            } else if(cont < menor){
                menor = cont;
            }
        }
        System.out.println("Maior = " + maior + "\n" + "Menor = " + menor);
    }
}
