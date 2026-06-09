public class Aula_36_a_37 {
    public static void main(String[] args){
        // ARRAYS
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 30;
        
        for(int i = 0; i < dias.length; i++){
            for(int j = 0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("\n");

        for(int[] arrbase : dias){
            for(int num: arrbase){
                System.out.println(num);
            }
        }
    }
}
