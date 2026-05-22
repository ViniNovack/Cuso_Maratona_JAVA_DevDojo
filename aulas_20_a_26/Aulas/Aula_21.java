public class Aula_21 {
    public static void main(String[] args){
        int idade = 16;
        String categoria;

        if(idade < 15){
            categoria = "Categoria Infantil";
        } else if(idade >= 15 && idade < 18){
            categoria = "Categoria Juvenior";
        } else{
            categoria = "Categoria Adulto";
        }

        System.out.println(categoria);
    }
}
