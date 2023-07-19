package desafio_dois;

import java.util.Locale;
import java.util.Scanner;

public class Desafio_dois {
    public static void main(String[] args) {
        //define formatação para casas decimais separadas com ponto
        Locale.setDefault(Locale.US);

        //ler valor fornecido pelo usuário
        Scanner user_input = new Scanner(System.in);
        double valor = user_input.nextDouble();

        //calcula e exibe quantidades de cada nota
        System.out.println("NOTAS:");
        int notas = (int)valor / 100;
        System.out.printf("%d nota(s) de R$ 100.00%n", notas);
        valor %= 100.0;

        notas = (int)valor / 50;
        System.out.printf("%d nota(s) de R$ 50.00%n", notas);
        valor %= 50.0;

        notas = (int)valor / 20;
        System.out.printf("%d nota(s) de R$ 20.00%n", notas);
        valor %= 20.0;

        notas = (int)valor / 10;
        System.out.printf("%d nota(s) de R$ 10.00%n", notas);
        valor %= 10.0;

        notas = (int)valor / 5;
        System.out.printf("%d nota(s) de R$ 5.00%n", notas);
        valor %= 5.0;

        notas = (int)valor / 2;
        System.out.printf("%d nota(s) de R$ 2.00%n", notas);
        valor %= 2.0;

        //calcula e exibe as quantidades de cada moeda
        valor *= 100.0;
        System.out.println("MOEDAS:");
        int moedas = (int)valor / 100;
        System.out.printf("%d moedas(s) de R$ 1.00%n", moedas);
        valor %= 100.0;

        moedas = (int)valor / 50;
        System.out.printf("%d moedas(s) de R$ 0.50%n", moedas);
        valor %= 50.0;

        moedas = (int)valor / 25;
        System.out.printf("%d moedas(s) de R$ 0.25%n", moedas);
        valor %= 25.0;

        moedas = (int)valor / 10;
        System.out.printf("%d moedas(s) de R$ 0.10%n", moedas);
        valor %= 10.0;

        moedas = (int)valor / 5;
        System.out.printf("%d moedas(s) de R$ 0.05%n", moedas);
        valor %= 5.0;

        moedas = (int)valor;
        System.out.printf("%d moedas(s) de R$ 0.01%n", moedas);
        valor %= 1.0;
    }
}