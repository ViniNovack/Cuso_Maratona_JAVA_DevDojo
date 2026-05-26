package aulas_27_a_31.Aulas;

//______________________LOOPS______________________
public class Aula_27{
    public static void main(String[] args){
        // WHILE
        int cont = 0;
        while (cont <= 10){
            System.out.println(++cont);
        }

        System.out.println();
        // DO WHILE: Ele tem a caracteristica de executar pelomenos uma vez não importando a condição, mas ele só vai continuar se a condição for verdadeira
        cont = 3;
        do{
            System.out.println("Entrou no DO" + ++cont);
        } while (cont < 10);

        System.out.println();
        // FOR
        for(int i=0; i < 10; i++){
            System.out.println("For"+i);
        }
    }
}
