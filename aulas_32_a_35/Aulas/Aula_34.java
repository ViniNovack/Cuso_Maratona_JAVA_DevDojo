public class Aula_34 {
    public static void main(String[] args){
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";

        for(int i = 0; i < nomes.length; i++){   //O "length" permite que contar o espaço de uma array
            System.out.println(nomes[i]);
        }

        System.out.println("\n");

        //Se pode resetar uma array:
        nomes = new String[3];
        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
