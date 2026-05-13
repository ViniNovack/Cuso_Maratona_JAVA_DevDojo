package aula_9_a_12.Exercicios;

public class Exercicio_4 {
    public static void main(String[] arsg){
    int idade = 18;
    int carteira = 100;
    
    boolean podeEntrar = idade >= 18;
    boolean conseguePagar = carteira >= 150;

    System.out.println("O cliente tem idade para entrar? " + podeEntrar + "\nO cliente consegue pagar? " + conseguePagar);
    }
}
