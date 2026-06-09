public class Exercicio_4 {
    public static void main(String[] args){
        String[] lista = {"Vinícius", "Guilherme", "Gabriel", "Carol", "Lucas", "Isak", "Arthur"};
        String nome = "Lucas";
        boolean encontrado = false;
        for(int i = 0; i < lista.length; i++){
            if(nome.equals(lista[i])){
                System.out.println("O nome " + nome + " esta na posição " + (i + 1) + " da lista.");
                encontrado = true;
                break;
            } else{
                continue;
            }
        }
        if(!encontrado){                                                               // OR encontrado == false
            System.out.println("O nome " + nome + " não esta na lista.");
        }
    }
}
