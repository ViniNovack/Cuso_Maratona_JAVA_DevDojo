public class Aula_20 {
    public static void main(String[] args) {
        int idade = 16;
        boolean isAutorizado = idade >= 18;

        if(isAutorizado) {
            System.out.println("Autorizado a comprar bebida alcólica.");
        } else{
            System.out.println("Não autorizado.");
        }

        if(!isAutorizado) {                                                      // !isAutorizado == false
            System.out.println("Não Autorizado a comprar bebida alcólica.");
        }

        System.out.println("Fora do if");
    }
}
