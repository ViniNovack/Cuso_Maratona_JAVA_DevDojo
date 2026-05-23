public class Exercicio_3 {
    public static void main(String[] args){
        System.out.println("  ___Gerenciador de Pagamentos___");
        System.out.println("1 - À vista dinheiro/cheque: 10% de desconto." + "\n2 - À vista no cartão: 5% de desconto." + "\n3 - Em até 2x no cartão: preço formal." + "\n4 - 3x ou mais no cartão: 20% de juros.");
        System.out.println("-".repeat(40));

        int op = 2;
        float preço = 1000.00F;

        switch(op){
            case 1:
                preço -=(preço*0.1);
                System.out.println("\nA vista no dinheiro: " + preço + "\n");
                break;
            case 2:
                preço -=(preço*0.05);
                System.out.println("\nA vista no cartão: " + preço + "\n");
                break;
            case 3:
                System.out.println("\nEm até 2x no cartão: " + "Primeira - " + preço/2 + " Segunda - " + preço/2 + "\n");
                break;
            case 4:
                preço +=(preço*0.2);
                System.out.println("\n3x ou mais no cartão: " + preço + "\n");
                break;
            default:
                System.out.println("\nResposta invalida!!\n");
        }
    }
}
