public class Aula_Exercicio_2 {
    public static void main(String[] args){
        int dia = 1;
        String estado;
        switch(dia){
            case 1:
                estado = "Domingo" + " [Final de Semana]";
                break;
            case 2:
                estado = "Segunda" + " [Dia Util]";
                break;
            case 3:
                estado = "Terça" + " [Dia Util]";
                break;
            case 4:
                estado = "Quarta" + " [Dia Util]";
                break;
            case 5:
                estado = "Quinta" + " [Dia Util]";
                break;
            case 6:
                estado = "Sexta" + " [Dia Util]";
                break;
            case 7:
                estado = "Sabado" + " [Dia Util]";
                break;
            default:
                estado = "Tente de novo, resposta invalida";
                break;
        }
        System.out.println(estado);

        System.out.println();
        //____________________________________________OR___________________________________________

        int diaa = 5;
        String estadoo;
        switch(diaa){
            case 1:
            case 7:
                estadoo = "FDS";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                estadoo = "Dia de semana";
                break;
            default:
                estadoo = "Invalido";
                break;
        }
        System.out.println(estadoo);
    }
}
