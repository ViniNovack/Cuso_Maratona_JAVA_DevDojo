package aula_9_a_12.Exercicios;

public class Exercicio_3 {
    public static void main(String[] args) {
        double salario = 2450;
        double imposto = salario * 0.15;
        int valor_apagar = (int)imposto;

        System.out.println("Imposto decimal: " + imposto + "\nImposto int: " + valor_apagar);
    }
}
