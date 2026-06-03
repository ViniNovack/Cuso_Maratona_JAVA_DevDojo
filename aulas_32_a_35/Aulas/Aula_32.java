public class Aula_32 {
    public static void main(String[] args){
        //_________________________ARRAYS_____________________
        int[] idades = new int[3];   //Para criar uma array é "int[]", depois voce diz o tamanho dela com "new int[(tamanho que voce quiser)]" 
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;

        for(int i = 0; i < 3; i++){
            System.out.println(idades[i]);
        }
    }
}
