package aula_9_a_12.Aula;
public class Aula_2_TiposPrimitivos {
    public static void main(String[] args) {        // psvm     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        int idade = 10;                             // Exemplo de variavel
        long numeroGrande = 100000L;
        double salarioDouble = 2000.00;
        float salarioFloat = 2500;
        float salarioFloat2 = 2500.5F; //Se eu quiser escrever um número como: 22.5 eu não posso escrever direto pois é um double por conta disso se coloca um 'F' no final ele assume o valor de float. Ex: 2.5F 
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'B'; //Armazena apenas um caractere.
        
        
        String carro = "Ferrari";
    

        System.out.println("Ele tem " + idade + " anos.");
        System.out.println(verdadeiro);
        System.out.println("char: " + caractere);

        System.out.println("O carro é uma " + carro);
    }
}

/* 
    TIPOS PRIMITIVOS:
    int, double, float, char, byte, short, long, boolean
    - Os tipos primitivos tem que estar todas minuscolas e usam aspas simples('').
    
    Classes:
    String
    - As classes presisam ter letra maiuscola na inicio e usam aspas duplas("").
*/
