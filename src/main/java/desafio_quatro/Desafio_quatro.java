package desafio_quatro;

import java.util.Scanner;

public class Desafio_quatro {
    public static void main(String[] args) {

        //define número de frases a serem fornecidas pelo usuário
        Scanner user_input = new Scanner(System.in);
        int num_frases = user_input.nextInt();

        //lê cada frase
        for(int i = 0; i <= num_frases; i++){
            String frase = user_input.nextLine();
            int metade = frase.length()/2 ;

            //separa a frase em duas
            String[] partes = {
                    frase.substring(0, metade)
                    ,frase.substring(metade)
            };

            //inverte as duas metades
            partes[0] = new StringBuilder(partes[0]).reverse().toString();
            partes[1] = new StringBuilder(partes[1]).reverse().toString();

            System.out.println(partes[0] + partes[1]);

        }


    }
}