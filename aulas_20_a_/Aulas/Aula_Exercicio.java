public class Aula_Exercicio {
    public static void main(String[] args){
        double salarioAnual = 45_000;
        double imposto;
        if(salarioAnual < 34_712){
            imposto = salarioAnual * 0.097;
        } else if(34_712 <= salarioAnual && salarioAnual < 68_507){
            imposto = salarioAnual * 0.3735;
        } else{
            imposto = salarioAnual * 0.495;
        }
    
        System.out.println("Voce vai pagar " + imposto + " de imposto.");
    }
}
