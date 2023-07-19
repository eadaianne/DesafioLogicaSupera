package desafio_três;

import java.util.Scanner;

public class Desafio_três {

    public static void main(String[] args) {

        //ler entrada fornecida
        Scanner user_input = new Scanner(System.in);

        //define tamanho do array informado pelo usuário
        int tam_array = user_input.nextInt();

        //define valor alvo informado pelo usuário
        int valor_alvo = user_input.nextInt();

        //cria array
        int[] valores = new int[tam_array];

        //preenche array com valores fornecidos pelo usuário
        for(int contador = 0; contador < tam_array; ++contador) {
            valores[contador] = user_input.nextInt();
        }

        int pares_validos = 0;

        //para cada valor no vetor valores
        for(int valor : valores) {
            //comparar com os valores dos outros índices
            for(int j = 0; j < tam_array; ++j) {
                int subtracao = valor - valores[j];
                if (subtracao == valor_alvo) {
                    ++pares_validos;
                }
            }
        }

        System.out.printf("%d", pares_validos);
    }
}