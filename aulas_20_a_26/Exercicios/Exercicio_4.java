public class Exercicio_4 {
    public static void main(String[] args){
        double temp = 27.5;
        int dia = 2;
        String resultado;

        switch(dia){
            case 1:
            case 7:
                if(temp >= 30){
                    resultado = "Ir para praia";
                } else{
                    resultado = "Ver maratona Java";
                }
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                resultado = "Ir para praia";
                break;
            default:
                resultado = "Resposta invalida!!";
                break;
        }
        System.out.println(resultado);
    }
}
