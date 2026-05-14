package aulas_15_a.Aula_15;

public class Aula_15 {
    public static void main(String[] args){

        //OPERADORES
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        double resultado02 = numero01 / numero02;  //Pelo fato do valor "numero02" ser um int ele imprime 0, por conta disso se coloca como double

        System.out.println(numero01 + numero02 + " VALOR " + numero01 + numero02);
        System.out.println(resultado);
        //System.out.println(resultado02);

        System.out.println();

        //ATRIBUTOS
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);

        System.out.println();

        //OPERADORES LOGICOS
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLei = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorTrinta = idade < 30 && salario >= 3381;

        System.out.println(isDentroDaLei);
        System.out.println(isDentroDaLeiMenorTrinta);

    }   
}

/*
    OPERADORES:
        +, -. *, /, %

    ATRIBUTOS:
        <, >, <=, ==, !=

    OPERADORES LOGICOS:
        && (and), || (or), ! (not)
 */