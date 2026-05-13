package aula_9_a_12.Exercicios;

public class Exercicio_2 {
    public static void main(String[] args) {
        double pão = 0.8;
        double leite = 5.50;
        double total = (pão * 5) + (leite * 2);
        double troco = 20 - total;

        System.out.println("Total da compra: " + total + "\nTroco: " + troco);
    }
}
