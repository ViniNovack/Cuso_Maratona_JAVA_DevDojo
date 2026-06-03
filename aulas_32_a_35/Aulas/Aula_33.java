public class Aula_33 {
    public static void main(String[] args){
        //byte, short, int, long, float e double -> 0
        //char -> '\u0000' ou ' '
        //boolean -> false
        //String -> null

        int[] nomes = new int[3];
        for(int i = 0; i < 3; i++){
            System.out.println(nomes[i]);
        }

        System.out.println("\n");

        char[] nome = new char[3];
        for(int i = 0; i < 3; i++){
            System.out.println(nome[i]);
        }

        System.out.println("\n");

        boolean[] nom = new boolean[3];
        for(int i = 0; i < 3; i++){
            System.out.println(nom[i]);
        }

        System.out.println("\n");

        String[] no = new String[3];
        for(int i = 0; i < 3; i++){
            System.out.println(no[i]);
        }
    }
}
