public class Exercicio_1 {
    public static void main(String[] args){
        int[] notas = {5, 8, 7, 8};
        double media;
        int soma = 0;
        int cont = 0;
        for(int num : notas){
            soma +=num;
            cont++;
        }
        media = (soma / cont);

        if(media >= 7){
            System.out.println("Paranens, você foi aprovado " + "Nota: " + media);
        } else if(7 > media && media >= 5){
            System.out.println("Você ficou de recuperação " + "Nota: " + media);
        } else if(5 > media){
            System.out.println("Você foi reprovado " + "Nota: " + media);
        }
    }
}
