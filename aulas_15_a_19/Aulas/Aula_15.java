public class Aula_15 {
    public static void main(String[] args){

        //OPERADORES
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;

        System.out.println(numero01 + numero02 + " VALOR " + numero01 + numero02);
        System.out.println(resultado);
        //System.out.println(resultado02);


        System.out.println();
        //ATRIBUTOS
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezMaiorQueVinte2 = 10 > 20;
        boolean isDezMenorQueVinte2 = 10 < 20;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezMaiorQueVinte2);
        System.out.println(isDezMenorQueVinte2);


        System.out.println();
        //OPERADORES LOGICOS
        // &&
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLei = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorTrinta = idade < 30 && salario >= 3381;

        System.out.println(isDentroDaLei);
        System.out.println(isDentroDaLeiMenorTrinta);


        System.out.println();
        // ||
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel: " + isPlaystationCincoCompravel);


        System.out.println();
        // =, +=, -=, *=, /=, %=
        double bonus = 1800;
        bonus +=1000;
        bonus -=300;
        bonus *=2;
        bonus /=2;
        System.out.println(bonus);


        System.out.println();
        //OPERADORES UNARIOS
        int contador = 0;
        contador +=1;
        contador++;    // contador +=1  ==  contador++
        contador--;    // ...
        ++contador;
        --contador;
        System.out.println(contador);

        // Se tem uma diferença de colocar ++/-- na frente ou atraz, pois ele primeiro executa o que vem antes. Por exemplo:
        int contador2;
        contador2 = 2;
        System.out.println("contador2++: " + contador2++);       //Nesse cado depois de imprimir na tela a variavel vai ser o 1 somado, porém depois pelo faro do ++ vir depois
        contador2 = 2;
        System.out.println("++contador2: " + ++contador2);
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
