public class Exercicio_4 {
    public static void main(String[] args){
        System.out.println("\n");
        System.out.println("\n");

        double soma_dos_ids = 0;
        for(int c = 0; c <= 50; c++){
            if(c % 5 == 0){
                System.out.println();
                soma_dos_ids +=c;
                continue;
            } else{
                soma_dos_ids +=c;
                if(soma_dos_ids > 500){
                    System.out.println("\nSoma Total = " + (soma_dos_ids - c) + "\nUltimo ID: " + (c - 1));
                    break;
                } else{
                    System.out.println("Produto de ID: " + c + " Soma Parcial: " + soma_dos_ids);
                }
            }
        }
    }
}
