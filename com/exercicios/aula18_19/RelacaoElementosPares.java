package com.exercicios.aula18_19;

import java.util.Scanner;

public class RelacaoElementosPares {
    public static void main(String[] args) {
        /*
        Criar um vetor A com 10 elementos inteiros. Escreva um programa que
        imprima cada elemento do vetor A e a relação de todos os pares de 0
        até o respectivo elemento.
        */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe os elementos na seguinte posição " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();
        }

        for (int i : vetorA) {
            System.out.println("Analizando o número " + i);

            for (int j = 2; j < i; j++) {
                if (j % 2 == 0) {
                    System.out.println(j + " é par");
                }
            }

            System.out.println();
        }
    }
}
