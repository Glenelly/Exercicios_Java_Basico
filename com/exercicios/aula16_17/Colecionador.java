package com.exercicios.aula16_17;

import java.util.Scanner;

public class Colecionador {
    public static void main(String[] args) {
        /*
        Faça um programa que calcule o valor total investido por um colecionador na sua coleção de CDs e o
        valor médio gasto em cada um deles. O utilizador deverá informar a quantidade de CDs e o valor para em cada um.

        Algoritmo:

        — Informar a quantidade de CDs
        — Informar o valor de cada um (no laço for)
        — Soma o valor total (dentro do for)
        — Calcular a média (Fora do for)
        — Informar o valor total investido
        — Informar valor médio gasto em cada um deles
        */

        Scanner scan = new Scanner(System.in);

        //Variaveis
        int quantidadeCD;
        double valorCD;
        double soma = 0;
        double media;

        //Informando a quantidade de CDs
        System.out.println("Informe a quantidade de CD's: ");
        quantidadeCD = scan.nextInt();

        //acrescentar enquanto o i for menor ou igual a quantidadeCD
        for(int i = 1; i <= quantidadeCD; i++){

            //Informar o valor dos CDs
            System.out.println("Informe o valor de cada CD: " + i);
            valorCD = scan.nextDouble();

            //Somando o valor total
            soma += valorCD;
        }
        //Informando a média de preços
        media = soma / quantidadeCD;

        //Exibindo resultado
        System.out.println("O valor total investido foi de: " + soma);
        System.out.println("O valor médio gasto em cada um deles foi de: " + media);
    }
}
