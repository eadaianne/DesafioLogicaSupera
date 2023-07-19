package desafio_um;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Desafio_um {
        public static void main(String[] args) {
            Scanner user_input = new Scanner(System.in);

            //definir valor de linhas a serem fornecidas pelo usuário
            int linhas_entrada = user_input.nextInt();

            //criar array para os valores fornecidos pelo usuário
            int[] valores = new int[linhas_entrada];

            //preencher array
            for(int contador = 0; contador < linhas_entrada; ++contador) {
                valores[contador] = user_input.nextInt();
            }


            ArrayList<Integer> numeros_pares = new ArrayList<>();
            ArrayList<Integer> numeros_impares = new ArrayList<>();

            for(int numero_analise : valores) {
                if (numero_analise % 2 == 0) {
                    numeros_pares.add(numero_analise);
                } else {
                    numeros_impares.add(numero_analise);
                }
            }

            Collections.sort(numeros_pares);
            Collections.sort(numeros_impares);
            Collections.reverse(numeros_impares);

            System.out.println(numeros_pares);
            System.out.println(numeros_impares);
        }
    }