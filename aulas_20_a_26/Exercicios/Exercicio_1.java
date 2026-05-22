public class Exercicio_1 {
    public static void main(String[] args){
        byte op = 1;
        double saldo = 30;
        String resultado;
        double pendente;
        switch(op){
            case 1:
                if(saldo >= 15.50){
                    saldo -=15.50;
                    resultado = "Voce comprou uma CERVEJA AMANTEIGADA " + "Saldo atual: [" + saldo + "]";
                } else{
                    pendente = 15.50 - saldo;
                    resultado = "Voce NÃO tem dinheiro" + " Falta: [" + pendente + "]";
                }
                break;
            case 2:
                if(saldo >= 45){
                    saldo -=45;
                    resultado = "Voce comprou uma POÇÃO DE CURA " + "Saldo atual: [" + saldo + "]";
                } else{
                    pendente = 45 - saldo;
                    resultado = "Voce NÃO tem dinheiro" + " Falta: [" + pendente + "]";
                }
                break;
            case 3:
                if(saldo >= 10){
                    saldo -=10;
                    resultado = "Voce comprou uma SUCO DE ABÓBORA " + "Saldo atual: [" + saldo + "]";
                } else{
                    pendente = 10 - saldo;
                    resultado = "Voce NÃO tem dinheiro" + " Falta: [" + pendente + "]";
                }
                break;
            case 4:
                if(saldo >= 2){
                    saldo -=2;
                    resultado = "Voce comprou uma ÁGUA MINERAL " + "Saldo atual: [" + saldo + "]";
                } else{
                    pendente = 2 - saldo;
                    resultado = "Voce comprou uma ÁGUA MINERAL " + "Saldo atual: [" + saldo + "]";
                }
                break;
            default:
                resultado = "Opção inválida! O Taverneiro expulsou você.";
        }
        System.out.println(resultado);
    }
}
