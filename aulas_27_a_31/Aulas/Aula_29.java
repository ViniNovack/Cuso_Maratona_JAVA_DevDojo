public class Aula_29 {
    public static void main(String[] args){
        int cont = 0;
        int valorIn = 20;
        int valorMax = 50;
        for(int c = valorIn; c <= valorMax; c++){
            if(cont > 25){
                System.out.println("FIM");
                break;
            }
            System.out.println(c);
            cont++;
        }
    }
}
