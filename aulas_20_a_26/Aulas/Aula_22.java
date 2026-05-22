public class Aula_22 {
    public static void main(String[] args){
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo.";
        String mensagemNãoDoar = "Ainda não tenho condição, mas vou ter!";
        String resultado;
        if(salario >= 5000){
            resultado = mensagemDoar;
        } else{
            resultado = mensagemNãoDoar;
        }
        System.out.println(resultado);

        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! OR !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        //                (CONDIÇÃO) ? TRUE : FALSE
        System.out.println(salario >= 5000 ? mensagemDoar : mensagemNãoDoar);
        //or 
        String result = salario >= 5000 ? mensagemDoar : mensagemNãoDoar;
        System.out.println(result);
    }
}
