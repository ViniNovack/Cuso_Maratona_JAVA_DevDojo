public class Exercicio_2 {
    public static void main(String[] args){
        int vida_boneco = 100;
        int golpe = 15;
        while(vida_boneco > 0){
            vida_boneco -=golpe;
            System.out.println("Boneco recebeu " + golpe + " de dano." + "\nAgora ele esta com " + vida_boneco + " de HP.\n");
        }
        System.out.println("O boneco foi destruído! Treinamento concluído.");
    }
}
