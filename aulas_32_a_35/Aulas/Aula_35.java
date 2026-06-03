public class Aula_35 {
    public static void main(String[] args){
        //Formas de se iniciar uma lista:
        int[] numeros1 = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{5, 4, 3, 2, 1};

        //Para passar os valores da lista com for se usa a seguinte logica:
        for(int num : numeros2){
            System.out.println(num);
        }
    }
}
