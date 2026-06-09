public class Exercicio_3 {
    public static void main(String[] args){
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] pares = new int[4];
        int soma = 0;
        int c = 0;
        for(int cont : numeros){
            if(cont % 2 == 0){
                pares[c] = cont;
                c++;
            }
            else{
                soma +=cont;
            }
        }
        System.out.print("Os números pares são ");
        for(int cont : pares){
            System.out.print(cont + ", ");
        }
        System.out.println();
        System.out.println("Soma dos números impares é " + soma);
    }
}
